// Write a program to find the sum of all even numbers up to N.

class Logic
{
    void SumEvenNumbers(int num)
    {  
        int i = 0;
        int iSum = 0;

        for( i = 1; i <= num; i++)
        {
            if((i % 2) == 0)
            {
                iSum = iSum + i;
            }
        }

        System.out.println("Sum of all even numbers up to given number is "+iSum );
    }
}
class program20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}


