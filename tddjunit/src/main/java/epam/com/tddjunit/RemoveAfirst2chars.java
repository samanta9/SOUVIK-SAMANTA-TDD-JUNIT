package epam.com.tddjunit;

public class RemoveAfirst2chars {
	
	public String remove(String string)
	{
		String result=string;
		
		if(string.length()>=2)
		{
			String firstChar = string.substring(0,1);
			String secondChar= string.substring(1,2);
			
			if(string.charAt(0)=='A')
			{
				firstChar="";	
			}
			
			if(string.charAt(1)=='A')
			{
				secondChar="";
			}
			
			result = firstChar+
					secondChar+
					string.substring(2, string.length());
		
		}
		
		else if(string.length()==1 && string.charAt(0)=='A')
		{
			result="";
		}
		
		
		return result;
		
	}

}
