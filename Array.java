import java.util.Scanner;
public class Array{
	public static void main(String[]args){
	int a1[],i;
	a1= new int [10];
	System.out.println("Enter the numbers");
	for(i=0;i<10;i++)
	{
	Scanner s=new Scanner(System.in);
	a1[i]=s.nextInt();
	}
	System.out.println("the array is:\n");
	for(i=0;i<10;i++)
	{
	System.out.printf("%d",a1[i]);
	}
	}
}