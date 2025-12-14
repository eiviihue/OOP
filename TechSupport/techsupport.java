import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TechSupport {

    private Map<String, String> supportMessages;
    private Random random;

    public TechSupport() {
        supportMessages = new HashMap<>();
        random = new Random();

        supportMessages.put("internet", "Try restarting your router and check if the cables are properly connected.");
        supportMessages.put("wifi", "Make sure Wi-Fi is enabled and you are connected to the correct network.");
        supportMessages.put("slow", "Your system may be slow due to many background apps. Try closing unused programs.");
        supportMessages.put("error", "Please note the error message and try restarting the application.");
        supportMessages.put("crash", "The app crash may be caused by a bug. Try updating or reinstalling it.");
        supportMessages.put("update", "Check if a software update is available and install the latest version.");
        supportMessages.put("password", "Try resetting your password using the 'Forgot Password' option.");
        supportMessages.put("login", "Ensure your username and password are correct, and check your internet connection.");
        supportMessages.put("printer", "Make sure the printer is powered on and connected to your computer.");
        supportMessages.put("virus", "Run a full antivirus scan and avoid downloading files from unknown sources.");
        supportMessages.put("thank", "You're welcome! Let me know if you need more technical help.");
    }

    public String getResponse(String userInput) {
        String[] words = userInput.toLowerCase().split("\\s+");

        for (String w : words) {
            if (supportMessages.containsKey(w)) {
                return supportMessages.get(w);
            }
        }

        String[] generic = {
            "Can you provide more details about the issue?",
            "Have you tried restarting your device?",
            "Please check your system settings and try again.",
            "I'm not sure about that issue yet, but I'm here to help."
        };

        return generic[random.nextInt(generic.length)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TechSupport ts = new TechSupport();
        String userInput = "";

        System.out.println("Hello! Welcome to Tech Support.");
        System.out.println("Describe your problem (type 'exit' to quit)");

        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Tech Support: Thank you for using Tech Support. Goodbye!");
                break;
            }

            System.out.println("Tech Support: " + ts.getResponse(userInput));
        }

        scanner.close();
    }
}
