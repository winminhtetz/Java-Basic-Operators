package operators;

/** Operators
 *  1. Unary Operator       : ++, --
 *  2. Arithmetic Operator  : *, /, %, +, -
 *  3. Relational Operator  : <, >, >=, <=, ==, !=
 *  4. Bitwise Operator     : &, ^, |
 *  5. Logical Operator     : &&, ||
 *  6. Assignment Operator  : =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
 *  7. Shift Operator       : <<, >>, >>>
 *  8. Ternary Operator     : condition ? expressionIfTrue : expressionIfFalse
 */

//Operators တွေကို အနှစ်ချုပ်ရင် -
    //1. Unary Operator    : operand တစ်ခုစာ အလုပ်လုပ်ပေး။
    //2. Binary Operator   : operand နှစ်ခုစာ အလုပ်လုပ်ပေး။
    //3. Ternary Operator  : operand သုံးခုစာ အလုပ်လုပ်ပေး။

public class OpeartorsInJava {
    public static void main(String[] args) {
        //Unary Operator : ++, --
        // ++a : prefix
        // a-- : postfix
        int num1 = 4;
        System.out.println("num1   : "+ num1);
        System.out.println("num1++ : "+ num1++); //4
        System.out.println();
        int num2 = 4;
        System.out.println("num2   : "+ num2);
        System.out.println("++num2 : "+ ++num2); //5


        //Arithmetic operator => * , / , % , +, -
        int plus = 15 + 19;
        System.out.println("15 + 19 = "+ plus);
        int minus = 20 - 5;
        System.out.println("20 - 5 = "+ minus);
        int multiply = 20 * 4;
        System.out.println("20 * 4 = "+ multiply);
        int divided = 12 / 4;
        System.out.println("12 / 4 = "+ divided);
        int modulus = 34 % 3;
        System.out.println("36 % 3 = "+ modulus);

        //Relational Operator or Comparison : > < >= <= == !=
        int value1 = 10;
        int value2 = 15;
        boolean result2 = value1 > value2;
        System.out.println(value1 +">"+ value2 + "=" + result2);

        System.out.println(value1 > value2); //false
        System.out.println(value1 < value2); //true
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);

        //Logical Operator : &&, ||
        int value3 = 5;
        int value4 = 8;
        int value5 = 6;
        int value6 = 9;

        System.out.println("Logical AND");
        System.out.println(value3>value4 && value5<value6); //false

        System.out.println("Logical OR");
        System.out.println(value3>value4 || value5<value6); //true

        //Bitwise Operator : & ^ |
        //& == bitwise AND
        //^ == bitwise OR (or) exclusive OR
        //| == bitwise OR (or) inclusive OR
        System.out.println("Bitwise AND");
        System.out.println(value3<value4 & value5<value6); //true

        //Bitwise inclusive OR :
        // true  | true == true
        // true  | false == true
        // false | true == true
        // false | false == false
        System.out.println("Bitwise inclusive OR");
        System.out.println(value3>value4 | value5<value6); //true


        //Bitwise exclusive OR :
        // true  ^ true == false
        // true  ^ false == true
        // false ^ true == true
        // false ^ false == false
        System.out.println("Bitwise exclusive OR");
        System.out.println(5>8 ^ 6>8); // false ^ false == false

        //Assignment operator : = , += , -= , *=, /= , %=, &=, |= , ^= <<= >>= >>>=
        int total1 = 100;
        total1 += 20; //total = total + 20;
        System.out.println(total1);

        int total2 = 100;
        total2 -= 40; //total = total - 40;
        System.out.println(total2);

        int total3 = 2;
        total3 *= 2; //total = total * 2;
        System.out.println(total3);

        int total4 = 12;
        total4 /= 3; //total = total/3;
        System.out.println(total4);

        int total5 = 12;
        total5 %= 3; //total = total%40;
        System.out.println(total5);


    }
}
