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
public class BuilderPatternExample {
	public static void main(String[] args) 
	{
		System.out.println("***Builder Pattern Demo***");
		Director director = new Director();
		Builder fordCar = new Car("Ford");
		Builder hondaMotorycle = new Motorcycle("Honda");
		
		// Making Car
		director.construct(fordCar);
		Product p1 = fordCar.getVehicle();
		p1.showProduct();
		
		//Making MotorCycle
		director.construct(hondaMotorycle );
		Product p2 = hondaMotorycle.getVehicle();
                p2.showProduct();
        
                //Menampilkan NIM
                System.out.println("0110217068");
	}
}