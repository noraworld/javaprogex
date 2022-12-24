import java.util.Random;

class LuckyNoEx3 {

    public static void main(String[] args) {
	Random rand = new Random();

	int lucky = rand.nextInt(90);

	System.out.println("今日のラッキーナンバーは" + (lucky + 10) + "です。");
    }
}
