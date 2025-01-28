public class Main{
	public static void main(String[] args){
		
		String[] cars = new String[3];

		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
		
		System.out.println("The cars arrays using slicing[] are: \n");
		for(int i = 0;i < cars.length; i++){
			System.out.println(cars[i]);
		}

		String[] animals = {"Dog","Cat","Lion","Tiger"};
		System.out.println("The animals without changing is: \n");
		for(int i = 0;i < animals.length; i++){
			System.out.println(animals[i]);
		}
		
		String animal_excluded = animals[0];
		animals[0] = "Giraffe";
		System.out.println("The first animal changed was: "+animal_excluded);
		System.out.println("The animal changed is: "+animals[0]);
	}
}
