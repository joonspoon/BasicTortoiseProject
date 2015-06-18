import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CryingLlama {

	CryingLlama() {
		File FileToRead = new File("/Users/Guest/Dropbox/LeagueStuff/league-sounds/llama.wav");
		playNoise(FileToRead);
	}


	public void playNoise(File soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CryingLlama();
	}

}
