package visitor;
<<<<<<< HEAD
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
=======

>>>>>>> 069268fef778626762a5da55706fe469fe8e129b
public class EnvironmentalAuditor {

	public static void main(String args[])
	{
		Element eco = new Ecosystem();
		eco.accept(new EnvironmentalCalculator());
		eco.accept(new DegradationCalculator());
	}
}

