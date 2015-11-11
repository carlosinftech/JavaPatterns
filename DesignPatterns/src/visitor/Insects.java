package visitor;
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */

public class Insects implements Element{

	protected int beneficialInsects = 1000000000;
	protected int harmfulInsects = 200000;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
