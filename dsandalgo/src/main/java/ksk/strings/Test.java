package ksk.strings;

public class Test {

    int resultStart;
    int resultLength;
    int plandromicCounter;

    String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        for (int start = 0; start < s.length() - 1; start++) {
            expandFromMiddle(s, start, start);
            expandFromMiddle(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);

    }

    void expandFromMiddle(String inputString, int left, int right) {
        while (left >= 0 && right <= inputString.length() && inputString.charAt(left) == inputString.charAt(right)) {
            left--;
            right++;
            plandromicCounter++;
        }
        if (resultLength < right - left - 1) {
            if(resultLength==0 && plandromicCounter>0){
                plandromicCounter = plandromicCounter+1;
            }
            resultStart = left + 1;
            resultLength = right - left - 1;
            System.out.println("TIme--" + resultStart + "--" + resultLength);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        //System.out.println(test.longestPalindrome("abaxyzzyxb"));
        //System.out.println(test.longestPalindrome("abdbca"));
        System.out.println(test.longestPalindrome("cddpd"));
        System.out.println(test.plandromicCounter);
    }
}