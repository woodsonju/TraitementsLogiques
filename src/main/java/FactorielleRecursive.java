public class FactorielleRecursive {
    public static int getFactorielle(int n) {
        if(n == 1 || n==0)
            return 1;
        else
            return n*getFactorielle(n-1);
    }
}

/*	n! = n*(n-1)
	ex: 5!
			=>
				5*(5-1)
				4*(4-1)
				3*(3-1)
				2*(2-1)
				1*(1-1)
						=> 5*4*3*2*1
*/