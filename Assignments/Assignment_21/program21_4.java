// Write a program to display all factors of given number.

class Logic
{
    void CountFactors(int num)
    {  
        int i = 0;
        int iFactCnt = 0;

        for(i = 1;i <= num;i++)
        {
            if((num % i) == 0)
            {
                iFactCnt++;
            }
            
        }
        System.out.println("Count of factors of a number is "+iFactCnt);
        
    }
}
class program21_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountFactors(20);
    }
}


