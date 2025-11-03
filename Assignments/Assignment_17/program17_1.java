// Write a program to find the sum of digits of number.

class Logic
{
    void SumOfDigits(int num)
    {
        int iSum = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;  
            iSum = iSum + iDigit;
        }

        System.out.println("Sum of digits: "+iSum);
        
    }

}
class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);
    }
}

