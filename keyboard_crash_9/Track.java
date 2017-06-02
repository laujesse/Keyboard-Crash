package keyboard_crash_9;

public class Track {

	private String titleImage; 
	private String startImage;
	private String startMusic; 

	
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	
	public Track(String titleImage, String startImage, String startMusic) {
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.startMusic = startMusic;
		
	}
	
}
