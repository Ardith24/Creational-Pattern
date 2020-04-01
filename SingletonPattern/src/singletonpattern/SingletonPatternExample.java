/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author Ardith L
 */
public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error

        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");

        Captain captain2 = Captain.getCaptain();
        System.out.println("captain1:" + captain1);
        System.out.println("captain2:" + captain2);
        if (captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance.");
        }
    }
}
