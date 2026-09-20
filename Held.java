/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author (AniMaL) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Held
{
    protected String name;
    private int staerke;
    protected double angriffswert;
    public int lebenspunkte;
    private Waffe meineWaffe;
    

    public Held(String pName, int pStaerke)
    {
        name = pName;
        if((pStaerke >= 0)&&(pStaerke <= 10))
        {
            staerke = pStaerke;
        }
        else 
        {
            staerke = 2;
        }
        angriffswert = angriffswertBerechnen();
      
    }
    public double angriffswertBerechnen()
    {
        return staerke + meineWaffe.bonusBerechnen();  
    }
    public double getAngriffswert()
    {
        return angriffswert;
    }
        
}

