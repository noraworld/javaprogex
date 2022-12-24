import java.util.Scanner;

class Triangle {

    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.println("三角形の面積を求めます。");

	System.out.print("底辺: ");
	double base  = stdIn.nextDouble();

	System.out.print("高さ: ");
	double height = stdIn.nextDouble();

	System.out.println("面積は" + ((base * height) / 2) + "です。");
    }
}
