import java.util.Scanner;


public class Main {

    public static void main (String[] args) {
        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alfabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};

        // ik ben er niet meer achter gekomen welke argumenten ik mee kon geven aan de parameters. Maar ik ben benieuwd of ik de rest van de code wel juist had. Ik kon het niet testen

//        Translator tranlateNumber = new Translator();


        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        while (play = true){
            System.out.println("Type 'x' om te stoppen Type 'v' om te vertalen");
            String input = scanner.nextLine();
            if (input.equals("x")){
                play = false;
            }
            else if(input.equals("v")){
                System.out.println("Type een cijfer in van 0 t/m 9");
                int inputNumber = scanner.nextInt();
                if (inputNumber > 0 && inputNumber < 10 ){
                   Translator.translate(inputNumber);
                    System.out.println("De vertaling van" + inputNumber + " is " + result);
                }
                else if(inputNumber >= 10){
                    System.out.println(ongeldig);

                }

                else{
                    System.out.println(ongeldig);
                }

            };
    }


}}
