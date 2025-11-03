// Write a program to print smallest digit in given number.

class Logic
{
    void FindSmallestDigit(int num)
    {  
        int iDigit = 0;
        int iSmallest = 9;

        while(num > 0)
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit < iSmallest)
            {
                iSmallest = iDigit;
            }
        }
        System.out .println("Smallest digit is "+iSmallest);
    }
}
class program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(45872);
    }
}


