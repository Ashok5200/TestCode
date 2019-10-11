package Practice;

public class StringCmp {

	public static void main(String[] args) {
		String str="abcbac";
		int len=str.length();
		boolean flag=true;
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				System.out.println("not  a palidrome");
				flag=false;
				break;
			}
			
		}
	if(flag)
	{
	System.out.println(" palidrome");
	}
	}

}
