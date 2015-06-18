import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class DeathKnell {
	public static void main(String[] args) {
		//playDeathKnell();
		Scanner s = new Scanner(System.in);
		int x = 0;
		//x = s.nextInt();
		System.out.println(s);
		/*int last = 0;
		int current = 1;
		int next = 0;
		
		for(int i = 0 ; i < 10; i++)
		{
			next = current + last;
			last = current;
			current = next;
			
			System.out.println(next);
			
			
		}*/
	}

	public static void playDeathKnell() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Guest/LeagueStuff/league-sounds/funeral-march.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(8400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
