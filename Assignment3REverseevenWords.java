package week1assignments1;

public class Assignment3REverseevenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s1= " I am Engineer";

String[] text =s1.split(" ");

for (int i=0; i<text.length; i++)

{
	if (i % 2==1)
	{
		char[] temp = text[i].toCharArray();
		for (int j=temp.length-1;j>=0;j--)
		{
			System.out.println("temp[j]");
			
		}
	System.out.println(" ");
	}
else
{
	System.out.println(text[i] +" ");
}
	}

}
}
