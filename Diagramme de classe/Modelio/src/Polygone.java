import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d832441b-818e-489f-a108-bce9c1a82cad")
public class Polygone extends Figure {
    @objid ("5d851593-97c3-48bd-b43c-21d594b37417")
    private int[] x;

    @objid ("dc3cee29-34f1-421c-9d54-9d3205cf7622")
    private int[] y;

    @objid ("a23e0f67-0879-409d-baf9-7049b41be0cb")
    int[] getX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.x;
    }

    @objid ("cb668a88-fe2f-49ac-ab83-31b6ea48835f")
    void setX(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.x = value;
    }

    @objid ("2dbc87f4-3bd8-4b93-b3e9-74938c5f9e8d")
    int[] getY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.y;
    }

    @objid ("93a163c6-ee72-4c58-ae4c-090797becb08")
    void setY(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.y = value;
    }

    @objid ("8fd5c3e3-56c7-40ca-8947-d05288c8a8d0")
    public Polygone(String couleur, int posX, int posY, int[] x, int[] y) {
        super(couleur,posX,posY);
        this.x= x;
        this.y = y;
    }

}
