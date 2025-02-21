public class EsercizioTest1 {
    public static void main(String[] args) {
        // inizializzo la variabile limite.
        int numeroLimite = 50;
        // variabile che sommerà i numeri
        int numeroSomma = 0;
        for (int i = 1; i < numeroLimite; i++) {
            // calcola se il numero è pari.
            if (i % 2 == 0) {
                // stampa tutti i numeri pari
                System.out.println(i);
                numeroSomma += i;

            }
        }
        // stampa la somma.
        System.out.println("la somma dei numeri pari elencati in precedenza è: " + numeroSomma);
    }
}
