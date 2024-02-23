import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long mod = 1000000000;

		int n = sc.nextInt();
		int k = sc.nextInt();

		long dp[][] = new long[n+1][k+1];

		for(int i=0; i<n+1; i++){
			dp[i][1] = 1;
		}

		for(int i=0; i<k+1; i++){
			dp[0][i] = 1;
		}

		for(int i=1; i<=n; i++){
			for(int j=2; j<=k; j++){
				dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
			}
		}

		System.out.println(dp[n][k]);
	}
}