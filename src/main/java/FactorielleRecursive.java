public class FactorielleRecursive {
    public static int getFactorielle(int n) {
        if(n == 1 || n==0)
            return 1;
        else
            return n*getFactorielle(n-1);
    }
}
