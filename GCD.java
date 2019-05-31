import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		int i,n1,n2,gcd=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		for(i=1;i<n1&&i<n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		System.out.printf("The gcd is %d",gcd);	
	}

}
