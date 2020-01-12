import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5d95665b-8200-4ff1-9e2a-58653c12238b")
public abstract class Figure {
    @objid ("e438131f-b8ec-4881-930e-b515f26ee976")
    private String Couleur;

    @objid ("7de22cb3-7212-4d90-9ed1-9edbc07e0c59")
    private int posX;

    @objid ("101ebe49-2c41-435b-851d-6c1d9613f466")
    private int posY;

    @objid ("75df2b15-3108-4c33-86fe-cd6be0cfa88d")
    private String dessin;

    @objid ("f536a1ca-cdfc-47b1-837b-1a2ae2be6f88")
    int getPosX() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.posX;
    }

    @objid ("9f932ed2-0bac-425d-b7e1-5ab3f1a474e6")
    void setPosX(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.posX = value;
    }

    @objid ("67344b71-880a-4b11-a317-a79600da1ea7")
    int getPosY() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.posY;
    }

    @objid ("2631739e-c7d2-4c78-b0fa-8bf51ac7dda7")
    void setPosY(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.posY = value;
    }

    @objid ("66d78f94-0e89-4f58-a754-c04fa79ce07e")
    String getCouleur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Couleur;
    }

    @objid ("f8726209-3bb9-4de5-aba6-afd0ab9976b4")
    void setCouleur(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Couleur = value;
    }

    @objid ("6655f16b-44b8-4ca2-b3ab-36cbf884387f")
    String getDessin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dessin;
    }

    @objid ("06a9eb3e-2ff6-48f4-88ef-9f3ac373285e")
    void setDessin(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dessin = value;
    }

    @objid ("c0563cb8-a0f9-44a0-8b4c-e9d321d456a8")
    public Figure(int posX, int posY, String couleur) {
    }

}
