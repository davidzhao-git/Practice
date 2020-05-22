package self.study.designpattern.adapter;

public class Demo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "good.mp3");
		audioPlayer.play("vlc", "nice.vlc");
		audioPlayer.play("mp4", "hellothere.mp4");
		audioPlayer.play("dvd", "other.dvd");
	}

}
