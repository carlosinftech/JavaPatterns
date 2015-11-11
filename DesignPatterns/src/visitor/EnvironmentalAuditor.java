package visitor;
/**
 * @author Carlos Perez carlosinftech
 * @version 1.0
 * 
 */
public class EnvironmentalAuditor {

	public static void main(String args[])
	{
		Element eco = new Ecosystem();
		eco.accept(new EnvironmentalCalculator());
		eco.accept(new DegradationCalculator());
	}
}

