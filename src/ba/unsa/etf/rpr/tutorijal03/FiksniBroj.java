package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad{LIVNO(34), ORASJE(31), SARAJEVO(33), TRAVNIk(30), TUZLA(35), ZENICA(32), MOSTAR(36), BIHAC(37), GORAZDE(38), SIROKI_BRIJEG(39),
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
    public Grad dajGrad(){
        return grad;
    }
    public String ispisi(){
            return  "0"+grad.dajPozivniBroj()+"/"+broj;
        }
    public int hashCode(){
            return broj.hashCode();
    }
}
