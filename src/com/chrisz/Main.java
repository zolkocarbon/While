package com.chrisz;

public class Main {

    public static void main(String[] args) {
	// While loops
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        // do while executes at leas once
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);


        // ************ Challenge 1
        // NOTE USE OF CONTINUE
        System.out.println(isEvenNumber(4));
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue; // if number is odd don't execute anything below this line
            }
            System.out.println("Even number " + number);
        }

        // ************* Challenge 2
        System.out.println("********* Challenge 2 **********");
        int number2 = 4;
        int finishNumber2 = 20;
        int count2 = 0;

        while (number2 <= finishNumber2) {
            number2++;
            if(!isEvenNumber(number2)) {
                continue;
            } else {
                count2++;
                if(count2 >= 6) {
                    break;
                }
            }
            System.out.println("Even number " + number2);
        }

        // ************ Challenge 3
        System.out.println(sumDigits(125));
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

    // ********* Challenge 3
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int hundreds = number / 100;
        int tenths = (number - hundreds*100) / 10;
        int ones = number - hundreds*100 - tenths*10;
        return hundreds + tenths + ones;

        /* instructor solution
        // int sum = 0;
        while(number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;
            // drop least-significant digit
            number /= 10;
        }
        return sum;
        }
        */
    }
}
