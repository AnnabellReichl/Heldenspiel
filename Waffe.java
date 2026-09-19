

/**
 * Beschreiben Sie hier die Klasse Waffe.
 * 
 * @author (AniMaL) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Waffe
{
    private int bonus;
    private String material;
    private int magie;
    
    
    public Waffe(String pMaterial; int pMagie)
    {
        material = pMaterial;
        magie = pMagie;
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
    public bonusBerechnen();
    {
        bonus = bonus + magie;
    }
         
    

}
