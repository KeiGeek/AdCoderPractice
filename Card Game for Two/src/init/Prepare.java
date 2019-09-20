package init;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Prepare {
	static int NMax = 100;

	public ArrayList<Integer> init() {
		//カードの値
		Scanner scan = new Scanner(System.in);
		String inCard = scan.nextLine();
		scan.close();

		String strCardArray[] = inCard.split(",");
		//要素数が100より多い場合以上終了
		if (NMax < strCardArray.length)
		System.err.println("input error!!!");

		int 	intCardArray[] = Stream.of(strCardArray).mapToInt(Integer::parseInt).toArray();

		//配列をInteger型のArrayListへ変換
		ArrayList<Integer> cardList = new ArrayList<Integer>();
		for (int i =0; i < intCardArray.length; i++) {
			cardList.add(intCardArray[i]);
		}

		return cardList;
	}
}
