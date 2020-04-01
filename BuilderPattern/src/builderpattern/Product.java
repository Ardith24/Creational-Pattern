/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Ardith L
 */
import java.util.LinkedList;

public class Product {
	/* You can use any data structure that you prefer.
	I have used LinkedList<String> in this case.*/
	private LinkedList<String> parts;
	public Product()
	{
		parts = new LinkedList<String>();
	}
	
	public void add(String part)
	{
		//Adding parts
		parts.addLast(part);
	}
	public void showProduct()
	{
		System.out.println("\nProduct completed as below :");
	for (String part: parts)
		System.out.println(part);
	}
}
