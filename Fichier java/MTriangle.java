import java.awt.Graphics;

public class MTriangle extends Modele 
{
    private static final long serialVersionUID = 1755910553817321998L;
    private Triangle t;

    public MTriangle(Triangle t)
    {
        this.t = t;
    }
    public void draw(Graphics g)
    {
        g.setColor(couleur);
        g.drawPolygon(t.getX(), t.getY(), 3);
        if(t.getEstPlein())g.fillPolygon(t.getX(), t.getY(), 3);
    }
}