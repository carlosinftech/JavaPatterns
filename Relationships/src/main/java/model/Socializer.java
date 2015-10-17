package model;
/**
 * Created by carlos perez (carlosinftech) on 2015-17-10.
 */
public class Socializer {

	public static void main(String[] args) {
		
		//One to one association
		GroupOneToOne group1a = new GroupOneToOne();
		GroupOneToOne group1b = new GroupOneToOne();
		PersonOneToOne person1a = new PersonOneToOne();
		PersonOneToOne person1b = new PersonOneToOne();
		group1a.setPerson(person1a);
		group1a.setPerson(person1b);
		person1b.setGroup(group1b);
		group1b.setPerson(person1a);

		//One to many association
		GroupManyToOne group2a = new GroupManyToOne();
		GroupManyToOne group2b= new GroupManyToOne();
		PersonOneToMany person2a = new PersonOneToMany();
		PersonOneToMany person2b = new PersonOneToMany();
		PersonOneToMany person2c = new PersonOneToMany();
		
		group2a.addPerson(person2a);
		group2a.addPerson(person2b);
		group2a.addPerson(person2c);
		
		group2b.addPerson(person2b);
		group2b.addPerson(person2c);
		
		person2b.setGroup(group2b);
		person2b.setGroup(group2a);
		
		person2a.setGroup(group2b);
		
		//Many to Many association
		GroupManyToMany group3a = new GroupManyToMany();
		GroupManyToMany group3b = new GroupManyToMany();
		GroupManyToMany group3c = new GroupManyToMany();
		
		PersonManyToMany person3a = new PersonManyToMany();
		PersonManyToMany person3b = new PersonManyToMany();
		PersonManyToMany person3c = new PersonManyToMany();
		
		group3a.addPerson(person3a);
		group3a.addPerson(person3b);
		
		group3b.addPerson(person3a);
		group3b.addPerson(person3b);
		
		person3c.addGroup(group3a);
		person3c.addGroup(group3b);
		person3c.addGroup(group3c);
	}

}
