class Zauberer extends Held 
{
    private double zauberkraft;

    public Zauberer(String pName, int pStaerke)
    {
        super(pName, pStaerke);
        zauberkraft = ((Math.random()*2)+1);
    }

    public double getZauberkraft()
    {
        return zauberkraft;
    }

    public void heilen()
    {
        if((lebenspunkte < 3)&&(zauberkraft>=1)) 
        {
            lebenspunkte++;
            zauberkraft--;
        }
    }
}
