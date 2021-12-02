package week1assignments1;

public class convertNegtoPosnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-550;
		int result=0;
		if (num<0)
		{
		System.out.println("Number is negative");
		result=Math.negateExact(num);
		System.out.println("Negative number converted into positive:" +result);
			
		}
		else if (num>0)
		{
			System.out.println("Number is positive");
		}
	}

}
