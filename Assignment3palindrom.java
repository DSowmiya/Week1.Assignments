package week1assignments1;

public class Assignment3palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1=" ROTATOR ";
String reverse="";
char temp;

for (int i=0;i <str1.length();i++)
{
	temp=str1.charAt(i);
	
	reverse=temp+reverse;
	}
	System.out.println("Original value:" +str1);
	
	System.out.println("Reversed value:" +reverse);
	
if (reverse.equals(str1))
{
	System.out.println("Is a palindrome");
}
else {
	System.out.println("Is not a palindrome");
}
	}

}
