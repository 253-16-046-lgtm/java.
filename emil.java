import java.util.Scanner; 
 
public class Task3EmailVerification { 
 
    public static void main(String[] args) { 
 
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter your email: "); 
        String email = input.nextLine(); 
 
        boolean valid = true; 
  
        if (email.contains(" ")) {             valid = false; 
        } 
        int atPosition = email.indexOf('@');  
 
 
  if (atPosition == -1 || 
                atPosition != email.lastIndexOf('@')) {             valid = false; 
        } 
 
        if (atPosition <= 0 || atPosition == email.length() - 1) {             valid = false; 
        } 
  
        int dotPosition = email.lastIndexOf('.'); 
 
        if (dotPosition <= atPosition + 1 ||                 dotPosition == email.length() - 1) {             valid = false; 
        } 
  
        if (valid) { 
            System.out.println("Valid Email"); 
        } else { 
            System.out.println("Invalid Email"); 
        } 
 
        input.close(); 
    } 
} 
 
