package Day49_Inheritance02;

public class PaperBack extends Book {
private int pages;

public String toString() {
	return getTitle() + " | " + getAuthor() + " | " + getPrice()+ 
			" | " + getType() + " | "+ getPages();
}

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}


}
