package operators;

public class OperatorsInJava2 {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(Integer.toBinaryString(number)); //convert decimal value to binary

        //Shift Operators : << , >> , >>>
        // << : Left Shift
        // >> : Right Shift ( singed right shift )
        // >>> : Right Shift with zero filled  ( unsigned right shift )

        //Left Shift : <<
        // formula for left shift :
        // eg, y << z
        // Formula : y * 2^z
        System.out.println("Left Shift");
        int num1 = 10 << 2; //add two zero to the right
        // 10 == 1010
        //1 0 1 0 0 0 == 40
        System.out.println("10 << 2 == " + num1);

        int num2 = 8 << 3; //add three zero to the right
        //by using formula : 8 * 2^3 = 8 * 8 = 64
        System.out.println("8 << 3 == " + num2); //64


        //Right Shift : >>, >>>
        // formula for right shift :
        // eg, y >> z
        // Formula : y / 2^z

        System.out.println("Right Shift");
        int numRight = 6 >> 3;
        //6 / 2^3 = 6/8 = 3/4 = 0
        System.out.println("6 >> 3 = "+ numRight);

        int number1 = -6 >> 2;
        System.out.println("-6 >> 2 = "+number1);

//        int number2 = 8 >> 4;
//        //0 0 0 0 = 0
//        System.out.println(number2);
//
//        int number3 = 6 >>> 2;
//        System.out.println("6 >>> 2 == "+number3);
//
//        int number4 = -6 >>> 2;
//        System.out.println("-6 >>> 2 == "+number4);


       // 6. Assignment Operator  : =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=

        int value = 10;
        value <<= 2; //value = value << 2;
        //101000 =   8 + 32 = 40
        System.out.println(value);

        int value2 = 8;
        value2 >>= 2; // value2 = value2 >> 2;
        // 1000 >> 2 =  0 0 1 0 = 2
        System.out.println(value2);


        //Ternary Operator : condition ? expressionIfTrue : expressionIfFalse
        int mark = 39;
        String result = (mark>=40)?"Pass":"Fail";
        System.out.println(result);

        boolean result3 = (mark>=40)?true: false;
        System.out.println(result3);

        char result4 = (mark>=40)? 'P' : 'F';
        System.out.println(result4);

        int result2 = (mark>=40)?1:10;
        System.out.println(result2);

        //Check leap year using ternary operator
        int year = 2022;
        String yearResult = (year%4 == 0)?"Leap Year" : "Not Leap Year";
        System.out.println(yearResult);

    }
    /*
    Decimal
    10^0 = 1
    10^1 = 10
    10^2 = 100
    10^3 = 1000

    */

    /*
    Binary
    2^0 = 1
    2^1 = 2
    2^2 = 4
    2^3 = 8
    2^4 = 16
    2^5 = 32


 2^6 2^5  2^4 2^3  2^2  2^1 2^0
  64  32  16   8    4    2   1
               1    0    0   0   == 8
           1   0    0    1   0   == 18
       1   0   1    0    0   0   == 40
   1   0   0   0    0    0   0   == 64

   */


}
