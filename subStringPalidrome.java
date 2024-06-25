class subStringPalidrome {
	
	public static void main(String args[]) {
		String str = "babad";
		System.out.println(longestPalidrome(str));
	}

	public static String longestPalidrome(String s) {
		int start = 0, end = 0;
		for(int i=0; i<s.length(); i++) {
			int len = findTheSubstring(s, i, i);
			System.out.println(len);
			if(len > end - start) {
				start = i-(len - 1) / 2;
				end = i + len/2;
			}
		}
		return s.substring(start, end+1);
	}

	public static int findTheSubstring(String s, int left, int right) {
		while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			left--;
			right++;
		}
	return right - left - 1;
	}
}