import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int rows,columns;
		String symbol = "";

		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use");
		symbol = scanner.next();

		for(int i = 1;i <= rows;i++){
			System.out.println();
			for(int j = 1;j <= columns;j++){
				System.out.print(symbol);
			}
		}
	}
}
