import java.util.*;
class DiffSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
			System.out.println(num1-num2);
		else
			System.out.println(num1+num2);
	}
}