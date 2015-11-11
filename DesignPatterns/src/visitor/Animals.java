package visitor;


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
