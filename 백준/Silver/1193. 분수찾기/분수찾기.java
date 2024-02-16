import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
		int val = 0;
		while(val < x) {
			i++;
			val += i;
		}

        if(i % 2 == 0) {
			System.out.println((i - (val - x)) + "/" + (i + (((val - i) - x) + 1)));
		}else {
			System.out.println((i + (((val - i) - x) + 1)) + "/" + (i - (val - x)));
		}
    }
}
