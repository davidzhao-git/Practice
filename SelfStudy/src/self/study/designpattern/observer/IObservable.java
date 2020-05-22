package self.study.designpattern.observer;

public interface IObservable {
	
	void attach(Investor investor);
	void detach(Investor investor);
	void notifyObervers();

}
