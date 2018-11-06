package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj>{
    protected String broj;
    public abstract String ispisi();
    public abstract int hashCode();
    @Override
    public int compareTo(TelefonskiBroj drugi){
        return this.ispisi().compareTo(drugi.ispisi());
    }
}


