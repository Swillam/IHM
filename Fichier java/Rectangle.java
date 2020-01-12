//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("a3ceab7b-a6ea-42d8-89fe-7f073e54d156")
public class Rectangle extends Figure {
    private static final long serialVersionUID = -3758423674777287288L;

    // @objid ("cb20dbd8-eb01-49e2-9f54-141473abf4e6")
    private int x;

    //@objid ("60909a86-2e2a-41d3-9342-37108e2553b3")
    private int y;

    //@objid ("1bbe811e-c578-4e73-aaca-5fb85a5b31ee")
    public Rectangle(int x, int y, int posX, int posY,boolean estPlein) 
    {
        super(posX, posY, estPlein);
        this.x = x;
        this.y = y;
        this.model = new MRectangle(this);
    }


    //@objid ("394558c9-037c-4b60-937e-333ca340505d")
    public int getX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.x;
    }

    //@objid ("02783dcc-e0d8-4d67-89f9-644af3f7d69f")
    void setX(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.x = value;
    }

    //@objid ("336824d3-c201-42c0-a367-1f88caba5aa3")
    public int getY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.y;
    }

    //@objid ("35724e8e-95f7-44d3-a95a-adbfdf6f2b09")
    void setY(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.y = value;
    }

}
