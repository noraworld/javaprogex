import java.util.Scanner;

class DigitsNo2 {

    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.print("整数値: ");
	int n = stdIn.nextInt();

	if ( (n <= -10) || (n >= 10) )
	    System.out.println("２桁以上です。");
	else
	    System.out.println("２桁未満です。");
    }
}
