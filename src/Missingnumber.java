import java.util.*;
public class Missingnumber {
	public static void main(String[] args) {
		Missingnumber mn = new Missingnumber();
		int[] ar = {1,2,3,5};
		System.out.println("The final result: "+mn.missingNumber(ar, 5));
	}
    int missingNumber(int array[], int n) {
        // Your Code Here
         Arrays.sort(array);
        for(int i=0;i<n-1;i++){
        	int a = i + 1;
        	System.out.println("Inital: "+a);
            if(array[i]!=a)
            {
               System.out.println("Final: "+a);
               return a;
             }
        }
        return n ;
        
    }
}
