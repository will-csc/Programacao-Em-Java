public class SimpleDotComTestDrive{
	public static void main(String[] args){
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = {2,3,4};
		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";

		if(result.equals("hit")){
			testResult = "passed";
		}
		System.out.println(testResult);
	}
}
class SimpleDotCom {
    private int[] locations;

    public void setLocationCells(int[] loc) {
        this.locations = loc;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        for (int cell : locations) {
            if (cell == guess) {
                return "hit";
            }
        }
        return "miss";
    }
}
