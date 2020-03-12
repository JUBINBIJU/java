
class Movie{

	private String title,studio,rating;
	Movie(){

		title="abc";
		studio="xyz";
		rating="PG";
	}

	Movie(String t,String s,String r){

		title=t;
		studio=s;
		rating=r;
	}

	Movie(String t,String s){

		this(t,s,"PG");
	}

	public static Movie[] getPG(Movie[] movies){

		Movie[] pg=new Movie[4];
		int count=0;
		for(Movie m:movies){
			if(m.rating=="PG")
				pg[count++]=new Movie(m.title,m.studio,"PG");
		}
		return pg;
	}

	static public String display(Movie m[]){

		String s="";
		System.out.println(1);
		for(Movie i:m)
			s+=("\nTITLE : "+i.title+" STUDIO : "+i.studio+" RATING : "+i.rating);
		return s;
	}

	//public String toString()

}


public class MovieDemo{

	public static void main(String[] args){

		System.out.println(EmployeeDemo.empvar);
		String arr[]={"hello"};
		EmployeeDemo.main(arr);
		Movie mv=new Movie();
		Movie mvs[]=new Movie[5];
		for(int i=0;i<4;i++){
			mvs[i]=new Movie();
		}
		mvs[4]=new Movie("abc","xyz","PG-R");
		System.out.println(Movie.display(Movie.getPG(mvs)));
	}

}
