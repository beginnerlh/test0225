package lianxi0225;

public class test0225 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int n = 6;
		String s = S.countAndSay(n);
		System.out.println(s);
	}
}

class Solution {
    public String countAndSay(int n) {
        if(n == 1)
        {
            return "1";
        }
    	String s = "11";
        char[] chars = s.toCharArray();
        int count = 1;
        while(n>2)
        {
            StringBuffer sb = new StringBuffer();
            for(int i = 1; i<chars.length; i++)
            {
                if(chars[i]==chars[i-1])
                {
                    count ++;
                }
                else
                {
                    sb.append(count).append(chars[i-1]);
                    count = 1;
                }
                if(i ==chars.length - 1)
                {
                    sb.append(count).append(chars[i]);
                }
            }
            count = 1;
            chars = sb.toString().toCharArray();
            n--;
        }
        return String.valueOf(chars);
    }
}
