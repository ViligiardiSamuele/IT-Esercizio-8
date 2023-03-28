package Esercizio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica("Rubrica");
        Contatto newContatto = new Contatto();
        String output;
        int scelta;
        do {
            System.out.println("Gestione rubriche telefoniche");
            System.out.println(" 1 - Aggiungi contatto");
            System.out.println(" 2 - Elimina per contatto");
            System.out.println(" 3 - Elimina per numero");
            System.out.println(" 4 - Ricerca per contatto");
            System.out.println(" 5 - Ricerca per numero");
            System.out.println(" 0 - Esci");
            System.out.print("Scelta: ");
            do { scelta = new Scanner(System.in).nextInt(); } while (scelta < 0 || scelta > 5);
            switch (scelta){
                case 1: //aggiungi
                    System.out.print("Numero: ");
                    newContatto.setNumero(new Scanner(System.in).nextLine());
                    System.out.print("Nome: ");
                    newContatto.setNome(new Scanner(System.in).nextLine());
                    System.out.print("Congome: ");
                    newContatto.setCognome(new Scanner(System.in).nextLine());
                    if(rubrica.aggiugniContatto(newContatto))
                        System.out.println("Contatto aggiunto!");
                    else System.out.println("Contatto non valido!");
                    break;

                case 2: //elimina per contatto
                    System.out.print("Cognome: ");
                    newContatto.setCognome(new Scanner(System.in).nextLine());
                    System.out.print("Nome: ");
                    newContatto.setNome(new Scanner(System.in).nextLine());
                    if(rubrica.eliminaPersona(newContatto))
                        System.out.println("Contatto eliminato");
                    else System.out.println("Contatto inesistente");
                    break;

                case 3: //elimina per numero
                    System.out.print("Numero: ");
                    newContatto.setNumero(new Scanner(System.in).nextLine());
                    if(rubrica.eliminaNumero(newContatto))
                        System.out.println("Contatto eliminato");
                    else System.out.println("Contatto inesistente");
                    break;

                case 4: //ricerca per persona
                    System.out.print("Cognome: ");
                    newContatto.setCognome(new Scanner(System.in).nextLine());
                    System.out.print("Nome: ");
                    newContatto.setNome(new Scanner(System.in).nextLine());
                    output = rubrica.ricercaPersona(newContatto);
                    if(output.equals(""))
                        System.out.println("Contatto inesistente");
                    else System.out.println("Numero del contatto: " + output);
                    break;

                case 5: //ricerca per numero
                    System.out.print("Numero: ");
                    newContatto.setNumero(new Scanner(System.in).nextLine());
                    output = rubrica.ricercaNumero(newContatto);
                    if(output.equals(""))
                        System.out.println("Contatto inesistente");
                    else System.out.println("Numero del contatto: " + output);
            }
        } while (scelta != 0);
    }
}