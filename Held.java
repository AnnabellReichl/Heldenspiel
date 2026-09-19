/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author (AniMaL) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Held
{
    public String name;
    private int staerke;
    public int angriffswert;
    public int lebenspunkte;
    private Waffe meineWaffe;
    

    public Held(String pName; int pStaerke;)
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
        angriffswertBerechnen();
      
    }
    private angriffswertBerechnen();
    {
        angriffswert = staerke + meineWaffe.bonus;
    }
        
}

