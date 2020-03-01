package codinnight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge5 {

    public static long solve(int n) {
        long ans = n;

        List<Integer> a = new ArrayList<Integer>();
        while (n != 0) {
            a.add(n % 10);
            n /= 10;
        }
        Collections.reverse(a);

        for (int i = 0; i < 10; i++) {
            List<Integer> t = new ArrayList<Integer>(a);
            for (int p = 0; p < a.size(); p++) {
                t.set(p, (t.get(p) + i) % 10);
            }
            for (int j = 0; j < 10; j++) {
                long c = 0;
                long r = 1;
                for (int p = a.size() - 1; p >= 0; p--) {
                    c += t.get((p + j) % 10) * r;
                    r *= 10;
                }
                ans = Math.max(ans, c);
            }
        }

        return ans;
    }
}
