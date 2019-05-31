import java.util.Scanner;

public class HighestFactor {

	public static void main(String[] args) {
		int i,n,hf=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0 )
				hf=i;
		}
		System.out.printf("The highest factor is %d",hf);	

	}

}
