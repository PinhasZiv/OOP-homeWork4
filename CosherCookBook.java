package homeWork4;

public class CosherCookBook extends CookBook {

	private String supervision;

	// Default constructor
	public CosherCookBook() {
		super();
		setNameOfBook("Glat Cooking");
		setNameOfAuthor("RABI JACOB");
		setNumOfCopies(4);
		this.supervision = "Smart Hanuka";
	}

	// Fields constructor
	public CosherCookBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, boolean isDamaged,
			String supervision) {
		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies, isDamaged);
		setSuperVision(supervision);
	}

	public String toString() {
		return super.toString() + ". Supervisor: " + this.getSuperVision();
	}

	// Function that prints the book summary.
	public String Summarize() {
		return "This is a cosher cooking book. " + "This cosher cooking book is superbised by: "
				+ this.getSuperVision();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CosherCookBook))
			return false;
		if (!(super.equals(obj)))
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
