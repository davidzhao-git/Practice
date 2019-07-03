package find.job.title;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

// make sure have dependency in pom.xml
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TitleService {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TitleService.class);
	private final static String SUGGESTED_JOB_TITLE_KEY = "suggestion";
	private final static String API_URL_FORMAT = "http://api.dataatwork.org/v1/jobs/autocomplete?contains=\"%s\"";
	
	public List<JobTitle> getJobTitleList(String keyword) throws Exception {
		
		if (keyword == null || keyword.isEmpty()) {
			throw new IllegalArgumentException("Keyword is blank.");
		}
		
		// format API URL with parameter
		String encodedKeyword = URLEncoder.encode(keyword, StandardCharsets.UTF_8.name());
		String apiWebResource = String.format(API_URL_FORMAT, encodedKeyword);
		LOGGER.info("API request: " + apiWebResource);
		
		// send a request to the web server and obtain a connection
		HttpURLConnection connection = sendHttpRequest(apiWebResource);
		
		// check whether HTTP response status code is OK
		int status = connection.getResponseCode();
		if (status != HttpURLConnection.HTTP_OK) {
			throw new IllegalStateException("Server responses with " + status);
		}
		
		// read the response
		return readResponse(connection);
	}
	
	private HttpURLConnection sendHttpRequest(String apiWebResource) throws IOException {
		URL url = new URL(apiWebResource);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		
		return conn;
	}

	private void logErrorMessage(HttpURLConnection connection) throws IOException {
		try (BufferedReader bufferReader = new BufferedReader(
				new InputStreamReader(connection.getErrorStream()))) {
			String line;
			while ((line = bufferReader.readLine()) != null) {
				LOGGER.error("Line: " + line);
			}
		}
	}
	
	private List<JobTitle> readResponse(HttpURLConnection connection) throws IOException {
		LinkedList<JobTitle> jobTitleList = new LinkedList<JobTitle>();
		try (InputStream input = connection.getInputStream();
				JsonReader jReader = Json.createReader(input)) {
			JsonArray jsonArray = jReader.readArray();
			for (int i = 0; i < jsonArray.size(); i++) {
				JsonObject jObj = (JsonObject) jsonArray.get(i);
				String title = jObj.getString(SUGGESTED_JOB_TITLE_KEY);
				LOGGER.debug("Title suggested: " + title);
				if (title != null && !title.isEmpty()) {
					jobTitleList.add(new JobTitle(title));
				}
				
			}
		}
		
		return jobTitleList;
	}
	

}
