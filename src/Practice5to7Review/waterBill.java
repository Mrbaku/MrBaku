package Practice5to7Review;

public class waterBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill = waterBill(198.7);
		System.out.println(bill);
	}
	
	
	
		  public static double waterBill(double units){
		    double bill = 0.0;
		    
		    //your code here
		    
		  
		    if(bill <=50){
		  units = bill*0.60;
		    }else if(bill>51 ){
		  units= bill*0.90;
		    }else if(bill>100){
		  units= bill*0.90;
		       bill+=50;
		    }else {
		   units= bill*0.90;
		       bill+=100;
		    }    
		    
		    return bill;
		  }//end waterTax

		  
		}

