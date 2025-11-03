// Write a program to find the sum of all even numbers up to N.

class Logic
{
    void PrintReverse(int n)
    {  
        int i = 0;
        for( i = n; i >= 1; i--)
        {
           System.out.println(i); 
        }   
    }
}
class program20_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}


