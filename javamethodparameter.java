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


