import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class FeedbackTracker {
	
	private static String answer = "";
	private static List<Feedback<Integer>> feedbacks = new ArrayList<>();
	private static Scanner keyboard = new Scanner(System.in);
	private static String name;
	private static String message;
	private static int rating;
	private static boolean validity = false;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Welcome to CoffeeShop Feedback Tracker!");
		
		
		
		while(!answer.toLowerCase().equals("no")) {
			
			
			System.out.print("Enter customer name: ");
			
			name = keyboard.next();
			
			keyboard.nextLine();
			
			System.out.print("Enter feedback: ");
			message = keyboard.nextLine();
			
			while (!validity) {
				try {
					System.out.print("Enter rating (1-5) or 0 for no rating: ");
					
					rating = keyboard.nextInt();
					if(rating < 0 || rating > 5)
						throw new OutsideRangeException();
					
					validity = true;
				}
				catch(InputMismatchException e) {
					System.out.println("Input is not an integer");
				}
				catch(OutsideRangeException e) {
					System.out.println(e.getMessage());
				}
			}
			
			validity = false;
			
			feedbacks.add(new Feedback(name,message,rating));
			
			while(!validity) {
				try {
					System.out.print("Add another? (yes/no)");
					answer = keyboard.next();
					
					if(!answer.toLowerCase().equals("yes") && !answer.toLowerCase().equals("no"))
						throw new NotPossibilityException();
					validity = true;
				}
				catch(NotPossibilityException e) {
					System.out.println(e.getMessage());
				}
			
			}
			validity = false;
		}
		
		System.out.println("--- Feedback Entries ---");
		
		for(int i = 0; i < feedbacks.size(); i++) {
			System.out.println("Name: "+ feedbacks.get(i).getName());
			System.out.println("Message: "+ feedbacks.get(i).getFeedbackMessage());
			System.out.println("Rating: "+ feedbacks.get(i).getRating());
			
			System.out.println();
		}
		
		System.out.println("Total feedback entries:"+feedbacks.size());
		
		
		
		System.out.print("Would you like to update any feedback? (yes/no): ");
		
		while(!validity) {
			try {
				System.out.print("Would you like to update any feedback? (yes/no): ");
				answer = keyboard.next();
				
				if(!answer.toLowerCase().equals("yes") && !answer.toLowerCase().equals("no"))
					throw new NotPossibilityException();
				validity = true;
			}
			catch(NotPossibilityException e) {
				System.out.println(e.getMessage());
			}
		
		}
		validity = false;
	
		
		
		if(answer.toLowerCase().equals("yes")) {
			System.out.print("Enter name to update: ");
			
			answer = keyboard.next();
			
			keyboard.nextLine();
			
			for(int i = 0; i < feedbacks.size(); i++) {
				
				if (feedbacks.get(i).getName().equals(answer)) {
					System.out.print("Enter new message: ");
					feedbacks.get(i).setFeedbackMessage(keyboard.nextLine());
					
					System.out.print("Enter new rating: ");
					feedbacks.get(i).setRating(keyboard.nextInt());
					
				}
			}
		}
		
		
		
		
		while(!validity) {
			try {
				System.out.print("Would you like to delete any feedback? (yes/no): ");
				answer = keyboard.next();
				
				if(!answer.toLowerCase().equals("yes") && !answer.toLowerCase().equals("no"))
					throw new NotPossibilityException();
				validity = true;
			}
			catch(NotPossibilityException e) {
				System.out.println(e.getMessage());
			}
		
		}
		validity = false;
		
		
		
		
		if(answer.toLowerCase().equals("yes")) {
			System.out.print("Enter name to delete: ");
			
			answer = keyboard.next();
			
			
			
			for(int i = 0; i < feedbacks.size(); i++) {
				if (feedbacks.get(i).getName().equals(answer)) {
					feedbacks.remove(i);
					
				}
			}
		}
		
		System.out.println("--- Final Feedback List ---");
		
		for(Feedback feedbak: feedbacks) {
			System.out.println(feedbacks.toString());
		}
		
		
		
		
	}

}
