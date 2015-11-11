package visitor;
<<<<<<< HEAD
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
=======

>>>>>>> 069268fef778626762a5da55706fe469fe8e129b

public class Ecosystem implements Element {

	protected int gains = 51483594;
	protected int losses = 200842967;
	
	private Element[] elements = {new Insects(),new Trees(),new River(), new Animals()};


	@Override
	public void accept(Visitor visitor) {
		for(Element e: elements)
		{
			e.accept(visitor);
		}
		visitor.visit(this);
	}

}
