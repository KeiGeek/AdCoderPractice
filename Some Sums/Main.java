import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Main ma = new Main();
		Scanner sc = new Scanner(System.in);

		//入力される整数の数
		int MAX = sc.nextInt();
		//下限値
		int LOW = sc.nextInt();
		//上限値
		int HIGH = sc.nextInt();
		//各桁の和
		int tmp = 0;
		//総和
		int sum = 0;

		for(int i = 1; i <= MAX; i++){
			tmp = ma.divsum(i);
          	//LOW < 各桁の和 < HIGHの場合の総和
			if(tmp >= LOW && tmp <= HIGH) sum += i;
		}

		System.out.println(sum);
	}

	public int divsum(int value){
		int sum = 0;

		while(0 != value){
			//下1桁を加算
			sum += value % 10;
			//桁落ちさせる
			value /= 10;
		}

		return sum;
	}
}

