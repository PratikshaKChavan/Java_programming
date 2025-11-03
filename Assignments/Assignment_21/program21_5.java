// Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

class Logic
{
    void PrintDivisibleBy2and3(int n)
    {  
        int i = 0;
        int iDivNum = 0;

        for(i = 1;i <= n;i++)
        {
            if(((i % 2) == 0) && ((i % 3)== 0))
            {
                System.out.println(i);
            }   
        }   
    }
}
class program21_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintDivisibleBy2and3(30);
    }
}


