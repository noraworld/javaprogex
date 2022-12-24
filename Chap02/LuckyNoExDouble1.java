import java.util.Random;

class LuckyNoExDouble1 {

    public static void main(String[] args) {
	Random rand = new Random();

	double lucky = rand.nextDouble();

	System.out.println("今日のラッキーナンバーは" + lucky + "です。");
    }
}
