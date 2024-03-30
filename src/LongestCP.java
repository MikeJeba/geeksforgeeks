import java.util.*;
public class LongestCP {
	public static void main(String[] args) {
		LongestCP lc = new LongestCP();
		String[] arr = {"greeks","gres"};
		System.out.println("Output: " + lc.longestCommonPrefix(arr, 2));
	}
	public String longestCommonPrefix(String[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }
        
        // Take the first string as the initial prefix
        String prefix = arr[0];
        
        // Iterate through the remaining strings
        for (int i = 1; i < n; i++) {
        	
            while (arr[i].indexOf(prefix) != 0) {
            	System.out.println("Hi: "+arr[i].indexOf(prefix));
                // Shorten the prefix until it matches the beginning of arr[i]
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) {
                    // If the prefix becomes empty, there's no common prefix
                    return "-1";
                }
            }
        }
        
        return prefix;
}
}
