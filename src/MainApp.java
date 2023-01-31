import java. util. Scanner;
import java.util.Random;
public class MainApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //System.out.println("Vul hier je naam in: ");
        //String userName = myScanner.nextLine();

        //System.out.println("Vul hier je adres in: ");
        //String adr = myScanner.nextLine();

        //System.out.println("Vul uw telefoonnummer in: ");
        //int num = myScanner.nextInt();



        //System.out.println("Naam: "+userName);
        //System.out.println("Telefoonnummer: "+num);
        //System.out.println("Adres: "+adr);

        //Math Match = null;

        //System.out.println("Double nummer 1:");
        //double num1 = myScanner.nextDouble();

        //System.out.println("Double nummer 2:");
        //double num2 = myScanner.nextDouble();

        //double result01 = Match.max(num1,num2);

        //System.out.println("Maximumwaarde is: " + result01);

        //Oefening1
        //Scanner: Maak een programma dat gebruik maakt van Scanner om de gebruiker om twee getallen tevragen en vervolgens de som te berekenen en weer te geven.

        System.out.println("Nummer 1: ");
        int num01 = myScanner.nextInt();

        System.out.println("Nummer 2: ");
        int num02 = myScanner.nextInt();

        int result02 = num01+num02;
        System.out.println("Som van 1 en 2 is: "+result02);

        //Oefening3
        //Math: Maak een programma dat gebruik maakt van Math om de absolute waarde, het kwadratischewortel en de macht van een getal te berekenen en weer te geven.

        Random random  = new Random();
        int randomNumber = random.nextInt(100);

        if (randomNumber%2==0) {

            System.out.println("Uw getal is: "+randomNumber);
            System.out.println("Het getal is even");
        }else{

            System.out.println("Uw getal is: "+randomNumber);
            System.out.println("Het gelal is oneven");
        }

        //Oefening2
        //Random: Maak een programma dat een willekeurig getal tussen 1 en 100 genereert en vervolgensbepaalt of het getal even of oneven is.

        System.out.println("Voer een nummer in: ");
        double x = myScanner.nextDouble();

        System.out.println("Uw nummer is: "+x);
        System.out.println("De macht van een getal te berekenen: ");
        double y = myScanner.nextDouble();

        double result03 = Math.abs(x);
        double result04 = Math.sqrt(x);
        double result05 = Math.pow(x,y);

        System.out.println("De absolute waarde van "+x+ " is "+result03);
        System.out.println("Het kwadratischewortel van "+x+ " is "+result04);
        System.out.println("De macht van "+x+" is "+result05);
    }
}
