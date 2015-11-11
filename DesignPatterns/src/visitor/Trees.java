package visitor;
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */

public class Trees implements Element{

	protected int healthyTrees = 100000;
	protected int deadTrees = 900000;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}

	
}
