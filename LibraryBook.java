package homeWork4;

public class LibraryBook extends Book {

	
	// TODO 
	// ask at forum about writing the contractors
	// and toString function even if it extends 


	// TODO
	// ask at forum about writing the constractors
	// and toString function even if it extends

	// automaticly from super class?
	public LibraryBook() {
	
		
	}
	
	public LibraryBook(String nameOfBook, int numOfPages, String nameOfAuthr) {
		super(nameOfBook, numOfPages, nameOfAuthr);
	}

	@Override
	public String Summarize() {

		return super.Summarize() + "\nThis book is" + " for reading inside the library only";
	}
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	// TODO
	// ask at forum if we need to override the
	// equals function even if it's almost the same object?

}
