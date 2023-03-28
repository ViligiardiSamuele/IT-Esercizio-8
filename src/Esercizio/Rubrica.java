package Esercizio;

import java.util.ArrayList;

public class Rubrica {
    protected String nome;
    protected ArrayList<Contatto> elenco;

    public Rubrica(){}
    public Rubrica(String nome, ArrayList<Contatto> elenco) {
        this.nome = nome;
        this.elenco = elenco;
    }
    public Rubrica(String nome) {
        this.nome = nome;
        this.elenco = new ArrayList<Contatto>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Contatto> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<Contatto> elenco) {
        this.elenco = elenco;
    }

    public boolean numeroRipetuto(Contatto contatto) {
        for(Contatto c : this.getElenco())
            if(contatto.getNumero().equals(c.getNumero()))
                return true;
        return false;
    }

    public boolean personaRipetuta(Contatto contatto) {
        for(Contatto c : this.getElenco())
            if(contatto.getCognome().equals(c.getCognome()))
                if(contatto.getNome().equals(c.getNome()))
                    return true;
        return false;
    }

    public boolean aggiugniContatto(Contatto contatto){
        if(!(personaRipetuta(contatto) && numeroRipetuto(contatto) && contatto.datiOk()))
            return this.getElenco().add(contatto);
        return false;
    }
    public String ricercaPersona(Contatto contatto){
        for(Contatto c : this.getElenco())
            if(contatto.getCognome().equals(c.getCognome()))
                if(contatto.getNome().equals(c.getNome()))
                    return c.getNumero();
        return "";
    }

    public String ricercaNumero(Contatto contatto){
        for(Contatto c : this.getElenco())
            if(contatto.getNumero().equals(c.getNumero()))
                return "Nome: " + c.getNome() + " - Cognome: " + c.getCognome();
        return "";
    }

    public boolean eliminaPersona(Contatto contatto) {
        for(Contatto c : this.getElenco())
            if(contatto.getCognome().equals(c.getCognome()))
                if(contatto.getNome().equals(c.getNome()))
                    return this.getElenco().remove(contatto);
        return false;
    }

    public boolean eliminaNumero(Contatto contatto) {
        for(Contatto c : this.getElenco())
            if(contatto.getNumero().equals(c.getNumero()))
                return this.getElenco().remove(contatto);
        return false;
    }
}