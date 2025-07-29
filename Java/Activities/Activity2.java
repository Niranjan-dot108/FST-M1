package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// Given array
		int[] numArr = {10,77,10,54,-11,10};
		System.out.println("Original Array: " + Arrays.toString(numArr));
		
		// Total Sum of 10's
		int sum =0;
		
//		int searchNum = 10;
//        int fixedSum = 30;
//        
//        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
		
		// iteerate through the array, finding 10's
		for (int num: numArr) {
			// Check if the num is 10
			if (num ==10){
				// Add value to sum
				sum+=num;
			}
		   // To prevent extra iterations
			if(sum >30) {
				break;
			}
      
	}

		// Check the Sum value
		if(sum == 30) {
			System.out.println("Sum value is  "+sum);
		}
		else {
			System.out.println("Sum value is not 30");
		}
}
}
