// Write a program to find the factorial of a number using a for loop.

class Logic
{
    void FindFactorial(int num)
    {
        int i = 0;
        int iFact = 1; 

        for(i = 1;i <= num; i++)
        {
            iFact = iFact * i;   
        }

        System.out.println("Factorial of given number is : "+iFact);
    }

}
class program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindFactorial(5);
    }
}
