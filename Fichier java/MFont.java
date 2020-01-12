import java.awt.Graphics;

public class MFont extends Modele 
{
    private static final long serialVersionUID = 8565684578745054142L;
    private Font f;

    public MFont(Font f)
    {
        this.f = f;
    }
    public void draw(Graphics g)
    {
        int x, y;
        x = f.getPosX();
        y = f.getPosY();
        String str = f.getTexte();
        g.setColor(couleur);
        g.drawString(str, x, y);

    }
}