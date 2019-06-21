import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in a number");
        int maxNum = keyboard.nextInt();
        boolean isPrime;
        int j;
        int x;

        for (j = 1; j <= maxNum; j++) {
            isPrime=true;
            if (j == 2) {
                System.out.println(j + " is a prime number");
            } else if (j == 1) {
                System.out.println(j + " is not a prime number");
            } else {
                for (x = 2; x < j; x++)
                    if (j % x == 0) {
                        isPrime=false;
                    }
            if (!isPrime) {
                System.out.println(j + " is not a prime number");
            }else
            {
                System.out.println(j + " is a prime number");
            }
            }

        }
    }
}


            /*
            if (maxNum <= 3) {
                System.out.println("Prime");
            } else if (maxNum > 3)
                for (i = 2; i < maxNum; i++) {
                    if (maxNum % 2 == 0) {
                        System.out.println("not prime1");
                        break;
                    } else if (maxNum % 3 == 0) {
                        System.out.println("not a prime2");
                        break;
                    } else if (maxNum % i == 0) {
                        System.out.println("not prime3");
                    }
                }
            else

            {
                System.out.println("Prime");
            }
        }
    }}






























          // else
           //{
             //  System.out.println("prime");
/*
        }
        }

*/

        /*

        int i;
        int num2= (maxNum-1);
       int n;
        if (n <= 1) return false;
        {




        }
}
 /*

  static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    } int num;

        Scanner.keybord = new Scanner;


                for (int j=2; j< num; j++);
        if (num % j == 0) (
        System.out.println(num + "divisible by " + j);
        isPrime= false;


        if (isPrime) {
        System.out.println(num + "is a prime number."
        } else {
        System.out.println(num +
        )
        */