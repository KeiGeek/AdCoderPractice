import java.util.*;
import java.lang.String;
import java.lang.Object;
 
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
      	String str = sc.next();
		String[]  array = str.split("");
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) sum += Integer.valueOf(array[i]);
 
		System.out.print(sum);
    }
}