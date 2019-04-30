package Day25_ArrayInJava;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = { "Timberland Shoes", "H&M Shirt", "Swatch Watch", "Gucci Bag", "Addidas socks" };
		double[] price = { 120.00, 5.99, 150.50, 3000.5, 6.99 };
		int[] itemsId = { 12345, 123223, 434232, 34343, 232323 };
		String[] product = new String[5];

		// print count of products
		System.out.println("Product count: " + products.length);

		// check if products, prices and itemIds have same count
		if (products.length == price.length && itemsId.length == products.length) {
			System.out.println("Shopping List looks good");
		} else {
			System.out.println("Something wrong in this list");
			return;
		}
		// loop though products and print each one in seperate lines
		for (String p : products) {
			System.out.println(p);
		}
		// prices --> for loop
		for (int i = 0; i < price.length; i++) {
			System.out.println(price[i]);
		}
		// itemsId ==> print this in reverse order
		System.out.println("*************");
		for (int x = itemsId.length - 1; x >= 0; x--) {
			System.out.println(itemsId[x]);
		}

		// print a report with a total price
		System.out.println("######## YOUR SHOPPING RECEIPT##########");
		System.out.println();
		double totalPrice = 0.0;
		for(int y = 0; y < products.length; y++) {
			System.out.println("Item " +(y+1) + ": " + itemsId[y] + " - " + products[y] + " - $" + price[y] );
			totalPrice+= price[y];
			
	}
		System.out.println("Total Price: $" + totalPrice);
	
		
		System.out.println("#################################");
		System.out.println();
		//find the most expensive item in the list
		
		int max = 0;
		double maxPrice = 0;
		
		for(int p = 0; p  < price.length; p++ ) {
			if(price[p] > maxPrice) {
				maxPrice = price[p];
				max = p;
			}
		}
	System.out.println(itemsId[max] + " - " + products[max] + " - $" + maxPrice);
	
	
	}
	

}
