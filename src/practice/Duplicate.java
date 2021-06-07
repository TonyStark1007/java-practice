package practice;

public class Duplicate {
	public static void main(String[] args) {
		int[]  s= {1,1,2,3,3};
		//String s="abcdefgaaaaaaaaaavvvvv";
		//String s1="";
		int a=0;
		int s1[]=new int[s.length];
		int count=0;
		for (int i = 0; i < s.length; i++) {
			count=0;
			for (int j = i+1; j < s.length; j++) {
				if(s[i]==s[j]) {
					count++;
				}
			}
			if(count<1) {
				System.out.println(s[i]);
			}

		}}
}
