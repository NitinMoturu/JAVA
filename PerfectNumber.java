import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		int num,i,sum=0;
		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			if(num%i == 0)
			{
				sum=sum+i;
			}
		}
		if(sum == num)
		{
		System.out.printf("The number is a perfect number %d",num);
		}
		else 
		{
			System.out.printf("No the number is not a perfect number %d",num);
		}
	}

}
