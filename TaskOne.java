import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        /*System.out.println("----------------------QUESTION 1:Write a program to print numbers from 10 to 50 using for/while loop--------------------------");
        System.out.println("Printing Numbers 10 to 50 using While loop :");

        System.out.println(questionOneWhile());
        System.out.println("Printing Numbers 10 to 50 using For loop :");
        System.out.println("******************************************");
        System.out.println(questionOneFor());
        System.out.println("******************************************");
        System.out.println("-----------------END OF QUESTION 1--------------------------");
        System.out.println("                           ");
        System.out.println("----------------------QUESTION 2:Write a program to find given number is positive or negative------------");
        questionTwo();
        System.out.println("-----------------END OF QUESTION 2--------------------------");
        System.out.println("                           ");
        System.out.println("----------------------QUESTION 3:Write down the program to reverse the given number using loops------------");
        questionThree();
        System.out.print("-----------------END OF QUESTION 3--------------------------");
        System.out.println("                           ");
        System.out.println("----------------------QUESTION 4:Write a java program to Find the smallest among three numbers------------");
        questionFour();
        System.out.println("-----------------END OF QUESTION 4--------------------------");
        System.out.println("                           ");
        System.out.println("----------------------QUESTION 5: write program to find discount applied for purchase amount-----------");
        questionFive();
        System.out.println("-----------------END OF QUESTION 5--------------------------");*/
        System.out.println("                           ");
        System.out.println("----------------------QUESTION 6: write program to print pattern-----------");
        questionSix();
        System.out.println("-----------------END OF QUESTION 6--------------------------");
        System.out.println("                           ");
    }

    public static int questionOneWhile() //1.Write a program to print numbers from 10 to 50 using while loop
    {
        int i = 10;
        while (i < 50) {
            System.out.print(i + " ");
            i++;
        }
        return i;
    }
//1.Write a program to print numbers from 10 to 50 using FOR loop
    public static int questionOneFor()
    {

        int j;
        for (j = 10; j != 50; j++) {
            System.out.print(j + " ");

        }
        return j;

    }
//2. Program to find entered number is positive or negative
    public static int questionTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");//prompt user to enter number
        int number = scanner.nextInt();//entered number stored in number variable

        if ((number > 0)) {//to validate the condition if no greater than 0 is positive and less than 0 is negative if nothing is zero
            System.out.println(number + " is a positive number.");

        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        return number;
    }
//3. Program to print the entered number in reverse
    public static int questionThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");//prompting user to enter the number
        int n = scanner.nextInt();// number enter by user is store in n
        // int n = 876;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;// to get last digit
            System.out.print(rem);
            n = n / 10;//remove the last digit
        }
        return n;
    }
//4. program to find the smallest of three numbers entered by user
    public static int questionFour() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "); //prompting user to input number 1
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");//prompting user to input number 2
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");////prompting user to input number 3
        int num3 = scanner.nextInt();
        int smallest = num1;

        if (num2 < smallest) {// condition logic to find the smallest
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }
        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);

        return smallest;

    }

    //5. Program to find discount applied for purchase amount
    public static float questionFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a purchase amount: ");
        float PA = scanner.nextFloat();
        if (PA < 501) {//if purchase amount less than 500 then no discount applied
            System.out.println("no discount applied");
        } else if (PA > 500 & PA <= 1000) {//if purchase amount greater than 500 and lessthan equal to 1000 is 10% discount applied
            System.out.println("10% discount applied");
        } else if (PA > 1000) {// //if purchase amount greater than 1000 then 20% discount applied
            System.out.println("20% discount applied");
        }

        return PA;
    }
//6. to print patter as defined in task
    public static int questionSix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = scanner.nextInt();
        //int k = 5;
        int i, j;
        for (i = 0; i < 5; i++) {//row loop
            for (j = 0; j <= 5; j++) {//column loop
                if (j <= i) {//condition check not to get more than 5 rows
                    System.out.print(k - j);
                } else {
                    System.out.print(k - i);
                }
            }
            System.out.println();

        }
        return k;
    }
}

