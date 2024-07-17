package logical;

public class RecurssiveFactorial {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args [])
    {
        RecurssiveFactorial f1 = new RecurssiveFactorial();
        int factorial= f1.factorial(5);
        System.out.println(factorial);

    }


}
