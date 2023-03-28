package Esercizio;

public class Contatto {
    protected String nome, cognome, numero;

    public Contatto(){}
    public Contatto(String nome, String cognome, String numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }
    public Contatto(Contatto contatto) {
        this.nome = contatto.getNome();
        this.cognome = contatto.getCognome();
        this.numero = contatto.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString(){
        return "Numero: " + this.getNumero() + "\nNome: " + this.getNome() + "\nCognome" + this.getCognome();
    }

    public boolean datiOk(){
        if (this.getNumero().equals("")) return false;
        else if (this.getNome().equals("")) return false;
        else if (this.getCognome().equals("")) return false;
        else return true;
    }
}