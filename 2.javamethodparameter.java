Parameters and Arguments
Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. 
You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a String called fname as parameter. 
When the method is called, we pass along a first name, which is used inside the method to print the full name:
Example
import java.io.*;
public class Main{
public static void myMethod(String fname){
System.out.println(fname + " Chowdary ");
}
public static void main(String[] args){
myMethod("Yogitha");
myMethod("Yogi");
}}
/*
    Yogitha Chowdary
    Yogi Chowdary
*/
When a parameter is passed to the method, it is called an argument. 
So, from the example above: fname is a parameter, while Yogitha and Yogi are arguments.
Example
import java.io.*;
public class Main{
public static void myMethod(String fname, int age){
System.out.println(fname + " Chowdary  is " + age);
}
public static void main(String[] args){
myMethod("Yogitha ",  20);
myMethod("Yogi ",19);
}}
/*
    Yogitha Chowdary is 20
    Yogi Chowdary is 19
*/
Note : when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, 
        and the arguments must be passed in the same order.

Return Values
The void keyword, used in the examples above, indicates that the method should not return a value.
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
instead of void, and use the return keyword inside the method:
Example
public class Main{
static int myMethod(int x){
return 5 + x;
}
public static void main(String[] args){
System.out.println(myMethod(4));
}
}
/*
    9
*/

This example returns the sum of a method's two parameters:
public class Main{
static int myMethod(int x, int y){
return x + y;
}
public static void main(String[] args){
System.out.println(myMethod(3 , 2));
}
}
/*
    5
*/

Method with If else 
It is common to use if...else statements inside methods:
public class Main{
static void checkage(int age){
if(age < 18){
System.out.println("Your Access is denied");
}
else{
System.out.println("Your Access is granted");
}
}
public static void main(String[] args){
checkage(15);
}
}
/*
    Your Access is denied
*/
