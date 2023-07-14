package Lab7;

public interface Playable {
	public void play();
}
class Guitar implements Playable{
	public void play() {
		System.out.println("Guitar is playing");
		
	}
	
}
class Piano implements Playable{
	public void play() {
	
		System.out.println("Piano is playing");
	}
	
}