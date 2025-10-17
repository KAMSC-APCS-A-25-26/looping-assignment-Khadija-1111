import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {        
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String st = sc.nextLine();
        // TODO: Step 2 - Print each character on a separate line
        for (int i = 0; i < st.length(); i++) {
            System.out.println(st.charAt(i));
        }
    }
}
