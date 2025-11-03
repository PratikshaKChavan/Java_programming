// Write a program to count number of digit in given number.

class Logic
{
    void CountDigits(int num)
    {
        int iCount = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;  
            iCount++;
        }

        System.out.println("Numbers of digits: "+iCount);
        
    }

}
class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountDigits(7865);
    }
}

