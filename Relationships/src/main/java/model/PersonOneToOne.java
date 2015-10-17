package model;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */



/**
 * Association 1
 * Person that can join a group. Only one person
 * can belong to a group and a group can contain only one person
 */
public class PersonOneToOne
{

	
	private GroupOneToOne GroupOneToOne;
	
	
	public PersonOneToOne(){}

	
	public GroupOneToOne getGroup() {
		return GroupOneToOne;
	}

	public void setGroup(GroupOneToOne GroupOneToOne) {
		if(this.GroupOneToOne!=null){
			this.GroupOneToOne.removePerson(this);
		}
		this.GroupOneToOne = GroupOneToOne;
		if(GroupOneToOne.getPerson()!=this)
			GroupOneToOne.setPerson(this);
	}

	public void removeGroup(GroupOneToOne GroupOneToOne)
	{
		if(GroupOneToOne==this.GroupOneToOne && GroupOneToOne != null)
			this.GroupOneToOne=null;
	}
}

