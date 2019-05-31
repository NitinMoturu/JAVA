import java.util.Scanner;
public class Powers {

	public static void main(String[] args) {
		int b,p,r=1,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base first and power next");
		b=s.nextInt();
		p=s.nextInt();
		for(i=1;i<=p;i++)
			r=r*b;
		System.out.println("the result is "+r);
	}

}
