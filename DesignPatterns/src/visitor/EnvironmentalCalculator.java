package visitor;

<<<<<<< HEAD
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
=======

>>>>>>> 069268fef778626762a5da55706fe469fe8e129b
public class EnvironmentalCalculator implements Visitor{

	@Override
	public void visit(Trees trees) {
		System.out.println("There are currently " + trees.healthyTrees+" healthy trees in the ecosystem");
	}

	@Override
	public void visit(Animals animals) {
		System.out.println("There are currently " + (animals.healthyAnimals)+"  healthy animals in the ecosystem");
		
	}

	@Override
	public void visit(Insects insects) {
		System.out.println("There are currently " + (insects.beneficialInsects)+" beneficial insects in the ecosystem");
		
	}

	@Override
	public void visit(River river) {
		System.out.println("There are currently " + (river.freshLiters/5)+" gallons of fresh water in the ecosystem");
		
	}

	@Override
	public void visit(Ecosystem ecosystem) {
		System.out.println("The ecosystem has provided " + ecosystem.gains+" dollars in environmental services to society.");
	}



}
