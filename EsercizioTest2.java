import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioTest2 {
    static ArrayList<String> nomeArr = new ArrayList<String>();
    static ArrayList<Integer> passArr = new ArrayList<Integer>();
    static ArrayList<String> domandaArr = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int scelta = 0;
        do {
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    registrazione();
                    break;
                case 2:
                    login();
                    break;
                default:
                    break;
            }
        } while (scelta != 4);

    }

    public static void registrazione() {
        // raccolgo tutte informazioni dell utente e le metto ognuno nel proprio array.
        System.out.print("Inserisci il nome: ");
        input.nextLine();
        String nome = input.nextLine();
        System.out.print("Inserisci la password: ");
        int pass = input.nextInt();
        input.nextLine();// consumo l input di int.
        System.out.print("Inserisci la domanda segreta: ");
        String domandaSegreta = input.nextLine();
        String inputSistemato = domandaSegreta.toLowerCase().trim();

        nomeArr.add(nome);
        passArr.add(pass);
        domandaArr.add(inputSistemato);

        System.out.println("Utente: " + nome + ", " + domandaSegreta + ", " + inputSistemato);
    }

    public static void login() {
        System.out.print("Inserisci il nome utente: ");
        input.nextLine(); // pulisco lo scanner
        String nomeUtente = input.nextLine();

        // Verifica se l'utente esiste
        if (nomeArr.contains(nomeUtente)) {
            int index = nomeArr.indexOf(nomeUtente); // Trovo l'indice dell'utente registrato

            System.out.print("Inserisci la password: ");
            int passUtente = input.nextInt();
            input.nextLine(); // pulisco nuovamente lo scanner.

            // Verifica della password con un semplice confronto.
            if (passUtente == passArr.get(index)) {
                System.out.print("Inserisci la domanda segreta: ");
                String domandaUtente = input.nextLine().toLowerCase().trim();

                // Verifica della risposta alla domanda segreta
                if (domandaUtente.equals(domandaArr.get(index))) {
                    System.out.println("Login effettuato.");
                } else {
                    System.out.println("Risposta errata alla domanda segreta");
                }
            } else {
                System.out.println("Password errata");
            }
        } else {
            System.out.println("Utente non trovato");
        }
    }
}
