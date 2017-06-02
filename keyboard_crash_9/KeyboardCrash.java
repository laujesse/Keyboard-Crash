package keyboard_crash_9;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyboardCrash extends JFrame {
	
	private static ArrayList<Track> trackList = new ArrayList<Track>();

	private static Image titleImage;
	private static Image selectedImage;
	private static Music selectedMusic;
	private static Music introMusic = new Music("IntroM.mp3", true);
	private static int nowSelected = 0;
	
	public KeyboardCrash() {
		
		introMusic.start();

		trackList.add(new Track("The Lost Dedicated Title Image.png", "The Lost Dedicated Start Image.png",
				 "The Lost Dedicated.mp3"));
		trackList.add(new Track("XinYueBingBing -Tsun Neko no Waltz Title Image.png", "XinYueBingBing -Tsun Neko no Waltz Start Image.jpg",
				 "XinYueBingBing -Tsun Neko no Waltz.mp3"));
		trackList.add(new Track("Neru - Ningen Shikkaku Title Image.png", "Neru - Ningen Shikkaku Start Image.jpg",
				 "Neru - Ningen Shikkaku.mp3"));
	}
		
	
	public static void selectTrack(int nowSelected) {
		if(selectedMusic != null)
			selectedMusic.close();
		titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage())).getImage();
		selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage())).getImage();
		selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(), true);
		selectedMusic.start();
	}
	
	public static void selectLeft() {
		if(nowSelected == 0)
			nowSelected = trackList.size() - 1;
		else
			nowSelected--;
		selectTrack(nowSelected);
	}
	
	public static void selectRight() {
		if(nowSelected == trackList.size() - 1)
			nowSelected = 0;
		else
			nowSelected++;
		selectTrack(nowSelected);
	}
	
	public static void gameStart(int nowSelected, String difficulty) {
		if(selectedMusic != null)
			selectedMusic.close();
		
	}
	
	public static void backMain(){
		selectTrack(nowSelected);
	}
	
	public static void enterMain(){
		introMusic.close();
		selectTrack(0);
		
	}

}
