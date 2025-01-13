public class PlayersHeightComparison{
	//Create method to Generate Random Values
	public int randomNumber() {
		return (int) (Math.random() * 100 + 150); // returns a random number between 150 and 250
	}

	//Create method for calculate sum of all element(height) present in array
	public int sumOfHeight(int[] heights) {
		int sum = 0;
		for (int i = 0; i < heights.length; i++) { 
			sum += heights[i];
		}
		return sum;
	}
 
	//Create method for calculate mean Height of the players 
	public int meanHeight(int[] heights) {
		int sum = sumOfHeight(heights);
		return sum / heights.length; 
	}

	//Create method for find shortest height of the players
	public int shortestHeight(int[] heights) {
		int min = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] < min) { // check if the current element is smaller than the current minimum
			min = heights[i]; // update the minimum if necessary
		}
	  }
		return min;
	}
   
	//Create method for tallest height of the players
	public int tallestHeight(int[] heights) {
		int max = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > max) { // check if the current element is larger than the current maximum
			max = heights[i]; // update the maximum if necessary
		}
	  }
		return max;
	}
 
	//main method 
	public static void main(String[] args) {

		PlayersHeightComparison players = new PlayersHeightComparison();
		int[] heights = new int[11];

		for (int i = 0; i < 11; i++) {
		// generate 11 random heights
		heights[i] = players.randomNumber(); 
		}

		System.out.println("The heights of the players are: ");
		for (int i = 0; i < 11; i++) {
		// print the heights
		System.out.println("Player " + (i + 1) + " is " + heights[i] + " cm tall. "); 
		}

		//Calling all the methods and Print them
		System.out.println("The mean height is: " + players.meanHeight(heights));
		System.out.println("The mean shortest height is: " + players.shortestHeight(heights));
		System.out.println("The mean tallest height is: " + players.tallestHeight(heights));
	}
}