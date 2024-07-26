class Songs
{
public static void main(String[] args)
{
System.out.println("satrt main in Songs");
String name1="ninnindale";
String name2="ninu banda mele";
String name3="matte nodabeda";
String name4="modala maleyente";
String name5="nanna mele nanagiga";
String name6="shane top agavle";
String name7="belegeddu";
String name8="yarivalu";
String name9="handus up";
String name10="hige dura";


    String[] names={name1,name2,name3,name4,name5,name6,name7,name8,name9,name10};
	
   for( int song=0;song<names.length;song++)
{
	String ref=names[song];
	System.out.println("song:"+ref);
}
System.out.println("reverse song names");
for(int song=names.length-1;song>=0;song--)
{
	String ref=names[song];
	System.out.println("song:"+ref);
}
System.out.println("total length of songnames:"+names.length);
System.out.println("end main in songs");
	
}
}
