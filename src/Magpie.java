/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>

 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie{
	//instance variable
	String lastTopic = "";

	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting(){
		return "Hello, how are you?";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */

	public String getResponse(String statement){
		statement = statement.toLowerCase();
		String response = "";
		if (statement.indexOf("no") >= 0){
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			if(lastTopic.equals("family")){
				response = "I think your family sounds fun";
			}else{
				response = "Tell me more about your family";
			}
			lastTopic = "family";
			
		}
		else if (statement.indexOf("cat") >= 0
			|| statement.indexOf("dog") != -1
			|| statement.indexOf("fish") >= 0
			|| statement.indexOf("hamster") >= 0)
		{ 
			if(lastTopic.equals("pets")){
				response = "I never get tired of talking about pets!";
			}else{
				response = "Tell me more about your pets!";
			}
			lastTopic = "pets";
		}
		else if (statement.indexOf("mr. adiletta") >= 0
			|| statement.indexOf("mr. a") >= 0
			|| statement.indexOf("mr.a") >= 0
			|| statement.indexOf("mr.adiletta") >=0 )
		{
			response = "Mr. A sounds so cool!";
		}
		else{
			response = getRandomResponse();
		}
		if (statement.indexOf("how are you") >= 0)
			response = "Good, what can I help you with today";
		
		
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse(){
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0){
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1){
			response = "Hmmm.";
		}
		else if (whichResponse == 2){
			response = "Do you really think so?";
		}
		else if (whichResponse == 3){
			response = "You don't say.";
		}
		else if (whichResponse == 4){
			response = "Why do you say this?";
		}
		else if (whichResponse == 5){
			response = "Can we talk about something else";
		}
		
		return response;
	}
}
