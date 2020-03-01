package codinnight;

public class Challenge3 {

    public static long solve(long n) {
        long ans = 0;

        long k = 0, t = n;
        while (t != 0) {
            t /= 10;
            k++;
        }

        long c = 9, p = 1;
        for (int i = 1; i < k; i++) {
            ans += c * i;
            c *= 10;
            p *= 10;
        }

        ans += (n - p + 1) * k;

        return ans;
    }
}
