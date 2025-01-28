import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<String> food = new ArrayList<String>();

		food.add("pizza");
		food.add("hamburguer");
		food.add("hotdog");

		food.set(0,"sushi");
		food.remove(2);
		food.clear();

		//Printing the array list
		for(int i = 0; i < food.size(); i++){
			System.out.println(food.get(i));
		}
	}
}
		
