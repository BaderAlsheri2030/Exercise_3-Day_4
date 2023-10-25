// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);





        //Exercise 1
        int num = 1;
        while (num <= 100){
             if (num%5 == 0 && num%3 == 0){
                System.out.println("FizzBuzz");
            }
            else if (num%3 == 0){
                System.out.println("Fizz");
            }

            else if(num%5 == 0){
                System.out.println("Buzz");  }

            else  System.out.println(num);


            num++;
        }

        //Exercise 2

        String sentence;
        do{
            System.out.println("Type a sentence or type EXIT to quit");
            sentence = input.nextLine();
            StringBuilder str = new StringBuilder(sentence);
            if ((sentence.equalsIgnoreCase("Exit"))){
                System.out.println("thank you");
                break;
            }
            else  System.out.println(str.reverse());

        } while(!(sentence.equalsIgnoreCase("Exit")));


        //Exercise 3

        System.out.println("Enter a number");
        int n = input.nextInt();
        int factorial =1;
        for (int i=1; i<=n;i++)
            factorial *=i;
        System.out.println(factorial);


        //Exercise 4

        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int power = input.nextInt();
        int value = 1;
        for (int j = 1; j <= power; j++) {
            value *=num1 ;
        }
        System.out.println(value);



        //Exercise 5

        System.out.println("Enter how many numbers you want");
        int numbers = input.nextInt();
        int num4;
        int totalEven = 0;
        int totalOdd = 0;
        for (int i = 1; i <= numbers ; i++) {
            System.out.println("Enter odd or even number");
            num4 = input.nextInt();
            if(num4 <0) {
                System.out.println("Please enter positive numbers");
                continue;
            }
            else if(num4%2 == 0){
                totalEven += num4;
            }
            else if (num4%2 != 0){
                totalOdd +=num4;
            }
            else
                break;
        }
        System.out.println("sum of even numbers = "+totalEven);
        System.out.println("sum of odd numbers = "+totalOdd);



        //Exercise 6

        System.out.println("Enter a positive number");
        int positiveNumber = input.nextInt();

        while (positiveNumber > 0){
            if (positiveNumber == 2){
                System.out.println(positiveNumber+" is a prime number");
                break;
            } else if (positiveNumber == 1) {
                System.out.println(positiveNumber+" is not a prime number");
            } else if (positiveNumber%2 != 0){
                System.out.println(positiveNumber+" is a prime number");
                break;
            }
            else System.out.println(positiveNumber+" is not a prime number");
            break;
        }


        //Exercise 7
        for (int i = 1; i <= 4; i++) {
            System.out.println("Week "+i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("Day "+j);
            }
        }

        //Exercise 8
        System.out.println("Enter a word");
        String word = input.next();
        StringBuilder str1 = new StringBuilder(word);
        String temp;
        String temp2;

        for (int i = 0; i <= word.length()-1; i++) {
            temp = word.substring(0,word.length()-1);
            temp2 = str1.reverse().substring(0,str1.length()-1);
            if (temp2.equalsIgnoreCase(temp)) {
                System.out.println(word +" is palndirome");
                break;
            }

            else System.out.println("is not palndirome");
            break;
        }










    }
    }
