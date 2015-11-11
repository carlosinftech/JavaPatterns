package visitor;
<<<<<<< HEAD
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
=======

>>>>>>> 069268fef778626762a5da55706fe469fe8e129b

public class Trees implements Element{

	protected int healthyTrees = 100000;
	protected int deadTrees = 900000;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}

	
}
