package codinnight;

import java.util.HashMap;
import java.util.Map;

public class Challenge1 {

    public static int solve(String[] squads) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String squad : squads) {
            if (map.containsKey(squad)) {
                map.put(squad, map.get(squad) + 1);
            } else {
                map.put(squad, 1);
            }
        }

        int ans = 0;
        for (String squad : map.keySet()) {
            if (map.get(squad) > 1) ans++;
        }

        return ans;
    }
}
