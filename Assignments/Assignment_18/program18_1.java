// Write a program to print the multiplication table of number.

class Logic
{
    void CheckPrime(int num)
    {  
        int i = 0;
        boolean iprime = true;

        if(num <=1)
        {
            iprime = false;
        }
        else
        {
            for(i = 2; i <= num / 2; i++)
            {
                if((num % i) == 0)
                {
                    iprime = false;
                    break;
                }
            }
        } 

        if(iprime)
        {
            System.out.println(num +" is prime");
        }
        else
        {
            System.out.println(num +" is not a prime");
        }      
    }

}
class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
    }
}

