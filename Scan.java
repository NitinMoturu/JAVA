import java.util.Scanner;
public class Scan{
	public static void main(String[]args){
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the number");
	char num =s.next().charAt(0);
	System.out.println(num);
	}
}