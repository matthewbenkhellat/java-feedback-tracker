
public class Feedback<T extends Number> {

	private String name;
	private String feedbackMessage;
	private T rating;
	
	
	public Feedback(String name, String feedbackMessage, T rating) {
		this.name = name;
		this.feedbackMessage = feedbackMessage;
		this.rating = rating;
	}
	
	public Feedback() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFeedbackMessage(String feedbackMessage) {
		this.feedbackMessage = feedbackMessage;
	}
	
	public void setRating(T rating) {
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFeedbackMessage() {
		return feedbackMessage;
	}
	
	public T getRating() {
		return rating;
	}
	
	public String toString() {
		return "Name: "+name+" - Message: "+feedbackMessage+" - Rating: "+(((Integer)rating==0)? "No rating":rating);
	}
	
	
}
