package homeWork4;

public class Runner {

	public static void main(String[] args) {

		// 1)//TODO

		// 2)
		System.out.println("2)*****************************");
		ComicBook comi = new ComicBook("scubidu",120,"aron black",4);
		System.out.println("is borrow: " + comi.borrow(3));
		System.out.println("is return book: " + comi.returnBook(1));

		ActionComicBook actionCom1 = new ActionComicBook("X-MAN",205,"MARVEL",34,17);
		System.out.println("is borrow action comic book " + actionCom1.borrow(5));
		System.out.println("is return action comic book " + actionCom1.returnBook(15));

		CookBook cB1 = new CookBook("COOKING WITH THE KING",13,"Aron aaroni",4,true);
		System.out.println("is borrow cook book " + cB1.borrow(30));
		System.out.println("is return cook book " + cB1.returnBook(100));

		CosherCookBook cosher1 = new CosherCookBook();
		System.out.println("is borrow cook book " + cosher1.borrow(2));
		System.out.println("is return cook book " + cosher1.returnBook(9));

		// 3)
		System.out.println("3)*****************************");

		System.out.println(comi);
		System.out.println(actionCom1);
		System.out.println(cB1);
		System.out.println(cosher1);
		//4)
		System.out.println("4)*****************************");
		
		System.out.println(comi.Summarize());
		System.out.println(actionCom1.Summarize());
		System.out.println(cB1.Summarize());
		System.out.println(cosher1.Summarize());
	}

}
