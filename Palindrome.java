
public class Palindrome {

	public static void main(String[] args) {
		
		for(int i=1000;i<2000;i++)
		{
			int r,sum=0;
			int n=i,on=i;
			while(n!=0)
			{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			}
			if (on==sum)
			{
				System.out.print(on);
			}
		}

	}

}

