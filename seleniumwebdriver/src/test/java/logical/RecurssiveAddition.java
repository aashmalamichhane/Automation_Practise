package logical;

public class RecurssiveAddition {
    public int sum(int n)
    {
        if(n>0)
        {
            return n+ sum(n-1);
        }
        else {
            return 0;
        }
    }
    public static void main (String args[])
{
    RecurssiveAddition r1 = new RecurssiveAddition();
    int sum = r1.sum(5);
    System.out.println(sum);
}
}
