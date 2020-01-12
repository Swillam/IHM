//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("b1fa0143-974f-4cae-aacb-fc6d7be92b91")
public class Segment extends Figure {
    private static final long serialVersionUID = 5325010726712221163L;

    // @objid ("6c3d6aa5-2c07-407a-bd15-bb2b55c879fb")
    private int x;

    //@objid ("caff07d4-839d-4fa9-a0dc-7bb36aab3cfc")
    private int y;

    //@objid ("0ca83b03-c84a-4bfe-969a-72adb24d6479")
    public Segment(int x, int y, int posX, int posY, boolean estPlein) {
        super(posX, posY, estPlein);
        this.x = x;
        this.y = y;
        this.model = new MSegment(this);
    }

    //@objid ("12c5c0fc-4823-4905-ad19-ba687a5df1db")
    void setX(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.x = value;
    }

    //@objid ("d480076b-c62c-4a18-ad2a-7d8b9db27c67")
    public int getX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.x;
    }

    void setY(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.y = value;
    }

    //@objid ("d480076b-c62c-4a18-ad2a-7d8b9db27c67")
    public int getY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.y;
    }

    public int getLongueur()
    {
        return (int) Math.sqrt(Math.pow(posX-x,2) + Math.pow(posY-y,2)) ;
    }

}
