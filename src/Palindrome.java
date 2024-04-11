import java.util.*;

public class Palindrome {
public static void main(String[] args) {
	Palindrome pal = new Palindrome();
	int[] arrs = {111,222,333,444,555};
	pal.palinArray(arrs, 5);
}
    public static int palinArray(int[] a, int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (!isPalindrome(a[i]))
                return 0;
        }
        return 1;
    }
    
    public static boolean isPalindrome(int num)
    {
        int reversedNum = 0, originalNum = num;
        
        while (num != 0)
        {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }
}
