import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6317f353-535b-4e14-afac-02e3fa1886a9")
public class Triangle extends Figure {
    @objid ("ab659684-9472-404c-af31-b024118ea1e2")
    private int[] x;

    @objid ("97200fc9-0ff8-4ae7-9f64-0109d70b82e1")
    private int[] y;

    @objid ("fda70ab7-f0d1-4ec0-b31f-1c97d6355cc2")
    public Triangle(int[] x, int[] y, int posX, int posY, String couleur) {
        super(posX, posY, couleur);
        this.x = x;
        this.y = y;
    }

    @objid ("673dc530-f908-44fb-b7e8-9c8bda272adf")
    int[] getX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.x;
    }

    @objid ("cf55cadb-fe16-4f15-b8b9-ef5821be4cad")
    void setX(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.x = value;
    }

    @objid ("8df7b166-1c28-477e-bfdf-99867132ce71")
    int[] getY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.y;
    }

}
