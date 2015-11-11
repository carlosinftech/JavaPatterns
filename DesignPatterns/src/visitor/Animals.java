package visitor;
<<<<<<< HEAD
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
=======

>>>>>>> 069268fef778626762a5da55706fe469fe8e129b

public class Animals implements Element{

	protected int healthyAnimals = 150000;
	protected int endangeredAnimals = 900000;
	@Override
	/**
	 * visitor->visitConcreteElementB(this)
	 */
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
