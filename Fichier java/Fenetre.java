import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Fenetre extends JFrame implements PaintConstante
{
    private static final long serialVersionUID = 3289314905453186397L;
    private PanelDessin pan = new PanelDessin();
    private String forme = "";
    private String t ;
    private ArrayList<Integer> x = new ArrayList<Integer>();
    private ArrayList<Integer> y = new ArrayList<Integer>();
    private Color couleur = new Color(0, 0, 0);
    private JButton button6 = new JButton();
    private boolean estPlein;
    private JTabbedPane jTabbedPane = new JTabbedPane();
    private JTextArea contenu = new JTextArea();

    public Fenetre(String titre, int w, int h) 
    {
        super(titre);
        this.initialise();
        this.setSize(w,h);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void initialise() 
    {
        jmenu();
        pan.setBackground(Color.WHITE);
        pan.addMouseListener(new Ecouteur(0));
        JPanel dessin = new JPanel();
        dessin.setLayout(new BorderLayout());
        dessin.add(pan,BorderLayout.CENTER);
        dessin.add(outil(),BorderLayout.NORTH);
        jTabbedPane.addTab("Dessin", dessin);
        JPanel texte = new JPanel();
        texte.setLayout(new BorderLayout());
        texte.add(contenu,BorderLayout.CENTER);
        JButton ok = new JButton("Entrer");
        ok.addActionListener(new Ecouteur(OK));
        texte.add(ok,BorderLayout.SOUTH);
        jTabbedPane.addTab("Texte", texte);
        this.add(jTabbedPane);
        this.addKeyListener(new Ecouteur(100));
        this.setFocusable(true);
        this.requestFocus();
    }

    public void jmenu()
    {
        JMenuBar bJMenu = new JMenuBar();
        JMenu menuF = new JMenu("Fichier");
        JMenuItem sauve = new JMenuItem("Sauver");
        sauve.addActionListener(new Ecouteur(Sauver));
        JMenuItem charge = new JMenuItem("Charger");
        charge.addActionListener(new Ecouteur(Charger));
        menuF.add(sauve);
        menuF.add(charge);
        JMenu menuE = new JMenu("Editer");
        JMenuItem annuler = new JMenuItem("Annuler");
        annuler.addActionListener(new Ecouteur(CtrlZ));
        JMenuItem remmetre = new JMenuItem("Rétablir");
        remmetre.addActionListener(new Ecouteur(CtrlY));
        menuE.add(annuler);
        menuE.add(remmetre);
        JMenu menuA = new JMenu("A propos");
        JMenuItem info = new JMenuItem("Information");
        info.addActionListener(new Ecouteur(Info));
        menuA.add(info);
        bJMenu.add(menuF);
        bJMenu.add(menuE);
        bJMenu.add(menuA);
        this.setJMenuBar(bJMenu);
    } 

    public JPanel outil()
    {
        Dimension d = new Dimension(40, 40);
        Dimension d1 = new Dimension(20, 20);
        JPanel menu = new JPanel();
        Icon Irectangle = new ImageIcon("rectangle.png");
        JButton button1 = new JButton(Irectangle);
        button1.setPreferredSize(d);
        button1.addActionListener(new Ecouteur(rectangle));
        Icon Icercle = new ImageIcon("cercle.png");
        JButton button2 = new JButton(Icercle);
        button2.setPreferredSize(d);
        button2.addActionListener(new Ecouteur(cercle));
        Icon Itriangle = new ImageIcon("triangle.png");
        JButton button3 = new JButton(Itriangle);
        button3.setPreferredSize(d);
        button3.addActionListener(new Ecouteur(triangle));
        Icon Iellipse = new ImageIcon("ellipse.png");
        JButton button4 = new JButton(Iellipse);
        button4.setPreferredSize(d);
        button4.addActionListener(new Ecouteur(ellipse));
        Icon Isegment = new ImageIcon("segment.png");
        JButton button5 = new JButton(Isegment);
        button5.setPreferredSize(d);
        button5.addActionListener(new Ecouteur(segment));
        button6.setPreferredSize(d1);
        button6.setBackground(couleur);
        button6.setOpaque(true);
        button6.setBorderPainted(false); 
        button6.addActionListener(new Ecouteur(Couleur));
        Icon Igomme = new ImageIcon("gomme.png");
        JButton button7 = new JButton(Igomme);
        button7.setPreferredSize(d);
        button7.addActionListener(new Ecouteur(Effacer));
        Icon IFont = new ImageIcon("font.png");
        JButton button8 = new JButton(IFont);
        button8.setPreferredSize(d);
        button8.addActionListener(new Ecouteur(Font));
        menu.add(button7);
        menu.add(button8);
        menu.add(button1);
        menu.add(button2);
        menu.add(button3);
        menu.add(button4);
        menu.add(button5);
        menu.add(button6);
        return menu;
    }

    public void creationFigure()
    {
        if(forme.equals("Rectangle")&& x.size() == 2)
        {
            int x1 = x.get(0);
            int x2 = x.get(1);
            int y1 = y.get(0);
            int y2 = y.get(1);
            Rectangle r;
            if(x1>x2) r = new Rectangle(x1, y1, x2, y2,estPlein);
            else r = new Rectangle(x2, y2, x1, y1,estPlein);
            r.model.setColor(couleur);
            pan.ajoutFig(r);
            x.clear();
            y.clear();
        }
        if(forme.equals("Cercle")&& x.size() == 2)
        {
            //int diametre = (int) Math.sqrt(Math.pow(x.get(1)-x.get(0),2) + Math.pow(y.get(1)-y.get(0),2))*2 ;
            int rayon = new Segment(x.get(1), y.get(1), x.get(0), y.get(0), estPlein).getLongueur();
            Cercle c = new Cercle(rayon, x.get(0), y.get(0),estPlein);
            c.model.setColor(couleur);
            pan.ajoutFig(c);
            x.clear();
            y.clear();
        }
        if(forme.equals("Triangle")&& x.size() == 3)
        {
            int x[] = new int[3];
            int y[] = new int[3];;
            for (int i = 0; i < 3; i++) 
            {
                x[i] = this.x.get(i);
                y[i] = this.y.get(i);
            }
            Triangle t = new Triangle(x,y,estPlein);
            t.model.setColor(couleur);
            pan.ajoutFig(t);
            this.x.clear();
            this.y.clear();
        }
        if(forme.equals("Segment")&& x.size() == 2)
        {
            int x1 = x.get(0);
            int x2 = x.get(1);
            int y1 = y.get(0);
            int y2 = y.get(1);
            Segment s = new Segment(x1, y1, x2, y2,estPlein);
            s.model.setColor(couleur);
            pan.ajoutFig(s);
            this.x.clear();
            this.y.clear();
        }
        if(forme.equals("Ellipse")&& x.size() == 3)
        {
            int rayon1 =  new Segment(x.get(1), y.get(1), x.get(0), y.get(0), estPlein).getLongueur() ;
            int rayon2 =  new Segment(x.get(2), y.get(2), x.get(1), y.get(1), estPlein).getLongueur() ;
            Ellipse e = new Ellipse(x.get(0), y.get(0), rayon1, rayon2,estPlein);
            e.model.setColor(couleur);
            pan.ajoutFig(e);
            x.clear();
            y.clear();
        }

        if(forme.equals("Texte"))
        {
            Font f = new Font(x.get(0), y.get(0), estPlein, t);
            f.model.setColor(couleur);
            pan.ajoutFig(f);
            x.clear();
            y.clear();
        }
        if (forme.equals("Efface"))
        {
            pan.efface(x.get(0), y.get(0));
            x.clear();
            y.clear();
        }

        if (forme.equals("rien"))
        {
            x.clear();
            y.clear();
        }
        this.hasFocus();
        this.requestFocus();
    }


    
    

    public class Ecouteur implements MouseListener, ActionListener, KeyListener
    {
        int id;

        public Ecouteur(int id)
        {
            this.id = id;
        }

        public void mouseClicked(MouseEvent e) 
        {
            x.add(e.getX());
            y.add(e.getY());
            creationFigure();
        }


        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
        
        public void actionPerformed(ActionEvent e)
        { 
            switch (id) {
                case rectangle:
                    forme = "Rectangle";
                    estPlein = false;

                break;

                case cercle:
                    forme = "Cercle";
                    estPlein = false;
                break;

                case triangle:
                    forme ="Triangle";
                    estPlein = false;
                break;

                case ellipse:
                    forme = "Ellipse";
                    estPlein = false;
                break;

                case segment:
                    forme = "Segment";
                    estPlein = false;
                break;
            
                case Sauver:
                    pan.sauvegarde();
                break;

                case Charger:
                    pan.chargement();
                break;

                case Effacer:
                    forme = "Efface";
                break;

                case CtrlZ:
                    pan.retirer();
                break;

                case CtrlY:
                    pan.rajouter();
                break;

                case Couleur:
                    couleur = JColorChooser.showDialog(null, "couleur", Color.WHITE);
                    button6.setBackground(couleur);
                break;

                case Font:
                    forme = "Texte";
                    jTabbedPane.setSelectedIndex(1);
                break;

                case OK:
                    t = contenu.getText();
                    jTabbedPane.setSelectedIndex(0);
                break;

                case Info:
                    JOptionPane.showMessageDialog(null, "Programme fait par Shawn Modestine", "A propos", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            x.clear();
            y.clear();                
        }
        public void keyTyped(KeyEvent e){}
        public void keyPressed(KeyEvent e) 
        {
            if(e.getKeyCode() == KeyEvent.VK_C) forme = "Cercle";
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_C) {forme = "Cercle";   estPlein = true; }
            if(e.getKeyCode() == KeyEvent.VK_R) {forme = "Rectangle";  estPlein = false; }
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_R) {forme = "Rectangle";   estPlein = true; }
            if(e.getKeyCode() == KeyEvent.VK_S) {forme = "Segment";  estPlein = false;}
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S) {forme = "Segment";   estPlein = true; }
            if(e.getKeyCode() == KeyEvent.VK_T) {forme = "Triangle"; ;  estPlein = false;}
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_T) {forme = "Triangle";   estPlein = true; }
            if(e.getKeyCode() == KeyEvent.VK_E) {forme = "Ellipse";  estPlein = false;}
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_E) {forme = "Ellipse";   estPlein = true; }
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Z) pan.retirer();
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Y) pan.rajouter();
        }
        public void keyReleased(KeyEvent e){}
    }

    public static void main(String [] args) 
    {
        new Fenetre("Paint",1200 ,800);
    }

   
}
   