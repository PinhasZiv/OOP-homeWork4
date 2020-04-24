package homeWork4;

public class ActionComicBook extends ComicBook {

	private int ageLimit;

	// Default constructor
	public ActionComicBook() {
		setNameOfBook("Spiderman");
		setNumOfPages(124);
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

	public void setAgeLimit(int ageLimit) {
		if(ageLimit < 0) {
			this.ageLimit = 16;
		} else{
			this.ageLimit = ageLimit;
		}
	}

	// Function that prints the book summary.
	@Override
	public String Summarize() {
		return super.Summarize() + " This action comic book is for ages greater than " + this.getAgeLimit()
				+ " years old.";
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
