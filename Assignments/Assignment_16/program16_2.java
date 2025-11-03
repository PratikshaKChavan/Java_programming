// Write a program to check whether a given number is even or odd.

class Logic
{
    void CheckEvenOdd(int num)
    {
        if((num % 2) == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }

}
class program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);
    }
}
