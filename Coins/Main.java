import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//500�~�ʂ̐�
		int FH = sc.nextInt();
		//100�~�ʂ̐�
		int OH = sc.nextInt();
		//50�~�ʂ̐�
		int FIF = sc.nextInt();
		//���v�l
		int SUM = sc.nextInt();
		//�p�^�[��
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
