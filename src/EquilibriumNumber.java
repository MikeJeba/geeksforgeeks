import java.util.*;
public class EquilibriumNumber {
	public static void main(String[] args) {
		EquilibriumNumber en = new EquilibriumNumber();
		long[] ar = {1,3,5,2,2};
		System.out.println(en.equilibriumPoint(ar, 5));
	}
	public static int equilibriumPoint(long arr[], int n) {

        // Your code here
		long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                // Adding 1 to convert from 0-based indexing to 1-based indexing
                return i + 1;
                
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
