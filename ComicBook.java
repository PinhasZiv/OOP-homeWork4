package homeWork4;

public class ComicBook extends BookForBorrow {

	// Default constructor
	public ComicBook() {
		super();
		setNameOfBook("Tintin");
		setNameOfAuthor("HERJE");
		setNumOfCopies(14);
	}

	// Fields constructor
	public ComicBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies) {
		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies);
	}

	// Function that prints the book summary.
	public String Summarize() {
		return "This is a comic book. " + "This book is for reading inside the library only";
	}

	@Override
	public boolean borrow(int numOfCopies) {
		return super.borrow(0);
	}

	@Override
	public boolean returnBook(int numOfCopies) {
		return super.returnBook(0);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ComicBook))
			return false;
		if (!(super.equals(obj)))
			return false;
		ComicBook other = (ComicBook) obj;
		return (this.getNumOfCopies() == other.getNumOfCopies());
	}

}
