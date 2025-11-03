// Write a program to check whether the number is positive, negative or zero.

class Logic
{
    void Checksign(int num)
    {  
       if( num == 0)
       {
            System.out.println(num +" is zero");  
       }
       else if( num < 0)
       {
            System.out.println(num +" is negative");
       }
       else
       {
            System.out.println(num +" is positive");
       }
    
    }
}
class program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.Checksign(-8);
    }
}

