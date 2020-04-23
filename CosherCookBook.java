package homeWork4;

public class CosherCookBook extends CookBook {

	private String supervision;

	public CosherCookBook() {

		super();
		this.supervision = "smart hanuka";
	}

	public CosherCookBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, boolean isDamaged,
			String supervision) {

		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies, isDamaged);
		setSuperVision(supervision);
	}

	public String toString() {

		return super.toString() + "Supervisor" + this.getSuperVision();
	}

	public String Summarize() {

		return super.Summarize() + "this cosher cooking book is superbised by" + this.getSuperVision();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CosherCookBook))
			return false;
		if(!(super.equals(obj)))
				return false;
		CosherCookBook other = (CosherCookBook) obj;
		return (this.getSuperVision() == other.getSuperVision());
	}

	public String getSuperVision() {
		return supervision;
	}

	public void setSuperVision(String superVision) {
		this.supervision = superVision;
	}
	
}
