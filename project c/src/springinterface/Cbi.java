package springinterface;

public class Cbi implements Rbi{
	public void loan() {
		System.out.println("loan anount provide rs.400000");
	}
	@Override
	public void minamnt() {
		System.out.println("Minimum amount maintain rs.5000");
	}
	@Override
	public void interest() {
		System.out.println("Interest rate 10%");
	}

}
