public class Player{
    ArrayList<Card> _hand;
    ArrayList <LList> _properties;
    BST _money;

    public Player(){
	_hand = new ArrayList<Card>();
	_properties = new ArrayList<LList>();
	_money = new BST;
    }	

    public void display(ArrayList<Card> cards){
	String retStr;
	retStr = "";
	for (int i = 0; i <cards.size() -1, i++){
	    retStr+= "Card" +i;
	    if (c.type = "Action"){
		Card c = ArrayList.get(i);
		retStr += "["+  c.getType()+ ":" + c.getName() + "\n" + "]" + "\n";
	    }
	    else{
		Card c = ArrayList.get(i);
		retStr += "["+  c.getType()+ ":"  + c.getName() +"\n" +c.getDescription() + "\n" + "]" + "\n"+"\n";
	    }
	}
	return retStr;
    }
    
    public boolean searchColor(ArrayList properties){//checks if this color property is in _propery
	if (
	    }
    }
    public void place(ArrayList properties, PropertyCard c){ // place new property card in correct place in _properties
	if (c instanceof Yellow && searchColor(properties, "Yellow" )){
	    


    public void draw2(){
	_hand.add(deck.pop());
	_hand.add(deck.pop());
    }

    public void checkHand(){
	total = _hand.size();
	while (total> 7) {
	    System.out.println("Too many cards in hand. Please select a card to discard.");
	    display(_hand);
	    Scanner sc = new Scanner(System.in);
	    String choice = sc.nextLine();
	    while  //choice is not an int use throw catch
		{
		    System.out.println("Please enter an integer indicating which card you would like to remove");
		    Scanner sc = new Scanner(System.in);
		    String choice = sc.nextLine();
		}
	    _hand.remove((int)choice);
	    total = _hand.size();
	}
    }
    
    public void useActionCard(ActionCard x, Player p){
	if (x.getName().equals("Sly Deal")){
	    this.useSlyDeal( p);
	}
	//else if all the other action cards
    }

    /* ALL ACTION CARD METHODS */
    public boolean useSlyDeal(Player p){
	System.out.println("Which card would you like to steal from " + p.getName());
	display(p._hand); //Make display properties only method
	//scanner business Card c
	Card stolen = p._properties.remove(c);
	place(_properties, stolen);
    }

}
