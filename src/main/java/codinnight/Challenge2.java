package codinnight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Challenge2 {

    public static int solve(char[][] checkpoints) {
        List<Pair> c = new ArrayList<Pair>();
        for (int i = 0; i < checkpoints.length; i++) {
            c.add(new Pair(checkpoints[i][0], checkpoints[i][1]));
        }
        c.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.x - p2.x;
            }
        });

        double ans = 0;
        for (int i = 1; i < c.size(); i++) {
            ans += Math.sqrt(
                    (c.get(i).x - c.get(i - 1).x) * (c.get(i).x - c.get(i - 1).x)
                            + (c.get(i).y - c.get(i - 1).y) * (c.get(i).y - c.get(i - 1).y)
            );
        }

        return (int) Math.ceil(ans);
    }

    static class Pair {

        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
