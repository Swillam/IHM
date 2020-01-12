
import java.awt.Graphics;

public class MCercle extends Modele 
{
    private static final long serialVersionUID = 8190169818794484248L;
    private Cercle c;

    public MCercle(Cercle c)
    {
        this.c = c;
    }
    public void draw(Graphics g)
    {
        int rayon = c.getRayon();
        int x = c.getPosX()-(rayon);
        int y = c.getPosY()-(rayon);
        int diametre = rayon*2;
        g.setColor(couleur);
        g.drawOval(x, y, diametre, diametre);
        if (c.getEstPlein()) g.fillOval(x, y, diametre, diametre);
    }
}