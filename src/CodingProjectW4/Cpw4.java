package CodingProjectW4;

public class Cpw4 {

	public class CodingProject {

		public static void main(String[] args) {

			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			int result = ages[ages.length - 1] - ages[0];
			System.out.println(result);
		
			int[] ages2 = {44, 95, 223, 614, 12, 58, 78, 13};
			int result2 = ages2[ages2.length - 1] - ages2[0];
			System.out.println(result2);
		
		/* iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		As you can see, by using the `length` property of the array and subtracting 1 from it, we can dynamically access the last element of an array, regardless of its length. */ 
		
		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			
		//I made a for loop to iterate through each element in ages and added it to sum. 
		// After the loop, I divided the sum by the length of the array to get the average.
			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
			    sum += ages[i];
			}
			
		// I used type casting to change the result of 'sum' to a double allowing the change for a decimal.
			double averageAge = (double) sum / ages.length;
			System.out.println("The average age is: " + averageAge);
			
			
			 

	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

		int totalLetters = 0;
		for (String name : names) {
	    totalLetters += name.length();
	    }
	    
	    double averageLetters = (double) totalLetters / names.length;
	    
	    System.out.println("The average number of letters per name is: " + averageLetters);

	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

	    // Made and Empty String named concatenatedNames. Made a For each Loop labeling each element (name). Then set it equal to itself + the space.
	    String concatenatedNames = "";
	    for (String name : names) {
	        concatenatedNames += name + " ";
	    }

	    System.out.println("The concatenated names are: " + concatenatedNames);

	//3. How do you access the last element of any array?

	    // AWNSER:  call to directly or, array[array.length - 1]

	//4. How do you access the first element of any array?

	    // AWNSER: array[0]

	//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

	    // Make the nameLengths array, followed up with a iterating for loop. Then return each index within the names Array
	    int[] nameLengths = new int[names.length];

	    for (int i = 0; i < names.length; i++) {
	        nameLengths[i] = names[i].length();
	    }
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

	    int sumLengths = 0;

	    for (int i = 0; i < nameLengths.length; i++) { 
	        sumLengths += nameLengths[i];
	    }

	    System.out.println("The sum of all the elements is: " + sumLengths);

		}

	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

	    public static String concatenateWord(String word, int n) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < n; i++) {
	            result.append(word); // Method used to add/concatenate.
	        }

	        return result.toString(); // Method used to return a regular String result.
	    }

	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

	    public static String fullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

	    public static boolean greaterThanSum(int[] array) { //Boolean type method.
	        int sum = 0;
	        
	        for (int num : array) { //For each loop.
	            sum += num;
	        }
	        
	        return sum > 100; //Ends at 100.
	    }

	//10. Write a method that takes an array of double and returns the average of all the elements in the array.

	    public static double calculateAverage(double[] array) { //Double type Method
	        double sum = 0;
	        
	        for (double num : array) { //For each Loop.
	            sum += num;
	        }
	        
	        return sum / array.length; //Getting average.
	    }

	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

	    public static boolean greaterAverage(double[] array1, double[] array2) { //Boolean type Method, create both arrays.
	        double sum1 = 0; //Setting variables.
	        double sum2 = 0;
	        
	        for (double num : array1) { //For each loops.
	            sum1 += num;
	        }
	        
	        for (double num : array2) { //^^^
	            sum2 += num;
	        }
	        
	        double average1 = sum1 / array1.length; //Calculating Averages.
	        double average2 = sum2 / array2.length;
	        
	        return average1 > average2; //Returns results.
	    }

	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //Boolean type Method, creates variables.
	        if (isHotOutside && moneyInPocket > 10.50) { // Created if-else statement.
	            return true;
	        } else {
	            return false;
	        }
	    }

	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.


	    public static String checkWeather(boolean isRaining, boolean hasThunderstorms, boolean isHumid, double temperature) {
	        if (isRaining && hasThunderstorms && !isHumid && temperature >= 50 && temperature <= 70) {
	            return "I will be happy.";
	        } else {
	            return "I'm depressed."; 
	        }
	    }
			
		//I created this method because it's currently raining && I love rain so why not make a method to check the weather which will ultimately decide my mood!
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
}
