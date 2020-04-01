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
interface Builder
{
	void startUpOperations();
	void buildBody();
	void insertWheels();
	void addHeadlights();
	void endOperations();
	
	/*The following method is used to retrieve the object that is
	constructed.*/
	Product getVehicle();
}
