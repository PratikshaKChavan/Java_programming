// Write a program to display all factors of a given number.

class Logic
{
    void DisplayFactors(int num)
    {  
        int i = 0;
    
        for(i = 1;i <= num;i++)
        {
            if((num % i) == 0)
            {
                System.out.println(i);
            }  
        }   
    }
}
class program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }
}


