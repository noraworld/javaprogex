import java.util.Scanner;

class GoodBad {

    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.print("点数を評価します。\n何点ですか: ");
	int n = stdIn.nextInt();

	if ( (n >= 0) && (n <= 59) )
	    System.out.println("不可です。");
	else if ( (n >= 60) && (n <= 69) )
	    System.out.println("可です。");
	else if ( (n >= 70) && (n <= 79) )
	    System.out.println("良です。");
	else if ( (n >= 80) && (n <= 100) )
	    System.out.println("優です。");
	else
	    System.out.println("点数は0点以上100点未満で入力してください。");
    }
}
