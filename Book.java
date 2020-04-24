package homeWork4;

public class Book {

	private String name;
	private int numOfPages;
	private String authorName;

	// Default constructor 
	public Book() {

		this.name = "Laga'at Ba'osher";
		this.numOfPages = 101;
		this.authorName = "OSHER LAGA'AT";
	}

	// Fields constructor
	public Book(String nameOfBook, int numOfPages, String nameOfAuthr) {

		setNameOfBook(nameOfBook);
		setNameOfAuthor(nameOfAuthr);
		setNumOfPages(numOfPages);

	}

	public String toString() {
		return "Book: " + this.name + ". Author: " + this.authorName + ". Pages:" + numOfPages;
	}

	// Function that prints the book summary.
	public String Summarize() {
		return "This is a regular book.";
	}

	public String getNameOfBook() {
		return name;
	}

	public void setNameOfBook(String nameOfBook) {
		this.name = nameOfBook;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	// set number of pages (numOfPages > 0. default = 100).
	public void setNumOfPages(int numOfPages) {
		if (numOfPages < 0) {
			this.numOfPages = 100;
		} else {
			this.numOfPages = numOfPages;
		}
	}

	public String getNameOfAuthor() {
		return authorName;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.authorName = nameOfAuthor;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return this.getNameOfBook().equals(other.getNameOfBook())
				&& this.getNameOfAuthor().equals(other.getNameOfAuthor())
				&& this.getNumOfPages() == other.getNumOfPages();

	}

}
