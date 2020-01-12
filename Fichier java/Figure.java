import java.io.Serializable;

//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("5d95665b-8200-4ff1-9e2a-58653c12238b")
public abstract class Figure implements Serializable {
    private static final long serialVersionUID = 2213230278424761032L;

    //@objid ("7de22cb3-7212-4d90-9ed1-9edbc07e0c59")
    protected int posX;

    //@objid ("101ebe49-2c41-435b-851d-6c1d9613f466")
    protected int posY;

    private boolean estPlein;

    public Modele model;


    //@objid ("f536a1ca-cdfc-47b1-837b-1a2ae2be6f88")
    public int getPosX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.posX;
    }

    //@objid ("9f932ed2-0bac-425d-b7e1-5ab3f1a474e6")
    public void setPosX(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.posX = value;
    }

    //@objid ("67344b71-880a-4b11-a317-a79600da1ea7")
    public int getPosY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.posY;
    }

    //@objid ("2631739e-c7d2-4c78-b0fa-8bf51ac7dda7")
    public void setPosY(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.posY = value;
    }

    //@objid ("66d78f94-0e89-4f58-a754-c04fa79ce07e")

    public boolean getEstPlein()
    {
        return estPlein;
    }

    public void setEstPlein(boolean estPlein)
    {
        this.estPlein = estPlein;
    }

    public Figure(int posX, int posY,boolean estPlein) 
    {
        this.posX = posX;
        this.posY = posY;
        this.estPlein = estPlein;
    }

    public boolean contient(int x, int y)
    {

        return false ;
    }

}
