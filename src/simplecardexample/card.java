package simplecardexample;

/**
 *
 * @author Shahroz Shah
 */
public class card {

    /**
     * @param args the command line arguments
     */
    private String suit;
    private int value;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
