package model;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */

/**
 * Person that can belong to a group. A person can belong to only one group
 * A group can contain many people. 
 */
public class PersonOneToMany
{

	private GroupManyToOne group;
	
	
	public PersonOneToMany(){}


	public GroupManyToOne getGroup() {
		return group;
	}


	public void setGroup(GroupManyToOne group) {
		if(this.group!=null){
			this.group.removePerson(this);
		}
		this.group = group;
		if(!this.group.getPeople().contains(this))
			this.group.addPerson(this);
	}
	
	

}

