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
public class Motorcycle implements Builder {
	private String brandName;
	private Product product;
	
	public Motorcycle(String brand)
	{
		product = new Product();
		this.brandName = brand;

	}
	
	public void startUpOperations()
	{ //Nothing in this case
	}
	public void buildBody()
	{
		product.add("This is a body of a Motorcycle");
	}
	public void insertWheels()
	{
		product.add("2 wheels are added");
	}
	public void addHeadlights()
	{
		product.add("1 Headlights are added");
	}
	public void endOperations()
	{
		//Finishing up with brand name
		product.add(String.format("Motorcycle model is :%s", this.brandName));
	}
	public Product getVehicle()
	{
		return product;
	}
}