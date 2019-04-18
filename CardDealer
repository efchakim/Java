/*This class will deal 5 cards from a string representing a deck. 
         After dealing 5 cards from the deck those cards will be removed.
         @return a hand of 5 cards represented as a string of 14 characters.*/
import java.util.Random;
class Main {
      private String Deck="AC2C3C4C5C6C7C8C9CTCJCQCKC"
                       + "AH2H3H4H5H6H7H8H9HTHJHQHKH"
                       + "AS2S3S4S5S6S7S8C9STSJSQSKS"
                       + "AD2D3D4D5D6D7D8D9DTDJDQDKD"; 
    int cards_indeck = 5;
        /**This class will deal 5 cards from a string representing a deck. 
         * After dealing 5 cards from the deck those cards will be removed.
         * @return a hand of 5 cards represented as a string of 14 characters. 
         */ 
     public String dealHand(){
        String hand = ""; int number_cards = Deck.length()/2;
        //System.out.println("Cards in Deck: " + Deck); // before taking hand out
        int i = 0;
        while (i < cards_indeck) {
            Random ran_num = new Random(); 
            int n = 2*(ran_num.nextInt(number_cards));
            String card = Deck.substring(n, n +2);
            Deck = Deck.replace(card,"");
            hand += card + " ";
            i++; number_cards -=2;
        }
        hand = hand.trim(); // 14 characters
        //System.out.println("Cards in Deck: " + Deck); // to test 
        System.out.print("Your hand is: "); 
        return hand;
     }
  public static void main(String[] args) {
        Main myGen = new Main();
        String x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
        x = myGen.dealHand();
        System.out.println(x);
    }
  }
