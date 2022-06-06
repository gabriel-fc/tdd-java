package otherexercises;

public class Loop {
    public static int fatorialWithFor(int n){
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    public static int fatorialWithWhile(int n){
        int value = 1, count = 1;
        while(count <= n){
            value *= count;
        }
        return value;
    }

}
