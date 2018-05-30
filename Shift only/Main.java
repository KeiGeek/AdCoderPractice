import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力される整数の数
		int inputNum= sc.nextInt();
		//カウンタ
		int count = 0;
		//正の整数配列/
      	long numArray[]  = new long[inputNum];
		
		//正の整数を格納
		for(int i = 0; i < inputNum; i++) numArray[i] = sc.nextInt();

		//商が奇数になるまでループ
LOOP:	while(true){
			for(int i = 0; i < inputNum; i++){
				if( 1 == numArray[i] % 2) break LOOP;
				numArray[i] = numArray[i] / 2;
			}
			count++;
		}
		System.out.print(count);
    }
}
