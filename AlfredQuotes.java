import java.util.Date; //class represents date and time in java
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hi! how are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) { //this is the guestGreeting method
        return "Hello," + name + "." +  "How are you?";
    }
    
    public String dateAnnouncement() {
        return String.format("It is currently, %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "Snarky response";
    }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

