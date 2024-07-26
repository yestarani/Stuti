class Snacks
{
	public static void main(String[] args){

	
		System.out.println("start main in Snacks");
		
				String snacks1="gobimanchuri";
				String snacks2="bajji";
				String snacks3="bonda";
				String snacks4="palav";
				String snacks5="samosa";
				String snacks6="chips";
				String snacks7="figerchips";
				String snacks8="salad";
				String snacks9="dosa";
				String snacks10="idli";
				String snacks11="puri";
				String snacks12="masalrice";
				String snacks13="maggi";
				String snacks14="parota";
				String snacks15="yippi";
				String snacks16="panip[uri";
				String snacks17="masalapuri";
				String snacks18="bhelpuri";
				String snacks19="icecream";
				String snacks20="kurkure";
				String snacks21="gobi";
				      String snacks22="uppit";
				      String   snacks23="papad";
				String snacks24="chumuri";
				String snacks25="salad";
String[] snacks={snacks1,snacks2,snacks3,snacks4,snacks5,snacks6,snacks7,snacks8,snacks9,snacks10,snacks11,snacks12,snacks13,snacks14,snacks15,snacks16,snacks17,snacks18,snacks19,snacks20,snacks21,snacks22,snacks23,snacks24,snacks25};
		
		for(int name=0;name<snacks.length;name++)
		{
	String ref=snacks[name];
		System.out.println("snacks:"+ref);
		}
		System.out.println("reverse of the snacks");
		for(int name=snacks.length-1;name>=0;name--)
		{
			String ref =snacks[name];
			System.out.println("snacks:"+ref);
		}
		System.out.println("total lenght of snacknames :"+snacks.length);
		System.out.println("end main in Snacks");
	}
	
}