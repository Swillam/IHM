
//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("4f764f51-6787-40df-bbd6-697aedf7e8e2")
public class Cercle extends Figure {
    private static final long serialVersionUID = 2846838875407515939L;
    // @objid ("235ea47b-e3fe-44bf-874c-f23cd69d8dbf")
    private int rayon;

    //@objid ("834f5210-9f65-41be-b57d-d43081fc91f1")
    public int getRayon() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.rayon;
    }

    //@objid ("dd61818b-a186-485e-97ea-e39fa0e6a21f")
    public void setRayon(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.rayon = value;
    }

    //@objid ("afffd781-db50-4ce7-8b55-a2e6e5c4f85b")
    public Cercle(int rayon, int posX, int posY, boolean estPlein) {
        super(posX,posY, estPlein);
        this.rayon = rayon;
        this.model = new MCercle(this);
    }

    public boolean contient(int x, int y)
    {
        int longeur = new Segment(x, y, posX, posY, false).getLongueur();
        return longeur<rayon;
        
    }
}
