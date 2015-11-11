package memento;


/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
public class ConcreteMemento implements Memento
{
	
	private byte[] state;
	
	public Caretaker caretaker;
	
	public ConcreteMemento(){
		super();
	}

	public byte[] setState() {
		// TODO implement me
		return new byte[32];	
	}
	
	public byte[] getState() {
		// TODO implement me
		return new byte[32];	
	}
	
}

