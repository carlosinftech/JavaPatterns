package model;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */


/**
 * Group that contains people. Only one person
 * can belong to a group and a group can contain only one person
 */
public class GroupOneToOne
{

	
	private PersonOneToOne PersonOneToOne;
	
	
	public GroupOneToOne(){}

	
	public PersonOneToOne getPerson() {
		return PersonOneToOne;
	}

	public void setPerson(PersonOneToOne PersonOneToOne) {
		if(this.PersonOneToOne!=null){
			this.PersonOneToOne.removeGroup(this);
		}
		this.PersonOneToOne = PersonOneToOne;
		if(PersonOneToOne.getGroup()!=this)
			PersonOneToOne.setGroup(this);
	}

	public void removePerson(PersonOneToOne PersonOneToOne)
	{
		if(this.PersonOneToOne==PersonOneToOne && PersonOneToOne != null)
			this.PersonOneToOne=null;
	}
}

