
package practice;

public class StringDuplicate {
	public static void main(String[] args) {

		String s="abcdefgaaaaaaaaaavvvvv";
		//String s1="";

		int count=0;
		for (int i = 0; i < s.length(); i++) {
			count=0;
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count<1) {
				System.out.println(s.charAt(i));
			}

		}
	}
}
