import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* Programme Principale */
public class Principale{
  public static void main(String[] args){
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        Fenetre ex2 = new Fenetre("Eteins la lumiere");
        ex2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex2.setSize(800,500);
        ex2.setVisible(true);
      }
    });
  }
}

class Fenetre extends JFrame implements ActionListener{
  /* Attributs */
  private JButton configurer, aleatoire, jouer, quitter;
  private JPanel grille, menu;
  private int nb_dep = 0;
  private JLabel score;
  private Container fenetre;
  private int selectX, selectY;

  /* Constructeur */
  public Fenetre(String titre){
    super(titre);
    // Creation de la grille
    grille = new JPanel(){
      public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.green);
        int h = grille.getHeight(); //hauteur
        int w = grille.getWidth(); //largeur
        for (int i=0; i<6; i++){
          g.drawLine(0, h/5*i, w, h/5*i);
        }
        for (int j=0; j<6; j++){
          g.drawLine(w/5*j, 0, w/5*j, h);
        }
      }
    };

    configurer = new JButton("Configurer");

    aleatoire = new JButton("Aleatoire");

    jouer = new JButton("Jouer");

    quitter = new JButton("Quitter");

    score = new JLabel("Nb Deplacements : " + nb_dep);

    menu = new JPanel();
    menu.setLayout(new GridLayout(8,1));
    menu.add(configurer);
    menu.add(aleatoire);
    menu.add(jouer);
    menu.add(score);
    menu.add(quitter);

    // Creation de la fenetre complete
    fenetre = getContentPane();
    fenetre.setLayout(new BorderLayout());
    fenetre.add(grille, BorderLayout.CENTER);
    fenetre.add(menu, BorderLayout.WEST);
  }


  public void actionPerformed(ActionEvent e){
    String b;

    b = ((JButton) e.getSource()).getText();
    switch (b){
      case "Configurer":
      case "Aleatoire":
      case "Jouer":
      case "Quitter":
    }
    score.setText ("Nb Deplacements : " + nb_dep);
  }

}
