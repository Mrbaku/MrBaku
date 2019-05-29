package Day49_Inheritance02;

public class EBook extends  Book {
	private int size;
	private int pages;
	
	public void readEBook(int pageNum) {
		System.out.println("Reading " + getTitle()+
				" by " + getAuthor() +
				" at page " + pageNum);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
}
