import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		int a=sc.nextInt();
		System.out.println("Enter a second number");
		int b=sc.nextInt();
		int mul=0;
		while(a>0)
		{
			mul=mul+b;
			a--;
		}
		System.out.println(mul);
	}
}
