public class laptop
{
    private String hersteller;
    private int kosten;
    private boolean neu;
    
    
    public laptop(String neuHersteller,int neukosten,boolean neuNeu)
    {
        setHersteller(neuHersteller);
        setKosten(neukosten);
        setNeu(neuNeu);
        
    }
    
    public laptop(String neuHersteller,boolean neuNeu)
    {
        setHersteller(neuHersteller);
        setKosten(1000);
        setNeu(neuNeu);
    }
    
    public laptop()
    {
        setHersteller("lenovo");
        setKosten(1000);
        setNeu(true);
    }
    
    public void setHersteller(String neuHersteller)
    {
        hersteller=neuHersteller;
    }
    public void setKosten(int neuKosten)
    {
        kosten=neuKosten;
    }
    public void setNeu(boolean neuNeu)
    {
        neu=neuNeu;
    }
    
}