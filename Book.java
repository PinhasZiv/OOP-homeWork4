package homeWork4;

public class Book {
	
	private String nameOfBook;
	private int numOfPages;
	private String nameOfAuthor;
	
	public Book() {
		
		this.nameOfBook = "lagaat be osher";
		this.numOfPages = 101;
		this.nameOfAuthor = "osher lagate";
	}
	
	public Book(String nameOfBook, int numOfPages, String nameOfAuthr) {
		
		setNameOfBook(nameOfBook);
		setNameOfAuthor(nameOfAuthr);
		setNumOfPages(numOfPages);
		
	}
	public String toString() {
		return "The book: " + this.nameOfBook + " was written by " + this.nameOfAuthor + 
				" and have " + numOfPages + " pages.";
	}
	
	public String Summarize() {
		return "touching Osher accross the world";
	}
	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		
		if(numOfPages < 0) {
			this.numOfPages = 100;
		}
		this.numOfPages = numOfPages;
	}

	public String getNameOfAuthor() {
		return nameOfAuthor;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}
	// add equals function
}
