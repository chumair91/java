public class Main{
public static void main(String[] args){

Artist actor=new Artist("john wick");

Artwork art1=new Artwork("movie",2002,actor);
Artwork art2=new Artwork(art1);

}
}