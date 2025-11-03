// Write a program to find maximum of given number.

class Logic
{
    void FindMax(int a, int b)
    {
        if( a > b)
        {
            System.out.println(a +" is greater" );
        }
        else if( b > a)
        {
            System.out.println(b +" is greater" );
        }
        else
        {
            System.out.println(" Both numbers are equal");
        }
        
    }

}
class program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindMax(20, 15);
    }
}

