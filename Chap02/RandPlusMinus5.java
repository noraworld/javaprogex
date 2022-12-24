import java.util.Random;
import java.util.Scanner;

class RandPlusMinus5 {

    public static void main(String[] args) {
	Random rand = new Random();
	Scanner stdIn = new Scanner(System.in);

	int random = rand.nextInt(11);
	random = random - 5;

	System.out.print("整数値: ");
	int x = stdIn.nextInt();

	System.out.println("その値の±5の乱数を発生しました。それは" + (x + random) + "です。");
    }
}
