import java.util.ArrayList;
public class Leaders {

    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        
        // Initialize the maximum element encountered so far as the rightmost element.
        int maxRight = arr[n - 1];
        
        // The rightmost element is always a leader.
        result.add(maxRight);
        
        // Traverse the array from right to left.
        for (int i = n - 2; i >= 0; i--) {
            // If the current element is greater than or equal to the maximum element
            // encountered so far (maxRight), it is a leader.
            if (arr[i] >= maxRight) {
                // Update maxRight to the current element.
                maxRight = arr[i];
               
                // Add the current element to the result.
                result.add(maxRight);
            }
        }
        
        // Reverse the result array to maintain the order of appearance.
        // Since we traversed from right to left, the leaders will be added in reverse order.
        // Reversing the result will bring them back to their original order.
        ArrayList<Integer> reversedResult = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
        	System.out.println((result.get(i)));
        }
        
        return reversedResult;
    }
    
    // Main method for testing the solution
    public static void main(String[] args) {
        int[] arr1 = {16,17,4,3,5,2};
        int n1 = arr1.length;
        ArrayList<Integer> leaders1 = leaders(arr1, n1);
       System.out.println("Leaders in arr1: " + leaders1); // Output: [17, 5, 2]
        
//        int[] arr2 = {1,2,3,4,0};
//        int n2 = arr2.length;
//        ArrayList<Integer> leaders2 = leaders(arr2, n2);
//        System.out.println("Leaders in arr2: " + leaders2); // Output: [4, 0]
    }
}
