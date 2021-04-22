package ksk.strings;

public class LongestPalindromeSubSequence {

    //Recursive solution  - TC - o(2power n) SC --> internally we are using stack for the recursion so it is o(n)
    public static int lps(String str, int start, int end) {
        if (start > end) return 0;
        if (start == end) return 1;
        if (str.charAt(start) == str.charAt(end)) {
            return 2 + lps(str, start + 1, end - 1);
        }
        return Math.max(lps(str, start + 1, end), lps(str, start, end - 1));
    }

    //TC: o(n2) SC : o(n2)
    public static int lpsTopDown(String str, int start, int end, Integer[][] array) {
        if (start > end) return 0;
        if (start == end) return 1;

        if (array[start][end] == null) {
            if (str.charAt(start) == str.charAt(end)) {
                array[start][end] = 2 + lpsTopDown(str, start + 1, end - 1, array);
            } else {
                array[start][end] = Math.max(lpsTopDown(str, start + 1, end, array), lpsTopDown(str, start, end - 1, array));
            }
        }
        return array[start][end];
    }

    // TC: o(n)
    public static int lpsBottomTop(String str, int n) {
        int[][] arr = new int[n][n];

        for(int i = 0;i<n;i++){
            arr[i][i] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    arr[i][j] = 2 + arr[i + 1][j - 1];
                } else {
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j - 1]);
                }
            }
        }
        return arr[0][n - 1];
    }


    public static void main(String[] args) {

        String str = "abeebac";
        String str1 = "cddpd";
        //System.out.println(LongestPalindromeSubSequence.lps(str, 0, str.length() - 1));
        System.out.println(LongestPalindromeSubSequence.lpsBottomTop(str,str.length()));
        System.out.println(LongestPalindromeSubSequence.lpsBottomTop(str1,str1.length()));


    }


}
