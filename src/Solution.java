

public class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        char[] chars=s.toCharArray();
        int i=0,j=chars.length-1;
        while (i<chars.length){
            if (chars[i++]!=chars[j--])
                break;
        }

        if (i==chars.length)
            return true;
        else
            return false;
    }



}

