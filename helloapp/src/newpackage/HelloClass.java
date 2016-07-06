/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author a.supranovich
 */
public class HelloClass {
    
    private static int getInt() {
        return 1;
    }
    
    private static String getString() {
        return "string";
    }
    
    public static void main(String arg[]) {
        System.out.println("Hello!");
    }
    
    public static void showSomeOutput() {
        System.out.println(getInt());
        System.out.println(getString());
    }
}
