import java.util.Random;

public class Generator {

    Random random = new Random();
    private String[] easy = {"0","1","2","3","4","5","6","7","8","9"};

    private String[] medium = {"0","1","2","3","4","5","6","7","8","9",
                       "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                       "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    private String[] hard = {"0","1","2","3","4","5","6","7","8","9",
                     "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                     "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                     "!","@","#","$","%","¨","&","*","(",")","-","_","=","+","/","?","°","´","`","[","{","ª","~","^","]","}",";",":",".",">",",","<","₢","|", "'","§","¬"};

    public void choise(int value1, int value2){//value1 is difficult and value2 is length

        StringBuilder password = new StringBuilder();

        switch (value1){

            case 1://Easy password with only numbers
                for(int x = 0; x < value2; x++){
                    int character = random.nextInt(easy.length);
                    //In this section, the code will randomly generate integer values within the range stored in the variable easy
                    password.append(easy[character]);
                }
                System.out.println("");

                System.out.println("The generated password is: " + password.toString());
                break;

            case 2://Medium password with numbers and letters (letters in upper and lower case)
                for(int x = 0; x < value2; x++){
                    int character = random.nextInt(medium.length);
                    password.append(medium[character]);
                }
                System.out.println("");

                System.out.println("The generated password is: " + password.toString());
                break;

            case 3://Hard password with numbers, letters and especial character (letters in upper and lower case)
                for(int x = 0; x < value2; x++){
                    int character = random.nextInt(hard.length);
                    password.append(hard[character]);
                }
                System.out.println("");

                System.out.println("The generated password is: " + password.toString());
                break;

            default: //The default is triggered if any incorrect information has been entered
                System.out.println("");
                System.out.println("ERROR, please make sure you filled it out correctly");
                System.exit(0);
        }



    }
}
