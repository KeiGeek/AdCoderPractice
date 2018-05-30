import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Main ma = new Main();
		Scanner sc = new Scanner(System.in);

		//���͂���鐮���̐�
		int MAX = sc.nextInt();
		//�����l
		int LOW = sc.nextInt();
		//����l
		int HIGH = sc.nextInt();
		//�e���̘a
		int tmp = 0;
		//���a
		int sum = 0;

		for(int i = 1; i <= MAX; i++){
			tmp = ma.divsum(i);
          	//LOW < �e���̘a < HIGH�̏ꍇ�̑��a
			if(tmp >= LOW && tmp <= HIGH) sum += i;
		}

		System.out.println(sum);
	}

	public int divsum(int value){
		int sum = 0;

		while(0 != value){
			//��1�������Z
			sum += value % 10;
			//������������
			value /= 10;
		}

		return sum;
	}
}

