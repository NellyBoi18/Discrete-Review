import java.util.Scanner; // For inputs

public class HelloWorld {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in); // New Scanner object
        int numNames = in.nextInt(); // Reading user input of number of names

        in.nextLine(); // Clearing garbage

        String[] names = new String[numNames]; // Array to store names being inputed
        for (int x = 0; x < numNames; x++) {
            String nameIN = in.nextLine(); // Reading user input of names
            names[x] = nameIN; // Storing names in the array
        }

        in.close(); // Closing Scanner so no memory leak

        // Outputting Hello, names[x]!
        for (int x = 0; x < names.length; x++) {
            System.out.println("Hello, " + names[x] + "!");
        }
    }
}