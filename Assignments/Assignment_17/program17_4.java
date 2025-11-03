// Write a program to find maximum of given number.

class Logic
{
    void FindMin(int a, int b, int c)
    {
        if( a <= b && a <= c)
        {
            System.out.println(a + " is minimun" );
        }
        else if( b <= a && b <= c)
        {
            System.out.println(b + " is minimum" );
        }
        else
        {
            System.out.println(c + "is minimum");
        }
        
    }

}
class program17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindMin(3,7,2);
    }
}

