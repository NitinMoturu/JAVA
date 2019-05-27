import java.util.Scanner;
public class Reverse{
	public static void main(String[]args){
		int num,r,rnum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		while(num!=0)
		{
		r=num%10;
		rnum=rnum*10+r;
		num=num/10;
		}
		System.out.printf("Reversed number is:%d",rnum);
	}
}