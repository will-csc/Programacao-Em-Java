public class Main{
	public static void main(String[] args){
		String day = "Saturday";
		String month = "July";
		int date = 22;
		int year = 2015;
		
		System.out.println("American format:");
		printAmerican(day,month,date,year);
		
		System.out.println("European format:");
		printEuropean(day,month,date,year);
	}
	public static void printAmerican(String day,String month,int date,int year){
		System.out.println(day + ", " + month + " " + month + ", " + year);
	}
	public static void printEuropean(String day,String month,int date,int year){
		System.out.println(day + " " + date + " " + month + " " + year);
	}
}
