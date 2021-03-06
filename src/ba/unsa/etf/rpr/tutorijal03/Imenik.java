package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> kontakti;
    public Imenik(){
        kontakti = new HashMap<String, TelefonskiBroj>();
    }
    public void dodaj(String ime, TelefonskiBroj broj){
        kontakti.put(ime,broj);
    }
    String dajBroj(String Ime){
        if(kontakti.containsKey(Ime)) {
            TelefonskiBroj trazeniBroj = kontakti.get(Ime);
            return trazeniBroj.ispisi();
        }
        return "Ne postoji kontakt sa tim imenom.";
    }
    String dajIme(TelefonskiBroj broj){
        if(kontakti.containsValue(broj)){
            for(Map.Entry<String, TelefonskiBroj> entry : kontakti.entrySet()){
                if(entry.getValue() == broj) return entry.getKey();
            }
        }
        return "Ne postoji kontakt sa tim brojem.";
    }
    String naSlovo(char s){
        String spisak = new String();
        int brojac = 0;
        for(Map.Entry<String, TelefonskiBroj> entry : kontakti.entrySet()){
            if(entry.getKey().charAt(0) == s){
                brojac++;
                if(brojac != 0) spisak += '\n';
                spisak += (brojac+". "+entry.getKey()+" - "+entry.getValue().ispisi());
            }
        }
        return spisak;
    }
    Set<String> izGrada(FiksniBroj.Grad g){
        TreeSet<String> imena = new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> entry : kontakti.entrySet()){
            if(entry.getValue() instanceof FiksniBroj){
                if(g == ((FiksniBroj)entry.getValue()).dajGrad()) {
                    imena.add(entry.getKey());
                }
            }
        }
        return imena;
    }
    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        TreeSet<TelefonskiBroj> brojevi = new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String, TelefonskiBroj> entry : kontakti.entrySet()){
            if(entry.getValue() instanceof FiksniBroj){
                if(((FiksniBroj) entry.getValue()).dajGrad() == g)
                    brojevi.add(entry.getValue());
            }
        }
        return brojevi;
    }
}
