package com.huweicai;

public class DifferentRoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		System.out.println(s.uniquePaths(2, 62));
	}

	public static class Solution {
		/*
		 * @param m: positive integer (1 <= m <= 100)
		 * 
		 * @param n: positive integer (1 <= n <= 100)
		 * 
		 * @return: An integer
		 */
		public int uniquePaths(int m, int n) {
			if (m == 1 || n == 1)
				return 1;
			int[][] a = new int[m + 1][n + 1];
			;
			for (int i = 0; i < m; i++) {
				a[i][0] = 0;
			}
			for (int i = 0; i < n; i++) {
				a[0][i] = 0;
			}
			a[0][1] = 1;
			for (int x = 1; x <= m; x++) {
				for (int y = 1; y <= n; y++) {
					a[x][y] = a[x - 1][y] + a[x][y - 1];
				}
			}
			System.out.println(a.length + " " + a[0].length);
			return a[m][n];
		}

		public int numWays(int n, int k) {
			if (n == 0 || k == 0) {
				return 0;
			}
			int[] a = new int[n];
			a[0] = k;
			a[1] = k * k;
			for (int i = 2; i < n; i++) {
				a[i] = a[i - 2] * (k - 1) + a[i - 1] * k;
			}
			return a[n - 1];
		}
	}
}
