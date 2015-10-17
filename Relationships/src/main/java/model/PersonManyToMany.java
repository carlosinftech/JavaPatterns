package model;

import java.util.ArrayList;
import java.util.Collection;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */





public class PersonManyToMany
{
	/**
	 * Person that belongs to a group. A person can belong to many groups
	 * A group can contain every person available 
	 */
	
	private Collection<GroupManyToMany> groupes;
	

	public PersonManyToMany(){
		groupes = new ArrayList<>();
	}

	public Collection<GroupManyToMany> getGroupes() {
		return groupes;
	}

	public void addGroup(GroupManyToMany group) {
		this.groupes.add(group);
		if(!group.getPeople().contains(this))
			group.addPerson(this);
	}

	public void removeGroup(GroupManyToMany group) {
		this.groupes.remove(group);
	}

	public Collection<GroupManyToMany> getgroupes() {
		return groupes;
	}

	public void setGroupes(Collection<GroupManyToMany> groupes) {
		this.groupes = groupes;
	}
	
	
}

