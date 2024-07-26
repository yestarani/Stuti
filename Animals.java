class Animals
{
	public static void main(String[] args){

	
		System.out.println("start main in Animals");
		
				String animal1="cat";
				String animal2="dog";
				String animal3="lion";
				String animal4="tigera";
				String animal5="elephent";
				String animal6="ox";
				String animal7="cow";
				String animal8="zibra";
				String animal9="horse";
				String animal10="frog";
				String animal11="chita";
				String animal12="kangaroo";
				String animal13="camel";
				String animal14="rabita";
				String animal15="rat";
				String animal16="monkey";
				String animal17="snake";
				String animal18="ghendamruga";
				String animal19="bear";
				String animal20="pig";
				
String[] animals={animal1,animal2,animal3,animal4,animal5,animal6,animal7,animal8,animal9,animal10,animal11,animal12,animal13,animal14,animal15,animal16,animal17,animal18,animal19,animal20};
		
		for(int name=0;name<animals.length;name++)
		{
	String ref=animals[name];
		System.out.println("animals:"+ref);
		}
		System.out.println("reverse of animals");
		for(int name=animals.length-1;name>=0;name--)
		{
			String ref=animals[name];
			System.out.println("animals:"+ref);
		}
		System.out.println("total lenght of animalnames :"+animals.length);
		System.out.println("end main in Animals");
	}
	
}