// Write a program to find the sum of digits of number.

class Logic
{
    void CheckPalindrome(int num)
    {
        int GivenNum = num;
        int ReverseNum = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            ReverseNum = ReverseNum * 10 + iDigit;
            num = num / 10;      
        }

        if(GivenNum == ReverseNum)
        {
            System.out.println(GivenNum +" is a palindrome" );
        }
        else
        {
            System.out.println(GivenNum +" is not a palindrome" );   
        }
  
    }

}
class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);
    }
}

