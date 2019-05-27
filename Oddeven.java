import java.util.Scanner;
public class Oddeven{
	public static void main(String[]args){
		int num;
		System.out.printf("Enter the Number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0)
		System.out.printf("It is a even number");
		else
		System.out.printf("it is a odd number");
	}
}