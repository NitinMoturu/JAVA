public class Prime{
	public static void main(String[]args){
	if (args.length==0)
	{
	System.out.println("no number is given");
	return;
	}
	int n=Integer.parseInt(args[0]);
	boolean prime= true;
	for(int i=2;i<=n/2;i++)
	{
	if (n%i==0)
	{
	prime=false;
	break;
	}
	}
	if(prime)
	System.out.println("Prime Number");
	else
	System.out.println("Not a Prime Number");
	}
}