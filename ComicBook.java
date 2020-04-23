package homeWork4;

public class ComicBook extends Book {

	private int numOfCopies;

	public ComicBook() {
		super();
		this.numOfCopies = 10;
	}

	public ComicBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies) {
		super(nameOfBook, numOfPages, nameOfAuthr);
		setNumOfCopies(numOfCopies);
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

	public String Summarize() {
		// TODO
		// check if we need to print the message
		// "this book is for reading inside the library only".
		return "This is a comic book. \n" + super.Summarize();
	}

	public boolean borrow(int numOfCopies) {
		if(numOfCopies <= 0) {
			System.out.println("INVALID VALUE");
			return false;
		}
		if (this.numOfCopies - numOfCopies >= 0) {
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
		return super.toString() + " Num of copies:" + this.getNumOfCopies();

	}

}
