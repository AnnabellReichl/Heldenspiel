
/**
 * Beschreiben Sie hier die Klasse Waffe.
 * 
 * @author (AniMaL) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Waffe
{
    private double bonus = 0;
    private String material;
    private double  magie;
    
    
    public Waffe(String pMaterial, double pMagie)
    {
        material = pMaterial;
        if((pMagie >= 0) && (pMagie <= 10))
        {
            magie = pMagie;
        }
        else
        {
            magie = 2;
        }
        if(material.equals("Holz"))
        {
            bonus = 3;
        }
        if(material.equals("Titan"))
        {
            bonus = 10;
        }
        if(material.equals("Plastik"))
        {
            bonus = 0;
        }
        bonusBerechnen();
    }
    public double bonusBerechnen()
    {
        bonus = bonus + magie;
        return bonus;
    }
         
    

}


    

