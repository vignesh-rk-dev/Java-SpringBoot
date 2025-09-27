package springscope;

public class Bank {
	private String name,accno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}
	@Override
	public String toString() {
	return "Bank [name="+name+", accno=" +accno+"]";
}

}
