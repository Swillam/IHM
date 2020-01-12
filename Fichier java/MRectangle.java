import java.awt.Graphics;

public class MRectangle extends Modele 
{
    private static final long serialVersionUID = 8565684578745054142L;
    private Rectangle r;

    public MRectangle(Rectangle r)
    {
        this.r = r;
    }
    public void draw(Graphics g)
    {
        int x, y, width, height;
        x = r.getPosX();
        y = r.getPosY();
        width = r.getX() - x;
        height = r.getY() - y;
        g.setColor(couleur);
        g.drawRect(x, y, width, height);
        if(r.getEstPlein()) g.fillRect(x, y, width, height);
    }
}