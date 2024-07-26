
class Movies
{
	public static void main(String[] args){

	
		System.out.println("start main in movies");
		
				String movie1="googly";
				String movie2="ramachari";
				String movie3="ayya";
				String movie4="gaja";
				String movie5="abhay";
				String movie6="arjun";
				String movie7="kempegouda";
				String movie8="kalasipalya";
				String movie9="aajay";
				String movie10="abhi";
				String movie11="arasu";
				String movie12="chiru";
				String movie13="power";
				String movie14="milana";
				String movie15="akash";
				String movie16="jaki";
				String movie17="mungaru male";
				String movie18="musanjematu";
				String movie19="vanshi";
				String movie20="ram";
String[] movies={movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15,movie16,movie17,movie18,movie19,movie20};
		
		for(int name=0;name<movies.length;name++)
		{
	String ref=movies[name];
		System.out.println("movies:"+ref);
		}
		System.out.println("reverse movie names");
		for(int name=movies.length-1;name>=0;name--)
		{
			String ref=movies[name];
			System.out.println("movies:"+ref);
		}
		System.out.println("total lenght of movienames :"+movies.length);
		System.out.println("end main in movie");
	}
	
}