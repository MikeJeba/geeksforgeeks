import java.util.*;
public class ValueIndex {

	public static void main(String[] args) {
		ValueIndex vi = new ValueIndex();
		int arr[] = {15,2,5,7,8};
		System.out.println(vi.valueEqualToIndex(arr, 5));
	}
	  public ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
	        // code here
		  ArrayList<Integer> res = new ArrayList<Integer>();
		  for(int i = 0; i < n; i++) {
			  if(i+1==arr[i]) {
				  res.add(i+1);
			  }
		  }
		  return res;
	        
	    }
}
