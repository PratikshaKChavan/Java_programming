// Write a program to print all even number up to N.

class Logic
{
    void PrintEvenNumbers(int num)
    {  
        int i = 0;

        for(i = 1; i <= num ;i++)
        {
            if((i % 2) == 0)
            {
                System.out.println(i);
            }
        }
    }
}
class program18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintEvenNumbers(20);
    }
}

