import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PanelDessin extends JPanel 
{
    private static final long serialVersionUID = -5089044230387720020L;
    private Dessin d;
    private JFileChooser choixFichier= new JFileChooser();  // creation de l'objet choix d'un fichier
    private ArrayList<Figure> fEffacer = new ArrayList<Figure>();


    public PanelDessin()
    {
        super();
        d = new Dessin();
        File dossier_courant = new File(".");
        choixFichier.setFileFilter(new FileNameExtensionFilter("Fichier ser", "ser")); // filtrer la selection avec des fichier txt
        choixFichier.setCurrentDirectory(dossier_courant);   // selectionner le dossier courant 
    }
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        for(int i=0; i < this.d.size(); i++)
        {
            d.get(i).model.draw(g);
        }
    }

    public void ajoutFig(Figure f)
    {
        d.add(f);
        this.repaint();
    }
    public void sauvegarde() 
    {
        try 
        {
            int siFichierChoisi = choixFichier.showSaveDialog(null);  // afficher le popup pour choisir et enregistrer si on a choisi
            if(siFichierChoisi == JFileChooser.APPROVE_OPTION) // si seulement un fichier est choisi on creer la fenetre
            {
                File f = choixFichier.getSelectedFile(); //avoir le fichier
                ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(d);
                oos.close();
            }
           
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erreur : fichier non sauvegardé", "Erreur de sauvegarde", JOptionPane.ERROR_MESSAGE);
        }
      }
    
    public void chargement() 
    {
        try 
        {
            int siFichierChoisi = choixFichier.showOpenDialog(null);  // afficher le popup pour choisir et enregistrer si on a choisi
            if(siFichierChoisi == JFileChooser.APPROVE_OPTION) // si seulement un fichier est choisi on creer la fenetre
            {
                File f = choixFichier.getSelectedFile(); //avoir le fichier
                ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(f));
                d = (Dessin)ois.readObject();    
                this.repaint();
                ois.close();
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erreur : fichier erroné ou corrompu", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void efface(int x,int y)
    {
        for(int i = this.d.size()-1; i >= 0 ; i--)
        {
            if(d.get(i).contient(x, y)) d.remove(i);
        }
        this.repaint();
    }
    public void retirer()
    {
        if(d.size()>0) 
        {
            fEffacer.add(d.get(d.size()-1));
            d.remove(d.size()-1);
        }
        this.repaint();
    }

    public void rajouter() 
    {
        if(fEffacer.size()>0) 
        {
            d.add(fEffacer.get(fEffacer.size()-1));
            fEffacer.remove(fEffacer.size()-1);
        }
        this.repaint();
    }

}
        