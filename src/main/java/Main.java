import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//        Console console = System.console();
//        String s = "";
//        while (!s.equals("exit")){
//            s = console.readLine();
//            System.out.println(s);
//        }

        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals("exit")){
            s = scanner.nextLine();
            System.out.println(s);
        }

    }

}
