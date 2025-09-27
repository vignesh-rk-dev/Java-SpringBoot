package springinterface;

public class Hdfc implements Rbi{
	@Override
	public void loan() {
		System.out.println("loan anount provide rs.500000");
	}
	@Override
	public void minamnt() {
		System.out.println("Minimum amount maintain rs.10000");
	}
	@Override
	public void interest() {
		System.out.println("interest rate 25%");
	}

}
