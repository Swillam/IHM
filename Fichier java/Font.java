public class Font extends Figure {

    private static final long serialVersionUID = -1937177102744555735L;
    private String texte;

    public Font(int posX, int posY, boolean estPlein, String texte) 
    {
        super(posX, posY, estPlein);
        this.texte = texte;
        this.model = new MFont(this);
    }
    public String getTexte()
    {
        return this.texte;
    }

}