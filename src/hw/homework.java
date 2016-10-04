package hw;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lyrics = "Let it go!Let it go!Cannot hold it back anymore";
		
		System.out.println(lyrics);
		
		String changeher = lyrics.replace("it", "\"her\"");
		
		System.out.println(changeher);
		
		String changecannot = changeher.replace("Cannot", "can't");
		
		System.out.println(changecannot);
	}

}