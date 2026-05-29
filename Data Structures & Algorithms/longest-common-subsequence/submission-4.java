class Solution {
    int[][] t= new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
       int n = text1.length();
        int m = text2.length();
        
        // 2. Initialize the table with -1 EXACTLY ONCE here
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return lcs(text1, text2, text1.length(), text2.length());
    }

    public int lcs(String x, String y, int n, int m){
        

        if(n==0 || m==0) return 0;
        if(t[n][m]!=-1) return t[n][m];               
        if(x.charAt(n-1) == y.charAt(m-1)){
           return t[n][m]=1+ lcs(x,y,n-1,m-1);
        }
        else
           return t[n][m]= Math.max(lcs(x,y,n-1,m), lcs(x,y,n,m-1));
    }
}
