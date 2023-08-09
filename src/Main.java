import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length, difficult, repeat;

        /*length is the name of the variable that defines the length of the password
        * difficult is the name of the variable that defines how strong the password will be
        * repeat is the name of the variable that determines wheter the code will generate a new password*/ //olhar c ta certo

        System.out.println("-- Password Generator --");

        do{
            //Here the length og the generated password is chosen
            System.out.println("How long is the password?");
            length = sc.nextInt();

            //Here it is chosen the difficulty of the password that will be generated
            System.out.println("How strong should the password be?");
            System.out.println("[1] - Easy ");
            System.out.println("[2] - Medium ");
            System.out.println("[3] - Hard ");
            difficult = sc.nextInt();

            Generator gen = new Generator();
            gen.choise(difficult, length);

            System.out.println("");

            String textBlock = """
                    Would you like to generate a new password?
                        [1] - YES
                        [2] - NO
                    """;

            System.out.println(textBlock);

            repeat = sc.nextInt();

        }while(repeat ==1);

        sc.close();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Thanks for using the Password Generator");
        System.out.println("--------------------------------------------------------------");
    }
}