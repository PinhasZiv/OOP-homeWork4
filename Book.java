package homeWork4;

public class Book {

	private String name;
	private int numOfPages;
	private String authorName;

	public Book() {

		this.name = "Laga'at Ba'osher";
		this.numOfPages = 101;
		this.authorName = "OSHER LAGA'AT";
	}

	public Book(String nameOfBook, int numOfPages, String nameOfAuthr) {

		setNameOfBook(nameOfBook);
		setNameOfAuthor(nameOfAuthr);
		setNumOfPages(numOfPages);

	}

	public String toString() {
		return "Book: " + this.name + ". Author: " + this.authorName + ". Pages:" + numOfPages;
	}

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
	// TODO add equals function

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
