package visitor;
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
public interface Element {
	
	void accept(Visitor visitor);
}
