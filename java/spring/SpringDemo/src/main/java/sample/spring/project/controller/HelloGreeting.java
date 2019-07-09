package sample.spring.project.controller;

public class HelloGreeting {
	
	private final long id;
	private final String content;
	
	public HelloGreeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

}
