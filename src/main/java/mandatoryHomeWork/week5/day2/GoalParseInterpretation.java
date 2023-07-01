package mandatoryHomeWork.week5.day2;

import org.junit.Test;

public class GoalParseInterpretation {
	@Test
	public void example1() {
		String s="G()(al)";
		
		System.out.println(goalInterpretation(s));
	}
	
	private String goalInterpretation(String s) {
		String out="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='G') {
				out=out+'G';
			}
			else if(s.charAt(i)=='(') {
				i++;
				if(s.charAt(i)==')') {
					out=out+'o';
				}
				else {
					out=out+"al";
					i+=2;
					}
				}
				
				}
		return out;
		}
}
