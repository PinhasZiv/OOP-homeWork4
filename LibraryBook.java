package homeWork4;

public class LibraryBook extends Book {

	// Default constructor
	public LibraryBook() {
	}

	// Fields constructor
	public LibraryBook(String nameOfBook, int numOfPages, String nameOfAuthr) {
		super(nameOfBook, numOfPages, nameOfAuthr);
	}

	// Function that prints the book summary.
	@Override
	public String Summarize() {
		return "This is a library book." + " This book is for reading inside the library only.";

	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof LibraryBook))
			return false;
		return (super.equals(obj));
	}

}
