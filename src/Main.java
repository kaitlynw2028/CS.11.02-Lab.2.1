import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
Kaitlyn Wong
*/

public class Main {

    public static void main(String[] args) {
System.out.println(add(2,3,4,5));
String morning = morningGreeting("Toby Fox");
System.out.println(morning);
String afternoon = afternoonGreeting("Mac Miller");
System.out.println(afternoon);
String tripled = triple("oohbaby");
System.out.println(tripled);
double halfOfEight = half(8);
System.out.println(halfOfEight);
double halfOfSeventeen = half(17);
System.out.println(halfOfSeventeen);
//long roundPositiveTwoDecimalToNearestInteger = Math.round(8.49);
//System.out.println(roundPositiveTwoDecimalToNearestInteger);
//long roundNegativeOneDecimalToNearestInteger = Math.round(-8.5);
//System.out.println(roundNegativeOneDecimalToNearestInteger);
//long roundNegativeTwoDecimalToNearestInteger = Math.round(-8.49);
//System.out.println(roundNegativeTwoDecimalToNearestInteger);
    }

    // 1. add add(3,8) → 11
    public static int add(int a, int b) {
        return a+b;
    }
    
    // 2. add add(3,8,4,9) → 24
    public static int add(int a, int b, int c, int d) {
        int x = add(a,b);
        int y = add(c,d);
        return add(x,y);
    }

    // 3. morningGreeting morningGreeting(“Toby Fox”) → 早上好, Toby Fox!
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";

    }

    // 4. afternoonGreeting
public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
}

    // 5. triple
    public static String triple(String text){
        return text + text + text;
    }

    // 6. half
    public static double half(int number){
        return (double) number / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num){
        return (int) ( num + 0.5);
    }

   // int = (int) (d + 0.5) and then cut off the decimal

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num){
        return (int) ( num - 0.5);
    }

}




// ifelse statment
// System.out.print("Please enter your favourite food: ");
// Scanner sc = new Scanner (System.in);
// String food= sc.nextline();
// if (food.toLowerCase().equals("fries"));
//    System.out.println("Have some ketchup!");
// else {
//      System.out.println("Enjoy your " + food + "!");
//     }
