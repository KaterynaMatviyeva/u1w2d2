package esercizi.esercizio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        //List è un array potenziato e un'interfaccia = possibilità di inserire elementi in qualsiasi punto e rimuoverlo
        List<String> duplicati = new ArrayList<>();
        Set<String> parole = new HashSet<>();

        System.out.println("inserisci il numero di elementi");
        int nElementi = scanner.nextInt();

        for (int i = 0; i < nElementi; i++) {
            System.out.println("Inserisci una parola");
            String parola = scanner.nextLine();


            if(!parole.add(parola)){
                System.out.println("Parola dublicata");
                duplicati.add(parola);
            }

            for (int j = 0; j < duplicati.size(); j++) {
                System.out.println(duplicati);
            }
        }

        System.out.println(duplicati);
        System.out.println(parole.size());
        System.out.println(parole);




    }
}
