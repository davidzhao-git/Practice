package self.study.designpattern.observer;

public abstract class Investor implements IObserver {
	
	private String entityName;

	public Investor(String entityName) {
		this.entityName = entityName; 
	}
	
	@Override
	public void update() {
		System.out.print("Hello, " + entityName + ". Your portfolio summary: "); 
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

}
