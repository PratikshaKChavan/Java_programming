// Write a program to calculate the sum of first N natural numbers.

class Logic
{
    void calculateSum(int n)
    {
        int sum = 0;
        sum = n * (n-1) / 2;
        System.out.println("Sum of first 10 natural number is : "+sum);

    }

}
class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
