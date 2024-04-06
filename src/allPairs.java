import java.util.*;

class allPairs{
	public static void main(String[] args) {
		allPairs ap = new allPairs();
		System.out.println("Result: " +ap.seriesSum(5));
	}
	public static long seriesSum(int n) {
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum = sum + i;
		}
		
        // code here
		return sum;
    }
}