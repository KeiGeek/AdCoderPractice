import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//���͂���鐮���̐�
		int inputNum= sc.nextInt();
		//�J�E���^
		int count = 0;
		//���̐����z��/
      	long numArray[]  = new long[inputNum];
		
		//���̐������i�[
		for(int i = 0; i < inputNum; i++) numArray[i] = sc.nextInt();

		//������ɂȂ�܂Ń��[�v
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
