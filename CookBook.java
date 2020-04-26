package homeWork4;

public class CookBook extends BookForBorrow {

	private boolean isDamaged;

	// Default constructor
	public CookBook() {
		super();
		setNameOfBook("Cakes And Cookies");
		setNameOfAuthor("CARMELA MENASHE");
		setNumOfCopies(10);
		this.isDamaged = false;
	}

	// Fields constructor
	public CookBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, boolean isDamaged) {
		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies);
		setDamaged(isDamaged);
	}

	// Function that returns the damage field (boolean).
	public boolean isDamaged() {
		return isDamaged;
	}

	// Function that defines the damage field.
	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}

	// Function that prints the book summary.
	public String Summarize() {
		// TODO to Check if we need to write it again
		// (gay asked at the forum about it).
		return "This is a cook book." + " This cooking book might contain non cosher intgredients";
	}

	// Library return function.
	// (Receives number of copies to return (numOfCopies > 0),
	// updates numOfCopies field and fines if ifDamage field = true.
	public boolean returnBook(int numOfCopies) {
		if (numOfCopies <= 0) {
			System.out.println("INVALID VALUE");
			return false;
		} else {
			if (this.isDamaged)
				fine();
			this.setNumOfCopies(this.getNumOfCopies() + numOfCopies);
			System.out.println(numOfCopies + " copies were returned");
			return true;
		}
	}

	// Function that prints a fine message.
	public void fine() {
		System.out.println("Damaged book return! Fine is 200NIS");
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CookBook))
			return false;
		if (!(super.equals(obj)))
			return false;
		CookBook other = (CookBook) obj;
		return (this.isDamaged() == other.isDamaged());
	}

	@Override
	public String toString() {
		return super.toString() + ". Damage: " + this.isDamaged();
	}

}
