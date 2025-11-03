// Write a program to reverse a number.

class Logic
{
    void ReverseNumber(int num)
    {
        int Reversenum = 0;
        int iDigit = 0;
        while(num != 0)
        {
            iDigit = num % 10;
            Reversenum = Reversenum * 10 + iDigit;
            num = num / 10;  
        }

        System.out.println("Numbers in reverse order: "+Reversenum);
        
    }

}
class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.ReverseNumber(1234);
    }
}
