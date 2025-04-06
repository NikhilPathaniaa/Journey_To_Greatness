// Check whether a given number is even or odd

// Examples: 

// Input: 2 
// Output: true


// Input: 5
// Output: false

class EvenOrOdd
{
    public static void main(String[] args)
    {
        int num = 5;
        if(isEven(num))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    static boolean isEven(int n) {
        if(n%2 == 0)
            return true;
        else
            return false;
    }
}

// Output: Odd