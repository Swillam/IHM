//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("6317f353-535b-4e14-afac-02e3fa1886a9")
public class Triangle extends Figure {
    private static final long serialVersionUID = -2824446182715030352L;

    // @objid ("ab659684-9472-404c-af31-b024118ea1e2")
    public int[] x = new int[3];

    //@objid ("97200fc9-0ff8-4ae7-9f64-0109d70b82e1")
    public int[] y = new int[3];

    //@objid ("fda70ab7-f0d1-4ec0-b31f-1c97d6355cc2")
    public Triangle(int[] x, int[] y, boolean estPlein) {
        super(x[0], y[0], estPlein);
        this.x = x;
        this.y = y;
        this.model = new MTriangle(this);
    }
    public int[] getX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.x;
    }

    void setX(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.x = value;
    }

    public int[] getY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.y;
    }

}
