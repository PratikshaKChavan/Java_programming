// Write a program to print the multiplication table of number.

class Logic
{
    void PrintTable(int num)
    {  
        int i = 0;
        
        for(i =1;i <= 10; i++)
        {
            System.out.println(num + "x" + i + " = " + (num * i));
        }
            
    }

}
class program17_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
    }
}

