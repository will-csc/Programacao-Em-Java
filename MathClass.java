public class Main{
	public static void main(String[] args){
		double x = 3.14;
		double y = -10;

		double max_value = Math.max(x,y);
		System.out.println("The maximum value of x and y are: "+max_value);
		
		double abs_value = Math.abs(y);
		System.out.println("The abs value of y are: "+abs_value);

		double square_value = Math.sqrt(x);		
		System.out.println("The square value of x are: "+square_value);

		double round_value = Math.round(x);
		System.out.println("The round value of x are: "+round_value);

		double ceil_value = Math.ceil(y);
		System.out.println("The ceil value of y are: "+ceil_value);

		double floor_value = Math.floor(y);
		System.out.println("The floor value of y are: "+floor_value);
	}
}

