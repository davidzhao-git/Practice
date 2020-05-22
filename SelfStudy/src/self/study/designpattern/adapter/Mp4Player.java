package self.study.designpattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
	}

	@Override
	public void playMp4(String fileName) {

		System.out.println("Playing Mp4 file: " + fileName);
	}

}
