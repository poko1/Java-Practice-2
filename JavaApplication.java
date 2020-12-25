/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Maliha
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public int addNumbers(int a) {
    int sum = a + 5;
    // return value
    return sum;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 25;
    int num2 = 15;

    // create an object of Main
    JavaApplication obj = new JavaApplication();
    // calling method
    int result = obj.addNumbers(num1);
    System.out.println("Sum is: " + result);
    }

}
