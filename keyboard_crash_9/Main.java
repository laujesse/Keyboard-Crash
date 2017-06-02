package keyboard_crash_9;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main extends KeyboardCrash{

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	public static int songCount = 0;
	
	public static void main(String[] args){
		
		JFrame F = new JFrame("Keyboard Crash");
		
	    try {
	    	F.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/Users/s170717/Documents/eclipse-neon2/Keyboard Crash/src/images/introBackground(Title).jpg")))));
	    } catch(IOException e)
	    {
	    	System.out.println("Image doesn't exist");
	    }
		
		F.setUndecorated(false);
		F.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		F.setResizable(false);
		F.setLocationRelativeTo(null);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setLayout(null);
		new KeyboardCrash();

		
		ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/playButtonEntered.png"));
		ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/playButtonBasic.png"));
		ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
		ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
		ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png"));
		ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png"));
		ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/rightButtonEntered.png"));
		ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png"));
		ImageIcon levelStartBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
		ImageIcon levelStartEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
		
		
		JButton startButton = new JButton(startButtonBasicImage);
		JButton quitButton = new JButton(quitButtonBasicImage);
		JButton leftButton = new JButton(leftButtonBasicImage);
		JButton rightButton = new JButton(rightButtonBasicImage);
		JButton playButton = new JButton(levelStartBasicImage);
		
		
		ImageIcon theLostDedicatedStartImage = new ImageIcon(Main.class.getResource("../images/The Lost Dedicated Start Image.png"));
		JButton theLostDedicatedStartButton = new JButton(theLostDedicatedStartImage);
		ImageIcon theLostDedicatedTitleImage = new ImageIcon(Main.class.getResource("../images/The Lost Dedicated Title Image.png"));
		JButton theLostDedicatedTitleButton = new JButton(theLostDedicatedTitleImage);
		ImageIcon NeruStartImage = new ImageIcon(Main.class.getResource("../images/Neru - Ningen Shikkaku Start Image.jpg"));
		JButton NeruStartButton = new JButton(NeruStartImage);
		ImageIcon NeruTitleImage = new ImageIcon(Main.class.getResource("../images/Neru - Ningen Shikkaku Title Image.png"));
		JButton NeruTitleButton = new JButton(NeruTitleImage);
		ImageIcon XinYueBingBingStartImage = new ImageIcon(Main.class.getResource("../images/XinYueBingBing -Tsun Neko no Waltz Start Image.jpg"));
		JButton XinYueBingBingStartButton = new JButton(XinYueBingBingStartImage);
		ImageIcon XinYueBingBingTitleImage = new ImageIcon(Main.class.getResource("../images/XinYueBingBing -Tsun Neko no Waltz Title Image.png"));
		JButton XinYueBingBingTitleButton = new JButton(XinYueBingBingTitleImage);
		

		int nowSelected = 0;
		
		
		startButton.setBounds(40, 200, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				enterMain();//stops the intro music from playing	
			    try {
					F.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/Users/s170717/Documents/eclipse-neon2/Keyboard Crash/src/images/mainBackground2.jpg")))));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    theLostDedicatedStartButton.setVisible(true);
			    theLostDedicatedStartButton.setBounds(400, 200, 480, 360);
			    theLostDedicatedStartButton.setBorderPainted(false);
			    theLostDedicatedStartButton.setContentAreaFilled(false);
			    theLostDedicatedStartButton.setFocusPainted(false);
			    
				F.add(theLostDedicatedStartButton);
				
				theLostDedicatedTitleButton.setVisible(true);
				theLostDedicatedTitleButton.setBounds(360, 70, 600, 120);
				theLostDedicatedTitleButton.setBorderPainted(false);
				theLostDedicatedTitleButton.setContentAreaFilled(false);
				theLostDedicatedTitleButton.setFocusPainted(false);
				    
			    F.add(theLostDedicatedTitleButton);
					
			    NeruStartButton.setVisible(false);
			    NeruStartButton.setBounds(400, 200, 480, 360);
			    NeruStartButton.setBorderPainted(false);
				NeruStartButton.setContentAreaFilled(false);
				NeruStartButton.setFocusPainted(false);
			    F.add(NeruStartButton);
			    
			    NeruTitleButton.setVisible(false);
			    NeruTitleButton.setBounds(360, 70, 600, 120);
			    NeruTitleButton.setBorderPainted(false);
			    NeruTitleButton.setContentAreaFilled(false);
			    NeruTitleButton.setFocusPainted(false);
				    
			    F.add(NeruTitleButton);
			    
			    XinYueBingBingStartButton.setVisible(false);
			    XinYueBingBingStartButton.setBounds(400, 200, 480, 360);
			    XinYueBingBingStartButton.setBorderPainted(false);
			    XinYueBingBingStartButton.setContentAreaFilled(false);
			    XinYueBingBingStartButton.setFocusPainted(false);
			    F.add(XinYueBingBingStartButton);
			    
			    XinYueBingBingTitleButton.setVisible(false);
			    XinYueBingBingTitleButton.setBounds(360, 70, 600, 120);
			    XinYueBingBingTitleButton.setBorderPainted(false);
			    XinYueBingBingTitleButton.setContentAreaFilled(false);
			    XinYueBingBingTitleButton.setFocusPainted(false);
				    
			    F.add(XinYueBingBingTitleButton);
			    
			    leftButton.setVisible(true);
				leftButton.setBounds(140, 310, 60, 60);
				leftButton.setBorderPainted(false);
				leftButton.setContentAreaFilled(false);
				leftButton.setFocusPainted(false);
				leftButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						leftButton.setIcon(leftButtonEnteredImage);
						leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
						Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
						buttonEnteredMusic.start();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						leftButton.setIcon(leftButtonBasicImage);
						leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
						buttonEnteredMusic.start();
						selectLeft();
						songCount --;
						if (Math.abs(songCount) % 3 == 1)
						{
							theLostDedicatedStartButton.setVisible(false);
							theLostDedicatedTitleButton.setVisible(false);
							NeruStartButton.setVisible(true);
							NeruTitleButton.setVisible(true);
							XinYueBingBingStartButton.setVisible(false);
							XinYueBingBingTitleButton.setVisible(false);
						}
						else if (Math.abs(songCount) % 3 == 2)
						{
							theLostDedicatedStartButton.setVisible(false);
							theLostDedicatedTitleButton.setVisible(false);
							NeruStartButton.setVisible(false);
							NeruTitleButton.setVisible(false);
							XinYueBingBingStartButton.setVisible(true);
							XinYueBingBingTitleButton.setVisible(true);
						}
						else if (Math.abs(songCount) % 3 == 0)
						{
							theLostDedicatedStartButton.setVisible(true);
							theLostDedicatedTitleButton.setVisible(true);
							NeruStartButton.setVisible(false);
							NeruTitleButton.setVisible(false);
							XinYueBingBingStartButton.setVisible(false);
							XinYueBingBingTitleButton.setVisible(false);
						}
					}
				});
				F.add(leftButton);

				rightButton.setVisible(true);
				rightButton.setBounds(1080, 310, 60, 60);
				rightButton.setBorderPainted(false);
				rightButton.setContentAreaFilled(false);
				rightButton.setFocusPainted(false);
				rightButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						rightButton.setIcon(rightButtonEnteredImage);
						rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
						Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
						buttonEnteredMusic.start();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						rightButton.setIcon(rightButtonBasicImage);
						rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
						buttonEnteredMusic.start();
						selectRight();
						songCount ++;
						if (Math.abs(songCount) % 3 == 1)
						{
							theLostDedicatedStartButton.setVisible(false);
							theLostDedicatedTitleButton.setVisible(false);
							NeruStartButton.setVisible(false);
							NeruTitleButton.setVisible(false);
							XinYueBingBingStartButton.setVisible(true);
							XinYueBingBingTitleButton.setVisible(true);
						}
						else if (Math.abs(songCount) % 3 == 2)
						{
							theLostDedicatedStartButton.setVisible(false);
							theLostDedicatedTitleButton.setVisible(false);
							NeruStartButton.setVisible(true);
							NeruTitleButton.setVisible(true);
							XinYueBingBingStartButton.setVisible(false);
							XinYueBingBingTitleButton.setVisible(false);
						}
						else if (Math.abs(songCount) % 3 == 0)
						{
							theLostDedicatedStartButton.setVisible(true);
							theLostDedicatedTitleButton.setVisible(true);
							NeruStartButton.setVisible(false);
							NeruTitleButton.setVisible(false);
							XinYueBingBingStartButton.setVisible(false); 
							XinYueBingBingTitleButton.setVisible(false);
						}
					}
				});
				F.add(rightButton);
				
				playButton.setVisible(true);
				playButton.setBounds(515, 580, 250, 67);
				playButton.setBorderPainted(false);
				playButton.setContentAreaFilled(false);
				playButton.setFocusPainted(false);
				playButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						playButton.setIcon(levelStartEnteredImage);
						playButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
						Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
						buttonEnteredMusic.start();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						playButton.setIcon(levelStartBasicImage);
						playButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
						buttonEnteredMusic.start();
						gameStart(nowSelected, "hard");
					}
				});
				F.add(playButton);
				F.setVisible(true);
				
			}});
		F.add(startButton);
		
		quitButton.setBounds(40, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		F.add(quitButton);
		
		
		F.setVisible(true);
		

	}
	
	
}


