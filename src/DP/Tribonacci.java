package DP;
//1137
public class Tribonacci {

        public int tribonacci(int n) {
            int dp[]=new int[n+1];
            if(n<2)return n;
            dp[0]=0;
            dp[1]=1;
            dp[2]=1;


            for(int i=3;i<n+1;i++){
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
            return dp[n];

    }
}
