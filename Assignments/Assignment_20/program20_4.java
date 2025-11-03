// Write a program to print largest digit in given number.

class Logic
{
    void FindLargestDigit(int num)
    {  
        int iDigit = 0;
        int ilargest = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit > ilargest)
            {
                ilargest = iDigit;
            }
        }
        System.out .println("Largest digit is "+ilargest);
    }
}
class program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}


