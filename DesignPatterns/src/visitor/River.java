package visitor;

/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */


public class River implements Element{

	protected int freshLiters = 90000000;
	protected int contaminatedLiters = 5000000;
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
