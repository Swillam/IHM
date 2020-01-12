import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public class Modele implements Serializable
{    
    private static final long serialVersionUID = 2411514590449298882L;
    protected Color couleur;

    public void draw(Graphics g) {
    }
    public void setColor(Color c)
    {
        this.couleur = c;
    } 
}