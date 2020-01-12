import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4f764f51-6787-40df-bbd6-697aedf7e8e2")
public class Cercle extends Figure {
    @objid ("235ea47b-e3fe-44bf-874c-f23cd69d8dbf")
    private int Rayon;

    @objid ("834f5210-9f65-41be-b57d-d43081fc91f1")
    int getRayon() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Rayon;
    }

    @objid ("dd61818b-a186-485e-97ea-e39fa0e6a21f")
    void setRayon(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Rayon = value;
    }

    @objid ("afffd781-db50-4ce7-8b55-a2e6e5c4f85b")
    public Cercle(int rayon, int posX, int posY, String couleur) {
        super(posX,posY,couleur);
        this.rayon = rayon;
    }

}
