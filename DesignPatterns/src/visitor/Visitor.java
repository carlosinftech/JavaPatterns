package visitor;

public interface Visitor {
	
	void visit(Trees trees);
	
	void visit(Animals animals);
	
	void visit(Insects insects);
	
	void visit(River river);
	
	void visit(Ecosystem ecosystem);
}
