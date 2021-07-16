/**
 * Provides the classes App.
 * <p>
 * The applet only outputs the string "Hello World!".
 * An applet is an embeddable window (see the
 * {@link java.awt.} class) with a few extra
 * methods that the applet context can use to
 * initialize, start, and stop the applet.
 *
 * @since 1.0
 * @see java.awt
 */
package com.mkl_github_organization.app;
/**
 * java package names MUST NOT contain hyphons.
 * http://java.sun.com/docs/books/jls/third_edition/html/packages.html
**/


public class App {
    /** 
     * Outputs a single phrase.
     * @since 1.0
     **/
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
