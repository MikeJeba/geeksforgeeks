import java.util.*;
public class PrintAlternate {

	public static void main(String[] args) {
		PrintAlternate pa = new PrintAlternate();
		int arr[] = {1,2,3,4};
		//System.out.println("What is : ");
		pa.print(arr,4);
	}
	public static void print(int arr[], int n)
    {
		for(int i = 0; i < n; i += 2) {
			System.out.println(arr[i] + " ");
		}
		
}
}
