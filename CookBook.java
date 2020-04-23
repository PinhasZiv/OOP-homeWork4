package homeWork4;

public class CookBook extends Book {

	private int numOfCopies;
	private boolean isDamaged;

	public CookBook() {
		super();
		this.numOfCopies = 10;
		this.isDamaged = false;
	}

	public CookBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, boolean isDamaged) {
		super(nameOfBook, numOfPages, nameOfAuthr);
		setNumOfCopies(numOfCopies);
		;
		setDamaged(isDamaged);
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		if (numOfCopies < 0) {
			this.numOfCopies = 0;
		} else {
			this.numOfCopies = numOfCopies;
		}
	}

	public boolean isDamaged() {
		return isDamaged;
	}

	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}

	public String Summarize() {
		// TODO to Check if we need to write it again
		// (gay asked at the forum about it).
		return super.Summarize() + "This cooking book might contain non cosher intgredients";
	}

	public boolean borrow(int numOfCopies) {
		if(numOfCopies <= 0) {
			System.out.println("INVALID VALUE");
			return false;
		}
		if (this.numOfCopies - numOfCopies > 0) {
			this.numOfCopies = (this.numOfCopies - numOfCopies);
			System.out.println(numOfCopies + " copies were borrowed");
			return true;
		} else {
			// TODO
			// check if we need to print this message.
			System.out.println("You can't borrow that number of copies. " + "There are only " + this.getNumOfCopies()
					+ " Copies available in the library");
			return false;
		}
	}

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
		return (this.getNumOfCopies() == other.getNumOfCopies() && this.isDamaged() == other.isDamaged());
	}

	@Override
	public String toString() {
		return super.toString() + "Damage: " + this.isDamaged();
	}

}
