// Write a program to check whether a number is a perfect number or not.

class Logic
{
    void CheckPerfect(int num)
    {  
        int i = 0;
        int iSum1 = 0;
        int iSum2 = num;

        for( i = 1; i < num; i++)
        {
           if((num % i) == 0)
           {
                iSum1 = iSum1 + i;
           }
        }  

        if(iSum1 == iSum2)
        {
            System.out.println(num +" is perfect");
        }
        else
        {
            System.out.println(num +" is not perfect");
        } 
    }
}
class program20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPerfect(6);
    }
}


