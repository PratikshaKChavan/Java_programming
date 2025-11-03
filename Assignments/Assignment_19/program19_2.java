// Write a program to display the grade of a student based on marks.

class Logic
{
    void DisplayGrade(int Marks)
    {  
       if(Marks <= 25)
       {
            System.out.println("Grade D");  
       }
       else if(Marks > 25 && Marks <= 50)
       {
            System.out.println("Grade C"); 
       }
       else if(Marks > 50 && Marks <= 75)
       {
            System.out.println("Grade B");
       }
       else if(Marks > 75 && Marks <= 100)
       {
            System.out.println("Grade A");
       }
    }
}
class program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}


