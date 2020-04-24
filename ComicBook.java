package homeWork4;

public class ComicBook extends BookForBorrow {

	// Default constructor
	public ComicBook() {
		setNameOfBook("Tintin");
		setNumOfPages(97);
		setNameOfAuthor("HERJE");
		setNumOfCopies(14);
	}

	// Fields constructor
	public ComicBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies) {
		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies);
		setNumOfCopies(numOfCopies);
	}

	// Function that prints the book summary.
	public String Summarize() {
		// TODO
		// check if we need to print the message
		// "this book is for reading inside the library only".
		return "This is a comic book. " + super.Summarize();
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

	@Override
	public String toString() {
		return super.toString() + ". Num of copies:" + this.getNumOfCopies();

	}

}
