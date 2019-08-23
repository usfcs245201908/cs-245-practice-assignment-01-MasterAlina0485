
/**
 * Write a description of class Practice01MathRecursive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Practice01MathRecursive implements Practice01Math
{
    public int fib(int n) throws Exception
    {
        boolean debug = false;
        if (debug)
        {
            System.out.println("n = " +n);
        }
        
        if (n == 1)
        {
            return 1; 
        }
        else if (n == 0)
        {
            return 0;
        }
        else if (n < 0)
        {
            throw new Exception("Cannot compute negative Fibbonaci terms");
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
    
    public int fact(int n) throws Exception
    {
        boolean debug = false;
        if (debug)
        {
            System.out.println("n = " +n);
        }
        
        if (n == 1 || n == 0)
        {
            return 1; 
        }
        else if (n < 0)
        {
            throw new Exception("Cannot compute negative Factorial terms");
        }
        else
        {
            return fact(n-1)*n;
        }
    }
}
