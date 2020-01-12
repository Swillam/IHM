
//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("263284f5-8e50-40b3-9c08-5fb62c2589a6")
public class Ellipse extends Cercle {
    private static final long serialVersionUID = -1973184720374030221L;
    // @objid ("68f0bd18-cefc-4966-8d8e-1d48dac435ea")
    private int rayon2;

    //@objid ("ef47021d-adf4-4dd2-b02a-93fdd4dd3251")
    public void setRayon2(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.rayon2 = value;
    }

    //@objid ("4862c863-ed0a-4b48-95bb-2c4ee46901e6")
    public int getRayon2() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.rayon2;
    }

    //@objid ("58b1bc91-92ea-40c8-8b0d-cfddb1568f33")
    public Ellipse(int posX, int posY, int rayon, int rayon2, boolean estPlein) {
        super(rayon,posX,posY,estPlein);
        this.rayon2 = rayon2;
        this.model = new MEllipse(this);
    }

}
