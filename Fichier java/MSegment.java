import java.awt.Graphics;

public class MSegment extends Modele 
{
    private static final long serialVersionUID = 1521665698227382567L;
    private Segment s;

    public MSegment(Segment s)
    {
        this.s = s;
    }
    public void draw(Graphics g)
    {
        g.setColor(couleur);
        g.drawLine(s.getPosX(), s.getPosY(), s.getX(), s.getY());  
    }
}