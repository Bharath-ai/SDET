package week6.day2;



import org.junit.Test;

public class ReverseOnlyLetters {
	@Test
	public void test1() {
		String s= "ab-cd";
		System.out.println(reverseLetters(s));
	}
	@Test
	public void test2() {
		String s= "a-bC-dEf-ghIj";
		System.out.println(reverseLetters(s));
	}
	@Test
	public void test3() {
		String s= "Test1ng-Leet=code-Q!";
		System.out.println(reverseLetters(s));
	}
	public String reverseLetters(String s) {
     int left=0, right=s.length()-1;
     char[] ch = s.toCharArray();
     while(left<right) {
    	 if(!Character.isLetter(ch[left])) {
    		 left++;
    	 }
    	 else if(!Character.isLetter(ch[right])){
    		 right--;
    	 }
    	 else {
    		 char temp = ch[left];
    		 ch[left] = ch[right];
    		 ch[right] = temp;
    		 left++;
    		 right--;
    	 }
    		 
    	 }
	return new String(ch);
     }
}
