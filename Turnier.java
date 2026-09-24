public class Turnier {
    
    private Held[] h;
    private Monster[] m;
    
    public Turnier(int pAnzahlHelden, int pAnzahlMonster) {
        
        h = new Held[pAnzahlHelden]; 
        m = new Monster[pAnzahlMonster];
        
        for(int i = 0; i< h.length; i++) {
            Wuerfel w = new Wuerfel(10);
            w.werfen();
            h[i] = new Held("liselotte_"+i, w.gibAugenzahl());
        }
        for(int i = 0; i< m.length; i++) {
            m[i] = new Monster();
        }

        namenAusgeben();
    }
    public Held gibStaerkstenHeld() {
        Held staerkster = h[0];
        for(int i = 1; i<h.length; i++) {
            if(h[i] != null && staerkster.getStaerke() < h[i].getStaerke()) {
                staerkster = h[i];
            }
        }
        return staerkster;
    }

    public void namenAusgeben() {
        for(int i =0; i<h.length; i++) {
            System.out.println(h[i].getName)
        }
    }
    
}
