package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj{
    protected String broj;
    public abstract String ispis();
    public abstract int hashCode();
}
public class FiksniBroj extends TelefonskiBroj{

    enum Grad{LIVNO(34), ORASJE(31), SARAJEVO(33), TRAVNIk(30), TUZLA(35), ZENICA(32), MOSTAR(36), BIHAC(37), GORAZDE(38), SIROKI_BRIJEG(39),
        BRCKO(49), MRKONJIC_GRAD(50), BANJA_LUKA(51), PRIJEDOR(52), DOBOJ(53), SAMAC(54), BIJELJINA(55), ZVORNIK(56), PALE(57), FOCA(58), TREBINJE(59);
        private int pozivniBroj;
        Grad(int pozivniBroj){
            this.pozivniBroj = pozivniBroj;
        }
        public int dajPozivniBroj(){
            return pozivniBroj;
        }
    }
        private Grad grad;
        public FiksniBroj(Grad grad, String broj){
            this.grad = grad;
            this.broj = broj;
        }
        public String ispis(){
            return  '0'+grad.dajPozivniBroj()+'/'+broj;
        }
    public int hashCode(){
            return 0;
    }
}
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
        return 0;
    }
}
public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
        public MedunarodniBroj(String drzava, String broj){
            this.drzava = drzava;
            this.broj = broj;
        }
        public String ispis(){
            return drzava+broj;
        }
    public int hashCode(){
        return 0;
    }
}