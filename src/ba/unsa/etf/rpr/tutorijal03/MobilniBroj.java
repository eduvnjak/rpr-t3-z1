package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends  TelefonskiBroj{
    private int mobilnaMreza;
    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    public String ispis(){
        return '0'+mobilnaMreza+'/'+broj;
    }
    public int hashCode(){
        return broj.hashCode();
    }
}
