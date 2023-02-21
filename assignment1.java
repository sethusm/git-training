package strings;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int purchase_amt = sc.nextInt();
		System.out.print(calculateDiscount(purchase_amt));
	}

	static int calculateDiscount(int purchase_amt) {
		int dis = 0;
		if (purchase_amt <= 10000) {
			dis = purchase_amt * 10 / 100;
			return purchase_amt - dis;
		}
		if (purchase_amt > 10000 && purchase_amt <= 20000) {
			dis = purchase_amt * 20 / 100;
			return purchase_amt - dis;
		}
		if (purchase_amt > 20000) {
			dis = purchase_amt * 25 / 100;
			return purchase_amt - dis;
		}
		return dis;
	}
}
