// Write a program to find sum of even and odd digits seperately in a number.

class Logic
{
    void SumEvenOddDigits(int num)
    {  
        int iDigit = 0;
        int eSum = 0;
        int oSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            if((iDigit % 2) == 0)
            {
                eSum = eSum + iDigit;   
            }
            else
            {
                oSum = oSum + iDigit;  
            }
        }
        
        System.out.println("Sum of even digits is "+ eSum);
        System.out.println("Sum of odd digits is "+ oSum);

        
    }
}
class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }
}

