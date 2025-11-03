// Write a program to count even and odd number between 1 and N.

class Logic
{
    void CountEvenOddRange(int n)
    {  
        int i = 0;
        int iEvenCnt = 0;
        int iOddCnt = 0;

        for(i = 1;i <= n;i++)
        {
            if((i % 2) == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iOddCnt++;
            }
        }
        System.out.println("Count of even number is "+iEvenCnt);
        System.out.println("Count of odd number is "+iOddCnt);

    }
}
class program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}


