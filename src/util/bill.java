package util;

public class bill {
	
	
	public String gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	public int feeding;
	public double Couvert;
	public int ticket;
	public double total;
	
	public static double ticket(char gender) {
	        if (gender == 'M') {
	            return 10.0;
	        } else if (gender == 'F') {
	            return 8.0;
	        } else {
	            throw new IllegalArgumentException("Sexo inválido");
	        }
	    }
	
    public int quantityBeer() {
	return beer += beer * 5;
}
    public int quantityBarbecue() {
	return barbecue += barbecue * 7;
}
    public int quantitySoftDrink() {
	return softDrink += softDrink * 3;
}
    
    public int feeding() {
    	return beer + barbecue + softDrink;
    }
    
    public static double Couvert(double feeding) {
        if (feeding > 30.0) {
            return 0.0;
        } else {
            return 4.0;
        }
    }
    
    public double total() {
    	return feeding + Couvert + ticket;
    }

}
