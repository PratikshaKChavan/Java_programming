// Write a program to check whether a given year is leap or not.

class Logic
{
    void CheckLeapYear(int year)
    {  
       if( (year % 4) == 0)
       {
            System.out.println(year +" is leap year");  
       }
       else
       {
             System.out.println(year +" is not a leap year"); 
       }
    }
}
class program19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
}

