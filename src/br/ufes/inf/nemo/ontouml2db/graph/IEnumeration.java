/**
 * The Enumeration is treated as a special type of Property. In addition to 
 * having all the features of OntoProperty, it is also capable of adding 
 * several values of the same type.
 * 
 * Author: Gustavo L. Guidoni
 * 
 */
package br.ufes.inf.nemo.ontouml2db.graph;

import java.util.ArrayList;

public interface IEnumeration extends IOntoProperty {

	/**
	 * Adds a new value belonging to the Enumeration.
	 * 
	 * @param value. Name to be added.
	 */
	public void addValue(String value);
	
	/**
	 * Returns the names belonging to the Enumeration.
	 * 
	 * @return The ArrayList with the names.
	 */
	public ArrayList<String> getValues();
}
