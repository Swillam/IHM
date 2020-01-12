import java.awt.Graphics;

public class MEllipse extends Modele 
{
    private static final long serialVersionUID = -6782708234238768441L;
    private Ellipse e;

    public MEllipse(Ellipse e)
    {
        this.e = e;
    }
    public void draw(Graphics g)
    {
        int rayon = e.getRayon();
        int rayon2 = e.getRayon2();
        int x = e.getPosX()-(rayon);
        int y = e.getPosY()-(rayon2);
        int diametre = rayon*2;
        int diametre2 = rayon2*2;
        g.setColor(couleur);
        g.drawOval(x, y, diametre, diametre2);
        if (e.getEstPlein()) g.fillOval(x, y, diametre, diametre2);
    }
}