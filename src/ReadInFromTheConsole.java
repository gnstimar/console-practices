import java.util.Scanner;

public class ReadInFromTheConsole {
    public void read() {
        System.out.println("Enter your input: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }
}
