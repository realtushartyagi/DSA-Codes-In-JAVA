import java.util.*;

public class ExitPointMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt(), arr[][] = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = scn.nextInt();

        int dir = 0, r = 0, c = 0;
        while (r >= 0 && r < n && c >= 0 && c < m) {
            dir = (dir + arr[r][c]) % 4;
            r += (dir == 1 ? 1 : dir == 3 ? -1 : 0);
            c += (dir == 0 ? 1 : dir == 2 ? -1 : 0);
        }

        System.out.println((r < 0 ? 0 : r >= n ? n - 1 : r) + " " + (c < 0 ? 0 : c >= m ? m - 1 : c));
        scn.close();
    }
}
