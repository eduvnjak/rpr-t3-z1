package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    public FiksniBroj(Grad grad, String broj){
            this.grad = grad;
            this.broj = broj;
    }
    public Grad dajGrad(){
        return grad;
    }
    public String ispis(){
            return  '0'+grad.dajPozivniBroj()+'/'+broj;
        }
    public int hashCode(){
            return broj.hashCode();
    }
}
