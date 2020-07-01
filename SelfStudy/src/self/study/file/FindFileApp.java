package self.study.file;

import java.io.File;

public class FindFileApp {

	public static void main(String[] args) {
		
		String name = "swap_num.py"; 
		// String directory = "C:\\Users\\Jian\\Desktop";
		
		String directory = "C:\\Users\\Jian\\Desktop";
		findFile(name, new File(directory));
	}
	
	public static void findFile(String name, File file) {
		File[] fileArr = file.listFiles();
		if (fileArr != null) {
			for (File theFile : fileArr) {
				if (theFile.isDirectory()) {
					findFile(name, theFile);
				}
				else if (name.equalsIgnoreCase(theFile.getName())) {
					System.out.println(theFile.getParentFile()); 
				}
			}
		}
	}
	
	

}
