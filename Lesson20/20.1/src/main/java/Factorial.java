public class Factorial {
    public long get (int x){
        long result = 1;

        for (int i = 1; i < x; i++) {
            result = result * i;
        }

        if (x < 0){
            result = -1;
        }

        return result;
    }
}
