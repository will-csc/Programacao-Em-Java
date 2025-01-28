public class Main{
	public static void main(String [] args){
		double[] a = new double[3];
		double[] b = a; //Creates two references to an array
		
		a[1] = 10.5;
		System.out.println("\nThe 'a[1]' has the value of: "+a[1]);
		b[1] = 564.98;
		System.out.println("\nThe 'a[1]' after changing the value of 'b[1]' has the value of: "+a[1]);
	}
}
