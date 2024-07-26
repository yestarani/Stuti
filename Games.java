class Games
{
public static void main(String[] args)
{
System.out.println("satrt main in games");
String game1="ludo";
String game2="candicrush";
String game3="temple run";
String game4="ches";
String game5="subsurfsad";
String game6="caram";
String game7="snakeladder";
String game8="walliball";
String game9="haki";
String game10="karate";


    String[] games={game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};
	
   for( int game=0;game<games.length;game++)
{
	String ref=games[game];
	System.out.println("games:"+ref);
}
System.out.println("reverse of the games");
for(int game=games.length-1;game>=0;game--)
{
	String ref=games[game];
	System.out.println("games"+ref);
}
System.out.println("total length of gamenames:"+games.length);
System.out.println("end main in games");
	
}
}
