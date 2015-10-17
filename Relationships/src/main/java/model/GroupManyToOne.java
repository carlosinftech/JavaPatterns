package model;
import java.util.ArrayList;
/**
 * Created by carlos perez on 2015-06-10.
 */
import java.util.Collection;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */


/**
 * Group that contains people. A person can belong to only one group
 * A group can contain many people. 
 */
public class GroupManyToOne
{

	
	private Collection<PersonOneToMany> people;
	
	
	public GroupManyToOne(){
		people = new ArrayList<>();
	}


	public Collection<PersonOneToMany> getPeople() {
		return people;
	}


	public void addPerson(PersonOneToMany Person) {
		this.people.add(Person);
		if(Person.getGroup()!=this)
			Person.setGroup(this);
	}

	public void removePerson(PersonOneToMany Person) {
		this.people.remove(Person);
	}
}

