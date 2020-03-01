package codinnight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge4 {

    public static String solve(int n) {
        List<Integer> a = new ArrayList<Integer>();
        while (n != 0) {
            a.add(n % 20);
            n /= 20;
        }

        Collections.reverse(a);

        List<String> ans = new ArrayList<>();

        for (Integer integer : a) {
            switch (integer) {
                case 0:
                    ans.add("0");
                    break;
                case 1:
                    ans.add(".");
                    break;
                case 2:
                    ans.add("..");
                    break;
                case 3:
                    ans.add("...");
                    break;
                case 4:
                    ans.add("....");
                    break;
                case 5:
                    ans.add("|");
                    break;
                case 6:
                    ans.add("|.");
                    break;
                case 7:
                    ans.add("|..");
                    break;
                case 8:
                    ans.add("|...");
                    break;
                case 9:
                    ans.add("|....");
                    break;
                case 10:
                    ans.add("||");
                    break;
                case 11:
                    ans.add("||.");
                    break;
                case 12:
                    ans.add("||..");
                    break;
                case 13:
                    ans.add("||...");
                    break;
                case 14:
                    ans.add("||....");
                    break;
                case 15:
                    ans.add("|||");
                    break;
                case 16:
                    ans.add("|||.");
                    break;
                case 17:
                    ans.add("|||..");
                    break;
                case 18:
                    ans.add("|||...");
                    break;
                case 19:
                    ans.add("|||....");
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String an : ans) {
            sb.append(an).append(" ");
        }

        return sb.toString();
    }
}
