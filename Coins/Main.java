import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//500円玉の数
		int FH = sc.nextInt();
		//100円玉の数
		int OH = sc.nextInt();
		//50円玉の数
		int FIF = sc.nextInt();
		//合計値
		int SUM = sc.nextInt();
		//パターン
		int cnt = 0;

		for(int i = 0; i <= FH; i++){
			for(int j = 0; j <=OH ; j++){
				for(int k = 0; k <= FIF; k++){
					if(SUM == 500 * i + 100 * j + 50 * k) cnt++;
				}
			}
		}

		System.out.print(cnt);
    }
}
