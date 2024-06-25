public class StringBrackets {
	public static void main(String args[]){
		String a = "(())";
		for(int i=0; i<a.length()-1;i++) {
			if(a.charAt(i) == '(' && a.charAt(i+1) == ')') {
				System.out.println(a.charAt(i)+""+a.charAt(i+1));
			}
		}
	}
}