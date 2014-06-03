public class Card {
    
    int value ; //1 will be $1M, 2 willbe $2M... money values can only be 1,2,3,4,5, and 10.
    String name, type;
    boolean inField;
    
    public Card() { //will always be overridden
	value = 0;
	name = "";
	inField = false;
	type = "";
    }
    
    public Card(int val){ //constructor for money cards
	value = val;
	name = "$" + val + "M";
	inField = false;
	type = "Money";
    }

    public int getValue() {
	return value;
    }
    
    public String getName() {
	return name;
    }

    public String getType() {
	return type;
    }


    public static void main( String[] args ) {
    	
    	Card Aleeshicles = new Card();
    	System.out.println( Aleeshicles.getValue() );
    	System.out.println( Aleeshicles.getName() );
    	System.out.println( Aleeshicles.inField() );
    	System.out.println( Aleeshicles.getTyape() );
    	
    }
}
