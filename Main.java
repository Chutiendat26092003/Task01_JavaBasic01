public class Main {

    public static void main(String[] args) {
//1
	System.out.println("Hello, java");

System.out.println("------------------------------------");
System.out.println();

//6
    System.out.println("Hello, world!");
    System.out.println("Hello, world again!");
    System.out.println();
    System.out.print("Hello world!");
    System.out.print("Hello world again!");
    System.out.println();
    System.out.print("Hello,");
    System.out.print(" ");
    System.out.println("world!");
    System.out.println("Hello, world!");

System.out.println();

//6.1
//a
// * * * * *
//  * * * * *
// * * * * *
//  * * * * *
// * * * * *
    System.out.println("* * * * *");
    System.out.println(" * * * * *");
    System.out.println("* * * * *");
    System.out.println(" * * * * *");
    System.out.println("* * * * *");

System.out.println();

//b
// * * * * *
// *       *
// *       *
// *       *
// * * * * *
    System.out.println("* * * * *");
    System.out.println("*       *");
    System.out.println("*       *");
    System.out.println("*       *");
    System.out.println("* * * * *");

System.out.println();

//c
// * * * * *
//  *     *
//   *   *
//    * *
//     *
    System.out.println("* * * * *");
    System.out.println(" *     * ");
    System.out.println("  *   *  ");
    System.out.println("   * *   ");
    System.out.println("    *    ");

System.out.println();

//d
//    *
// **   **
//   * *
//  *   *
// *     *
    System.out.println("    *    ");
    System.out.println(" **   **");
    System.out.println("   * *  ");
    System.out.println("  *   *   ");
    System.out.println(" *     *");

System.out.println();

//6.2
//         '__'
//         (@@)
//  /=======//
// / || @@  ||
//*  ||-----||
//   vv     vv
//   ''     ''
    System.out.println("         '__'");
    System.out.println("         (@@)");
    System.out.println("  /=======//");
    System.out.println(" / || @@  ||");
    System.out.println("*  ||-----||");
    System.out.println("   vv     vv");
    System.out.println("   ''     ''");

System.out.println("------------------------------------");
System.out.println();

//7
    int number1 = 11;
    int number2 = 22;
    int number3 = 33;
    int number4 = 44;
    int number5 = 55;
    int sum;
    sum = number1 + number2 + number3 + number4 + number5;
	System.out.print("The sum is ");
	System.out.println(sum);

System.out.println();

//7.1-2
    int number712_1 = 11;
    int number712_2 = 22;
    int number712_3 = 33;
    int number712_4 = 44;
    int number712_5 = 55;
    int number712_6 = 66;
    int number712_7 = 77;
    int sum712;
    sum712 = number712_1 + number712_2 + number712_3 + number712_4 + number712_5 + number712_6 + number712_7;
	System.out.print("The sum is ");
	System.out.println(sum712);

System.out.println();

//7.3
    int price1 = 20;
    int qty1 = 5;
    int price2 = 30;
    int qty2 = 4;
    int price3 = 40;
    int qty3 = 6;
    int price4 = 50;
    int qty4 = 8;
    int price5 = 60;
    int qty5 = 4;

    int total;

    System.out.print("Product1 - Price:$");
    System.out.print(price1);
    System.out.print(" - Quantity:");
    System.out.print(qty1);
    System.out.println();

    System.out.print("Product2 - Price:$");
    System.out.print(price2);
    System.out.print(" - Quantity:");
    System.out.print(qty2);
    System.out.println();

    System.out.print("Product3 - Price:$");
    System.out.print(price3);
    System.out.print(" - Quantity:");
    System.out.print(qty3);
    System.out.println();

    System.out.print("Product4 - Price:$");
    System.out.print(price4);
    System.out.print(" - Quantity:");
    System.out.print(qty4);
    System.out.println();

    System.out.print("Product5 - Price:$");
    System.out.print(price5);
    System.out.print(" - Quantity:");
    System.out.print(qty5);
    System.out.println();

    total = price1*qty1 + price2*qty2 + price3*qty3 + price4*qty4 + price5*qty5;

    System.out.print("The total is $");
    System.out.println(total);


System.out.println("------------------------------------");
System.out.println();

//8
    double radius, area, circumference;
    final double PI = 3.14159265;
    radius = 1.2;

    area = radius * radius * PI;
    circumference = 2.0 * radius * PI;

    System.out.print("The radius is ");
    System.out.println(radius);
    System.out.print("The area is ");
    System.out.println(area);
    System.out.print("The circumference is ");
    System.out.println(circumference);

System.out.println();

//8.1
    double length, width, area_81, perimeter;
    length = 10.5;
    width = 20;

    area_81 = length * width;
    perimeter = ( length + width ) * 2;

    System.out.print("The length is ");
    System.out.println(length);
    System.out.print("The width is ");
    System.out.println(width);
    System.out.print("The area_81 is ");
    System.out.println(area_81);
    System.out.print("The perimeter is ");
    System.out.println(perimeter);

System.out.println();

//8.2
    double radius_82, height_82, surfaceArea, baseArea, volume;
    final double PI_82 = 3.14159265;
    radius_82 = 5.5;
    height_82 = 20.3;

    surfaceArea = radius_82 * radius_82 * PI_82;
    baseArea = 2.0 * radius_82 * PI_82 * height_82;
    volume = surfaceArea * height_82;

    System.out.print("The radius is ");
    System.out.println(radius_82);
    System.out.print("The height is ");
    System.out.println(height_82);
    System.out.print("The surface area is ");
    System.out.println(surfaceArea);
    System.out.print("The base area is ");
    System.out.println(baseArea);
    System.out.print("The volume is ");
    System.out.println(volume);

System.out.println("------------------------------------");
System.out.println();

//10
    int number10_1 = 98;
    int number10_2 = 5;
    int sum10, difference10, product10, quotient10, remainder10;

    sum10 = number10_1 + number10_2;
    difference10 = number10_1 - number10_2;
    product10 = number10_1 * number10_2;
    quotient10 = number10_1 / number10_2;
    remainder10 = number10_1 % number10_2;

    System.out.print("The sum, difference, product, quotient and remainder of ");
    System.out.print(number10_1);
    System.out.print(" and ");
    System.out.print(number10_2);
    System.out.print(" are ");
    System.out.print(sum10);
    System.out.print(", ");
    System.out.print(difference10);
    System.out.print(", ");
    System.out.print(product10);
    System.out.print(", ");
    System.out.print(quotient10);
    System.out.print(", and ");
    System.out.println(remainder10);

    ++number10_1;
    --number10_2;

    System.out.println("number10_1 after increment is " + number10_1);
    System.out.println("number10_2 after decrement is " + number10_2);
    quotient10 = number10_1 / number10_2;
    System.out.println("The new quotient of " + number10_1 + " and " + number10_2 + " is " + quotient10);

System.out.println();

//10.1
    System.out.println("The sum, difference, product, quotient and remainder of " + number10_1 + " and " + number10_2 +
                       " are " + sum10 + ", " + difference10 + ", " + product10 + ", " + quotient10 + ", and " + remainder10);

System.out.println();

//10.2
    System.out.println("The sum 31number1 and 17number2 is " + (number10_1*31 + number10_2*17));

System.out.println();

//10.3
    int number10_3 = 77;

    System.out.println("The sum is " + (number10_1 + number10_2 + number10_3));
    System.out.println("The volume is " + (number10_1 * number10_2 * number10_3));


System.out.println("------------------------------------");
System.out.println();

//11
    int lowerbound = 1;
    int upperbound = 1000;
    int sum11 = 0;

    int number11 = lowerbound;
    while (number11 <= upperbound) {
        sum11 = sum11 + number11;
        ++number11;
    }
    System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum11);

System.out.println();

//11.1
    int lowerbound11_1 = 9;
    int upperbound11_1 = 899;
    int sum11_1 = 0;

    int number11_1 = lowerbound11_1;
    while (number11_1 <= upperbound11_1) {
        sum11_1 = sum11_1 + number11_1;
        ++number11_1;
    }
    System.out.println("The sum from " + lowerbound11_1 + " to " + upperbound11_1 + " is " + sum11_1);

System.out.println();

//11.2
    int lowerbound11_2 = 1;
    int upperbound11_2 = 1000;
    int sum11_2 = 0;

    int number11_2 = lowerbound11_2;
    while (number11_2 <= upperbound11_2) {
        sum11_2 = sum11_2 + number11_2;
        number11_2 = number11_2 + 2;
    }
    System.out.println("The sum odd from " + lowerbound11_2 + " to " + upperbound11_2 + " is " + sum11_2);

System.out.println();

//11.3
    int lowerbound11_3 = 7;
    int upperbound11_3 = 1000;
    int sum11_3 = 0;

    int number11_3 = lowerbound11_3;
    while (number11_3 <= upperbound11_3) {
        sum11_3 = sum11_3 + number11_3;
        number11_3 = number11_3 + 7;
    }
    System.out.println("The sum of all numbers divisible by 7 from " + lowerbound11_3 + " to " + upperbound11_3 + " is " + sum11_3);

System.out.println();

//11.4
    int lowerbound11_4 = 1;
    int upperbound11_4 = 100;
    int sum11_4 = 0;

    int number11_4 = lowerbound11_4;
    while (number11_4 <= upperbound11_4) {
        sum11_4 = sum11_4 + number11_4 * number11_4;
        ++number11_4;
    }
    System.out.println("The sum of squares from " + lowerbound11_4 + " to " + upperbound11_4 + " is " + sum11_4);

System.out.println();

//11.5
    int lowerbound11_5 = 1;
    int upperbound11_5 = 10;
    int product11_5 = 1;

    int number11_5 = lowerbound11_5;
    while (number11_5 <= upperbound11_5) {
        product11_5 = product11_5 * number11_5;
        ++number11_5;
    }
    System.out.println("The product of numbers from " + lowerbound11_5 + " to " + upperbound11_5 + " is " + product11_5);

System.out.println("------------------------------------");
System.out.println();

//12
    int lowerbound12 = 1;
    int upperbound12 = 1000;
    int sumOdd = 0;
    int sumEven = 0;
    int number12 = lowerbound12;

    while (number12 <= upperbound12) {
        if (number12 % 2 == 0) {
            sumEven += number12;
        } else {
            sumOdd += number12;
        }
    }

    System.out.println("The sum of odd numbers from " + lowerbound12 + " to " + lowerbound12 + " is " + sumEven);
    System.out.println("The sum of even numbers from " + lowerbound12 + " to " + lowerbound12 + " is " + sumOdd);
    System.out.println("The difference between the two sums is " + (sumOdd - sumEven));

System.out.println();

//12.1
    int lowerbound12_1 = 1;
    int upperbound12_1 = 1000;
    int sum12_1 = 0;
    int number12_1 = lowerbound12_1;

    while (number12_1 <= upperbound12_1) {
        if (((number12_1 % 3 == 0) || (number12_1 % 3 == 0) || (number12_1 % 3 == 0)) && ((number12_1 % 15 != 0) || (number12_1 % 21 != 0) || (number12_1 % 35 != 0) || (number12_1 % 105 != 0))) {
            sum12_1 += number12_1;
        }
    }

    System.out.println("The sum " + lowerbound12_1 + " to " + lowerbound12_1 + " is " + sum12_1);



System.out.println("------------------------------------");
System.out.println();

    }
}
