package Daily;

import chn.util.*;
public class RandomLab {
    public static int guess(int n) {
        if (n<= 1) {
            return 1;
        }
        else {
            if (n%2 == 1) {
                return n - guess(n-1);
            }
            else {
                return n + guess(n-1);
            }
        }
    }
}
