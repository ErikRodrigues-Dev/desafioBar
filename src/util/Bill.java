package util;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
		
	public double feeding() {
		double priceBeer = 5.00;
		double priceSoftDrink = 3.00;
		double priceBarbecue = 7.00;
		
		priceBeer = priceBeer * beer;
		priceSoftDrink = priceSoftDrink * softDrink;
		priceBarbecue = priceBarbecue * barbecue;
		
		double amount = priceBeer + priceSoftDrink + priceBarbecue;
		
		return amount;
	}
	
	public double cover() {
	    double priceCover = 4.0; 
	    if (feeding() < 30) {
	    	System.out.println("Couvert: "+priceCover);
	    }
	    else
	    {
	        priceCover = 0.0; 
	        System.out.println("Isento do Couvert");
	    }
	    return priceCover; 
	}
	
    public double ticket() {
        double valorTicket = 0.0;
        if (gender == 'M') {
            valorTicket = 10.0; 
        } else if (gender == 'F' ) {
            valorTicket = 8.0;
        } else {
            System.out.println("Gênero inválido");
        }  
        return valorTicket;
    }
	
    public double total() {
        double amountTotal = feeding() + cover() + ticket();
        return amountTotal;
    }

}
