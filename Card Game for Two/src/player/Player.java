package player;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
	private int count = 0;

	public ArrayList<Integer> getCard(ArrayList<Integer> card) {
		Integer max = Collections.max(card);
		count += max.intValue();
		card.remove(max);

		return card;
	}

	public int getCount() {
		return count;
	}
}
