class Krieger extends Held 
{
    private double ausdauer;

    public Krieger(double pAusdauer, String pName, int pStaerke)
    {
        super(pName, pStaerke);
        if((pAusdauer >= 0)&&(pAusdauer <= 2))
        {   
            ausdauer = pAusdauer;
        }
        else
        {
            ausdauer = 1.5;
        }
         angriffswert = angriffswertBerechnen();
    }
    
    public double getAusdauer()
    {
        return ausdauer; 
    }

    public double angriffswertBerechnen()
    {
        return super.angriffswertBerechnen() * ausdauer;
    }

    
}
