package otherexercises;

public class Loop {
    public static int fatorialWithFor(int n){
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

}
