// Write a program to print smallest digit in given number.

class Logic
{
    void ProductOfDigits(int num)
    {  
        int iDigit = 0;
        int iProduct = 1;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            iProduct = iProduct * iDigit;
        }
        System.out.println("Product of digits is "+iProduct);
    }
}
class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.ProductOfDigits(234);
    }
}


