import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
		Main ma = new Main();
		Scanner sc = new Scanner(System.in);

		//“ü—Í‚³‚ê‚é®”‚Ì”
		int MAX = sc.nextInt();
		//‰ºŒÀ’l
		int LOW = sc.nextInt();
		//ãŒÀ’l
		int HIGH = sc.nextInt();
		//ŠeŒ…‚Ì˜a
		int tmp = 0;
		//‘˜a
		int sum = 0;

		for(int i = 1; i <= MAX; i++){
			tmp = ma.divsum(i);
          	//LOW < ŠeŒ…‚Ì˜a < HIGH‚Ìê‡‚Ì‘˜a
			if(tmp >= LOW && tmp <= HIGH) sum += i;
		}

		System.out.println(sum);
	}

	public int divsum(int value){
		int sum = 0;

		while(0 != value){
			//‰º1Œ…‚ğ‰ÁZ
			sum += value % 10;
			//Œ…—‚¿‚³‚¹‚é
			value /= 10;
		}

		return sum;
	}
}

