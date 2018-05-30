import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int mul = a * b;     
      
        if((mul % 2) == 1) 	System.out.print("Odd");
      	else				System.out.print("Even");
    }
}
