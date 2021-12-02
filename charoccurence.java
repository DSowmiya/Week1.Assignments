package week1assignments1;

public class charoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good Day";
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o')
			{
				count++;
			}
		}

	   System.out.println("Occurence of d:" +count);
	}
}  
