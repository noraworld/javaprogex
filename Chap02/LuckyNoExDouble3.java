import java.util.Random;

class LuckyNoExDouble3 {

    public static void main(String[] args) {
	Random rand = new Random();

	int lucky1    = rand.nextInt(2);
	double lucky2 = rand.nextDouble();

	System.out.println("今日のラッキーナンバーは" + (lucky1 - lucky2) + "です。");
    }
}
