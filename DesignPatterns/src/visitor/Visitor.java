package visitor;

/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */

public interface Visitor {
	
	void visit(Trees trees);
	
	void visit(Animals animals);
	
	void visit(Insects insects);
	
	void visit(River river);
	
	void visit(Ecosystem ecosystem);
}
