import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		int lar=0,i,num;
		Scanner s= new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter the number");
			num=s.nextInt();
			if(num>lar)
				lar=num;
		}
System.out.println("the largest number is"+lar);
	}

}
