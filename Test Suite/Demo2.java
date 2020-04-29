package wipro;

public class Demo2 {
	public boolean palindromeCheck(String a) {
		String b="";
		int len=a.length();
		for(int i=len-1;i>=0;i--)
			b=b+a.charAt(i);
		return a.equals(b);
			
	}

}
