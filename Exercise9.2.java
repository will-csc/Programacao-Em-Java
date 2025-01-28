import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\nEnter a text: ");
		String text = in.nextLine();

		int[] result = letterHist(text);
		char[] letters = new char[26];
		char letter = 'a';

		int i = 0;
		while(letter <= 'z'){
			letters[i] = letter;
			letter++;
			i++;
		};

		System.out.println(Arrays.toString(letters));	
		System.out.println(Arrays.toString(result));	
	}
	public static int[] letterHist(String text){
		int[] histogram = new int[26];
		text = text.toLowerCase();

		for(char c : text.toCharArray()){
			if(c >= 'a' && c <= 'z'){
				int index = c - 'a';
				histogram[index]++;
			}
		}
		return histogram;
	}
}
