package play;

import java.util.ArrayList;

import init.Prepare;
import player.Player;

public class Play {
	public static void main(String[] args) {
		Prepare prepare = new Prepare();
		Player Alice = new Player();
		Player Bob = new Player();

		ArrayList<Integer> card = prepare.init();

		boolean flag = true;

		while(true) {
				if (0 == card.size()) break;

				if(flag) {
					Alice.getCard(card);
					flag = false;
				} else  {
					Bob.getCard(card);
					flag = true;
				}
		}

		int result = Alice.getCount() - Bob.getCount();

		System.out.println(result + "点差でAliceの勝ち");
	}
}
