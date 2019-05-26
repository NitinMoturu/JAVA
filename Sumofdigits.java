import java.util.Scanner;
public class Sumofdigits{
	public static void main(String[]args){
	int num,sum=0,r,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	num=s.nextInt();
		while(num!=0)
		{
		r=num%10;
		sum=sum+r;
		num=num/10;
		}
		System.out.printf("Sum of the digits:%d",sum);
	}
}