package visitor;
<<<<<<< HEAD
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
=======

>>>>>>> 069268fef778626762a5da55706fe469fe8e129b
public class DegradationCalculator implements Visitor{

	@Override
	public void visit(Trees trees) {
		System.out.println(trees.deadTrees +" trees have been cut this year.");		
	}

	@Override
	public void visit(Animals animals) {
		System.out.println(animals.endangeredAnimals +" animals have died by human causes.");
	}

	@Override
	public void visit(Insects insects) {
		System.out.println(insects.harmfulInsects + " insects have plagued the ecosystem this year alone.");
	}

	@Override
	public void visit(River river) {
		System.out.println((river.contaminatedLiters/5)+" gallons of water have been contaminated this year.");
	}

	@Override
	public void visit(Ecosystem ecosystem) {
		System.out.println("Society has lost "+ecosystem.losses+" dollars due to lost environmental services this year.");		
	}

	


}
