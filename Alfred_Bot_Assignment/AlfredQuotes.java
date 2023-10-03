import java.security.spec.NamedParameterSpec;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting(String name) {
        // You do not need to code here, this is an example method
        return String.format("Hello %s, lovely to see you. How are you?", name);
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s. It is nice to see you", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("The current day is %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {
        // YOUR CODE HERE
        if(phrase.indexOf("Alexis") > -1){
            return "What can I help you with?";
        }

        if(phrase.indexOf("Alfred") > -1){
            return "How can I help you Master Bruce?";
        }
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

