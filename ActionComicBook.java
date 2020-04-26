package homeWork4;

public class ActionComicBook extends ComicBook {

	private int ageLimit;

	// Default constructor
	public ActionComicBook() {
		super();
		setNameOfBook("Spiderman");
		setNameOfAuthor("MARVEL");
		setNumOfCopies(13);
		this.ageLimit = 10;
	}

	// Fields constructor
	public ActionComicBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, int ageLimit) {
		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies);
		setAgeLimit(ageLimit);
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	// Function that sets the age limit (ageLimit >= 0. default = 16).
	public void setAgeLimit(int ageLimit) {
		if (ageLimit < 0) {
			this.ageLimit = 16;
		} else {
			this.ageLimit = ageLimit;
		}
	}

	// Function that prints the book summary.
	@Override
	public String Summarize() {
		return "This is an action comic book." + " This action comic book is for ages greater than "
				+ this.getAgeLimit() + " years old.";
	}

	@Override
	// Override super class because it was defined that cannot borrow a comicBook
	// object.
	// Library borrowing function. Receives number of copies to borrow (numOfCopies
	// > 0).
	// Checks whether such number of copies can be borrowed and updates the
	// numOfCopies field.
	public boolean borrow(int numOfCopies) {
		if (numOfCopies <= 0) {
			System.out.println("INVALID VALUE");
			return false;
		}
		if (this.getNumOfCopies() - numOfCopies >= 0) {
			this.setNumOfCopies(this.getNumOfCopies() - numOfCopies);
			System.out.println(numOfCopies + " copies were borrowed");
			return true;
		} else {
			System.out.println("You can't borrow " + numOfCopies + " copies. " + "There are only "
					+ this.getNumOfCopies() + " Copies available in the library");
			return false;
		}
	}

	// Override super class because it was defined that cannot borrow a comicBook
	// object.
	// Library return function.
	// (Receives number of copies to return (numOfCopies > 0),
	// updates numOfCopies field.
	public boolean returnBook(int numOfCopies) {
		if (numOfCopies > 0) {
			this.setNumOfCopies(this.getNumOfCopies() + numOfCopies);
			System.out.println(numOfCopies + " copies were returned");
			return true;
		} else {
			System.out.println("INVALID VALUE");
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ". Age limit: " + this.getAgeLimit();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ActionComicBook))
			return false;
		if (!super.equals(obj))
			return false;
		ActionComicBook other = (ActionComicBook) obj;
		return this.getAgeLimit() == other.getAgeLimit();
	}

}
