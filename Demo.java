import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Syota nimi: ");
        String nimi = scanner.nextLine();
        System.out.println("Syota sijainti (leveys): ");
        String sijaintiLeveys = scanner.next();
        System.out.println("Syota sijainti (pituus): ");
        String sijaintiPituus = scanner.next();
        Double tonttiA;
        while (true) {
            System.out.println("Syota tontin pinta-ala: ");
            tonttiA = scanner.nextDouble();
            if (tonttiA < 0) {
                System.out.println("Pinta-ala ei voi olla negatiivinen. Yrita uudelleen.");
                continue;
            } else {
                break;
            }
        }

        String sijainti = "Leveys:\"" + sijaintiLeveys + "\", Pituus:\"" + sijaintiPituus + '"';

        Double rakennusA;
        while (true) {
            System.out.println("Syota rakennus pinta-ala: ");
            rakennusA = scanner.nextDouble();
            if (rakennusA < 0) {
                System.out.println("Pinta-ala ei voi olla negatiivinen. Yrita uudelleen.");
                continue;
            } else {
                break;
            }
        }
        System.out.println("Syota asukkaiden maara: ");
        int asukkaat = scanner.nextInt();
        System.out.println("Syota huoneet: ");
        int huoneet = scanner.nextInt();
        scanner.nextLine();

        Asukas asukasTiedot[] = new Asukas[asukkaat];

        // Luodaan niin monta asukasta kuin "asukkaat" -muuttujaan syötettiin.
        for (int i = 0; i < asukkaat; i++) {

            System.out.println("Syota asukas " + (i + 1) + " nimi");
            String temp1 = scanner.nextLine();
            System.out.println("Syota asukas " + (i + 1) + " syntymaaika");
            String temp2 = scanner.nextLine();
            Asukas asukas = new Asukas(temp1, temp2);
            asukasTiedot[i] = asukas;

        }
        Rakennus rakennus = new Rakennus(rakennusA, huoneet, asukkaat, asukasTiedot);
        Tontti tontti = new Tontti(nimi, sijainti, tonttiA, rakennus);

        System.out.println(tontti);
        scanner.close();
    }

}
