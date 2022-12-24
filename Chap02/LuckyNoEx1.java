import java.util.Random;

class LuckyNoEx1 {

    public static void main(String[] args) {
	Random rand = new Random();

	int lucky = rand.nextInt(9);

	System.out.println("今日のラッキーナンバーは" + (lucky + 1) + "です。");
    }
}
