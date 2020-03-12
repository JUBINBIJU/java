
class Holiday{

	private String name,month;
	private int day;

	Holiday(String n,int d,String m){

		name=n;
		day=d;
		month=m;
	}

	Holiday(){

		name="Independence Day";
		day=15;
		month="August";
	}

	boolean isInSameMonth(Holiday h){

		return month==h.month;
	}

	static double avgDate(Holiday H[]){

		double a=0;
		int c=0;
		for(Holiday h : H){
			a+=h.day;
			++c;
		}
		return a/c;
	}

}


public class HolidayDemo{

	public static void main(String[] args){

		Holiday h1=new Holiday();
		Holiday H[]=new Holiday[5];
		H[0]=new Holiday();
		H[1]=new Holiday();
		H[2]=new Holiday();
		H[3]=new Holiday();
		H[4]=new Holiday();
		System.out.println("Avg Date : "+ Holiday.avgDate(H)+"\n "+h1.isInSameMonth(H[0]));		
	}

}
