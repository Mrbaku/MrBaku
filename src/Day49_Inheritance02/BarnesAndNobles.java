package Day49_Inheritance02;

public class BarnesAndNobles {

	public static void main(String[] args) {
		
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java Programming");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPages(170);
		ebook.setSize(500);
		ebook.setType("Techn Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
	ebook.readEBook(10);
	ebook.readEBook(621);
	
	AudioBook aBook = new AudioBook();
	aBook.setTitle("OCA Prep");
	aBook.setAuthor("Jeanne");
	aBook.setNarrator("Marufjon");
	aBook.listen();

	
	PaperBack pB = new PaperBack();
	pB.setAuthor("Malcom Gladwill");
	pB.setTitle("Outliers");
	pB.setType("Biography");
	pB.setPrice(20.0);
	pB.setPages(304);
	
	System.out.println(pB.toString());
	}

}
