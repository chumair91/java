public class Artist{
	String tname;
	Artist(){
		tname="John";
	}
	Artist(String name){
		tname=name;
	}
	//public String getName(){
	//	return tname;
	//}
	
	public void display(){
		System.out.println("artist name: "+tname);
	}
}