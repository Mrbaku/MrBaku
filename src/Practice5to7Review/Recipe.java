package Practice5to7Review;

public class Recipe {
	
	private String applePie;
	private double flour;
	private int sugar;
	private double fineSalt;
	private int coldButter;
	
	public Recipe(String applePie, double flour, int sugar, double fineSalt, int coldButter) {
		System.out.println("Constructor compiling...");
		this.applePie= applePie;
		this.flour= flour;
		this.sugar= sugar;
		this.fineSalt= fineSalt;
		this.coldButter= coldButter;
}
	public Recipe() {
		System.out.println("No ARGS Here...");
		flour = "1 Tea spoon of" + sugar;
		}

	public String getApplePie() {
		System.out.println("Making of an great Apple Pie");
		return applePie;
	}

	public void setApplePie(String applePie) {
		this.applePie = applePie;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public double getFineSalt() {
		return fineSalt;
	}

	public void setFineSalt(double fineSalt) {
		this.fineSalt = fineSalt;
	}

	public int getColdButter() {
		return coldButter;
	}

	public void setColdButter(int coldButter) {
		this.coldButter = coldButter;
	}

	
	public String toString() {
		return "Recipe [applePie=" + applePie + ", flour=" + flour + ", sugar=" + sugar + ", fineSalt=" + fineSalt
				+ ", coldButter=" + coldButter + "]";
	}
	
	
}
