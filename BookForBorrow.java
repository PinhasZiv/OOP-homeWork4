package homeWork4;

public abstract class BookForBorrow extends LibraryBook {

	private int numOfCopies;

	// Default constructor 
	public BookForBorrow() {
		super();
		this.numOfCopies = 10;
	}

	// Fields constructor
	public BookForBorrow(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies) {
		super(nameOfBook, numOfPages, nameOfAuthr);
		setNumOfCopies(numOfCopies);
	}

	public boolean borrow(int numOfCopies) {
		if (numOfCopies <= 0) {
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
			System.out.println("You can't borrow " + numOfCopies + " copies. " + "There are only " + this.getNumOfCopies()
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

	public int getNumOfCopies() {
		return numOfCopies;
	}

	// set number of pages (numOfPages > 0. default = 100).
	public void setNumOfCopies(int numOfCopies) {
		if (numOfCopies < 0) {
			this.numOfCopies = 0;
		} else {
			this.numOfCopies = numOfCopies;
		}
	}

}
