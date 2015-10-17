package model;

import java.util.ArrayList;
import java.util.Collection;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */

/**
 * Group that contains People. A person can belong to many groups
 * A group can contain every person available 
 */
public class GroupManyToMany
{
	
	
	private Collection<PersonManyToMany> People;
	
	public GroupManyToMany(){
		People = new ArrayList<>();
	}


	public Collection<PersonManyToMany> getPeople3() {
		return People;
	}


	public void addPerson(PersonManyToMany etudiant) {
		this.People.add(etudiant);
		if(!etudiant.getgroupes().contains(this))
			etudiant.addGroup(this);
	}

	
	public Collection<PersonManyToMany> getPeople() {
		return People;
	}



	
}

