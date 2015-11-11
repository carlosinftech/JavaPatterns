package visitor;

public class EnvironmentalAuditor {

	public static void main(String args[])
	{
		Element eco = new Ecosystem();
		eco.accept(new EnvironmentalCalculator());
		eco.accept(new DegradationCalculator());
	}
}

