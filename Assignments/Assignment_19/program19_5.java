// Write a program to calculate the power of a number using loops.

class Logic
{
    void CalculatePower(int base, int exp)
    {  
        int i = 0;
        int iPower = 1;

        for( i = 1; i <= exp; i++)
        {
            iPower = iPower * base;
        }

        System.out.println("Power = "+iPower);
    }
}
class program19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2,5);
    }
}


