package practice;

public class Alphanumeric {
   static void separate(String s) {
		StringBuffer num=new StringBuffer();
		StringBuffer alpha=new StringBuffer();
		StringBuffer special=new StringBuffer();

       for (int i = 0; i < s.length(); i++) {
    	   if(Character.isDigit(s.charAt(i))) {
    		   num=num.append(s.charAt(i));
    	   }else if(Character.isAlphabetic(s.charAt(i))) {
    		   alpha=alpha.append(s.charAt(i));
    	   }else {
    		   special=special.append(s.charAt(i));
    	   }
	}
   	System.out.println("alpha:"+alpha);
   	System.out.println("num:"+num);
   	System.out.println("spl:"+special);
    }
	public static void main(String[] args) {
		Alphanumeric.separate("absskgaks26345////*---+++++@#");
	}



}
