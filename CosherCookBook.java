package homeWork4;

public class CosherCookBook extends CookBook {

	private String superVision;

	public CosherCookBook() {

		super();
		this.superVision = "smart hanuka";
	}

	public CosherCookBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, boolean isDamaged,
			String superVision) {

		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies, isDamaged);
		this.superVision = superVision;
	}

	public String toString() {

		return super.toString() + "Super visor" + this.superVision;
	}

	public String Summarize() {

		return super.Summarize() + "this cosher cooking is superbised by" + this.superVision;
	}

	public boolean borrow(int numOfCopies) {

		boolean isBorrow = super.borrow(numOfCopies);

		return isBorrow;
	}

	public boolean returnBook(int numOfCopies) {
		if(numOfCopies > 0 ) {
			
		boolean isFaildReturn = super.returnBook(numOfCopies);
		return isFaildReturn;
		}
		return false;
	}

	public void fine() {
		super.fine();
	}
	
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	public String getSuperVision() {
		return superVision;
	}

	public void setSuperVision(String superVision) {
		this.superVision = superVision;
	}
	
}
