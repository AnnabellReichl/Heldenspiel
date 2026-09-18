
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
    
    
    public Waffe(String pMaterial){
        material = pMaterial;
        if(material.equals("Holz")){
            bonus = 3;
        }
        if(material.equals("Titan")){
            bonus = 10;
        }
        if(material.equals("Plastik")){
            bonus = 0;
        }

        bonus = bonus + magie;

    }     
    
}
