package baekjoon;
import java.util.Scanner;

public class baekjoon_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =0;
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a==0)&&(b==0)&&(c==0))
				break;
			if((a>b)&&(a>c)) {
				if((Math.pow(b,2)+Math.pow(c,2))==Math.pow(a, 2))
					System.out.println("right");
				else
					System.out.println("wrong");
			}
			else if((b>a)&&(b>c)){
				if((Math.pow(a,2)+Math.pow(c,2))==Math.pow(b, 2))
					System.out.println("right");
				else
					System.out.println("wrong");
			}
			else if((c>a)&&(c>b)){
				if((Math.pow(b,2)+Math.pow(a,2))==Math.pow(c, 2))
					System.out.println("right");
				else
					System.out.println("wrong");
			}
			else
				System.out.println("wrong");
		}
	}
}
