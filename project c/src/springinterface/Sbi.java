package springinterface;

public class Sbi implements Rbi{
	@Override
	public void loan() {
		System.out.println("loan anount provide rs.200000");
	}
	@Override
	public void minamnt() {
		System.out.println("Minimum amount maintain rs.1000");
	}
	@Override
	public void interest() {
		System.out.println("Interest rate 6%");
	}

}
