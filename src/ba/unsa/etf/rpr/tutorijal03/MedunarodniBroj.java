package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }
    public String ispisi(){
            return drzava+broj;
        }
    public int hashCode(){
        return broj.hashCode();
    }
}
