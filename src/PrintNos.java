import java.util.*;
public class PrintNos {
	public static void main(String[] args) {
		PrintNos pn = new PrintNos();
		pn.printNos(5);
	}
	public void printNos(int N)
    {
        //Your code here
        for(int i = 1;i <= N; i++) {
        	System.out.print(i + " ");
        }
    }
}
