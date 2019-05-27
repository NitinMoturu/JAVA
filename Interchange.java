import java.util.Scanner;
public class Interchange{
	public static void main(String[]args){
	int a,b,t;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Numbers");
	a=s.nextInt();
	b=s.nextInt();
	t=a;
	a=b;
	b=t;
	System.out.printf("%d\t%d",a,b);
	}
}