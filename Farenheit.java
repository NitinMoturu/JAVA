import java.util.Scanner;
public class Farenheit{
	public static void main(String[]args){
		float c,f;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature in Celcius");
		c=s.nextFloat();
		f=(c*9)/5+32;
		System.out.printf("the temperature in Farenheit is:%.2f",f);
	}
}