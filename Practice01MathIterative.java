
/**
 * Write a description of class Practice01MathRecursive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Practice01MathIterative implements Practice01Math
{
    public int fib(int n) throws Exception
    {
        boolean debug = false;
        int n1 = 1;
        int n2 = 0;
        int sum = 0;
        
        if (n == 0)
        {
            if (debug)
                {
                    System.out.println("n = " +n);
                }
            return 0;
        }
        else if (n < 0)
        {
            throw new Exception("Cannot compute negative Fibbonaci terms");
        }
        else
        {
            for (int i=1; i<=n; i++)
            {
                if (debug)
                {
                    System.out.println("n = " +n);
                }
                n2 = n1;
                n1 = sum;
                sum = n1 + n2; 
                if (debug)
                {
                    System.out.println("sum = " +sum);
                }
            }
            return sum;
        }

    }
    
    public int fact(int n) throws Exception
    {
        boolean debug = false;
        int fact = 1;
        if (debug)
        {
            System.out.println("n = " +n);
        }
        
        if (n == 0)
        {
            return 1; 
        }
        else if (n < 0)
        {
            throw new Exception("Cannot compute negative Factorial terms");
        }
        else
        {
            for (int i=1; i<=n; i++)
            {
                if (debug)
                {
                    System.out.println("n = " +n);
                }
                fact = fact*i;
                if (debug)
                {
                    System.out.println("factorial = " +fact);
                }
            }
            return fact;
        }

    }
}
