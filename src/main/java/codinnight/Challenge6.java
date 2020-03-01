package codinnight;

public class Challenge6 {

    public static long solve(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] d = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = 0;
            }
        }

        d[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (grid[0][i] == '.') d[0][i] = d[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            if (grid[i][0] == '.') d[i][0] = d[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (grid[i][j] == '.') d[i][j] = d[i - 1][j] + d[i][j - 1];
            }
        }

        return d[n - 1][m - 1];
    }
}
