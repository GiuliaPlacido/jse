/*

 * A simple Java source file
 */
package m01.s02;

import java.lang.Math; // not required

/**
 * A "hello" class
 * 
 * @author Emanuele Galli
 */
public class Simple {
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Hello, ");

        // if the caller passes exactly one parameter, output it
        if (args.length == 1) {
            System.out.println(args[0]);
        } else {
            // otherwise output PI
            System.out.println(Math.PI);
        }
    }
}

class PackageClass {
    // TODO: Not implemented (yet)
}
