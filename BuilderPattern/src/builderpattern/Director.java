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
public class Director {
	Builder builder;
	// Director knows how to use the builder and the sequence of steps.
	public void construct(Builder builder)
	{
		this.builder = builder;
		builder.startUpOperations();
		builder.buildBody();
		builder.insertWheels();
		builder.addHeadlights();
		builder.endOperations();
	}
}
