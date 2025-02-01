import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class JeuPendu {
    public String espacerLettres(String mot) {
        String texteAvecEspacement = "";
        texteAvecEspacement += "<html>";
        for (int i = 0; i < mot.length(); i++) {
            texteAvecEspacement += mot.charAt(i) + "&nbsp;";
        }
        texteAvecEspacement += "</html>";
        return texteAvecEspacement;
    }
    public StringBuilder verifierMot(char lettre, String mot, String motDef) {
        for (int i = 0; i < mot.length(); i++) {
            if (new String(new char[] { lettre }).equals(new String( new char[] {mot.charAt(i)}))) {
                motDef = motDef.substring(0, i) + lettre + motDef.substring(i+1);
            }      
        }
        return new StringBuilder(motDef);
    }
    public static void main(String[] args) {
        JeuPendu ex = new JeuPendu();
        String[] mots = new String[] {"pendule", "chat", "maison", "animal", "lune", "lunette", "livre", "feuille", "arbre", "programme", "magazine", "petit", "ordinateur", "crayon", "marqueur", "pays", "fleuve", "utilisateur", "clavier", "orange", "citron", "kiwi", "arbre", "fleuve", "geographie", "anticonstutitionellement", "loi", "carton", "vacance", "plage", "ocean", "vague", "jeux", "etoile", "telephone", "football", "ciel", "terre", "plante", "pizza", "tacos", "coussin", "lit", "matelas", "confiture", "histoire", "mathematiques", "physique", "science", "cerveau", "coeur", "trajet", "route", "cahier", "cadeau", "bocal", "horloge", "journal", "television", "buffet", "crime", "prison", "bouton", "montagne", "cable", "prise", "moyenne", "mot", "phrase", "continent", "rideau", "carte", "ecouteurs"};
        Random random = new Random();
        List<Integer> level = new ArrayList<>();
        level.add(0);
        int index = random.nextInt(mots.length - 1);
        StringBuilder[] mot = new StringBuilder[]{new StringBuilder(mots[index])};
        StringBuilder[] motDef = new StringBuilder[]{new StringBuilder("")};
        for (int i = 0; i < mot[0].toString().length(); i++) {
            motDef[0].append("_");
        }
        JFrame frame = new JFrame("Jeu du pendu");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        ImageIcon imageicon = new ImageIcon("C:/users/Anis Djerrab/Downloads/icon.jpg");
        frame.setIconImage(imageicon.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        JPanel CentralPanel = new JPanel();
        CentralPanel.setBackground(Color.WHITE);
        CentralPanel.setLayout(null);
        CentralPanel.setPreferredSize(new Dimension(400, 400));
        CentralPanel.setBounds(50, -20, 600, 400);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(100, 4));
        panel.setBounds(225, 90, 4, 260);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLACK);
        panel2.setPreferredSize(new Dimension(100, 4));
        panel2.setBounds(175, 350, 100, 4);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLACK);
        panel3.setPreferredSize(new Dimension(100, 4));
        panel3.setBounds(225, 90, 75, 4);
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.BLACK);
        panel4.setPreferredSize(new Dimension(100, 4));
        panel4.setBounds(300, 90, 4, 50);
        JPanel panel5 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setClip(null);
                int CenterX = getWidth()/2;
                int CenterY = getHeight()/2;
                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(4));
                g2d.rotate(Math.toRadians(-30), CenterX, CenterY);
                g2d.drawLine(71, 10, 0, 27);
                g2d.rotate(Math.toRadians(90), CenterX-8, CenterY+25);
                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawLine(69, 5, 0, 21);
            }
        };
        panel5.setBackground(Color.WHITE);
        panel5.setSize(new Dimension(200, 200));
        panel5.setBounds(167, 300, 100, 50);
        JPanel panel6 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setClip(null);
                g2d.setColor(new Color(150, 0, 0));
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(0, 0, 40, 40);
            }
        };
        panel6.setBackground(Color.WHITE);
        panel6.setSize(new Dimension(200, 200));
        panel6.setBounds(280, 140, 41, 41);
        JPanel panel7 = new JPanel();
        panel7.setBackground(new Color(150, 0, 0));
        panel7.setPreferredSize(new Dimension(100, 4));
        panel7.setBounds(300, 180, 4, 90);
        JPanel panel8 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setClip(null);
                g2d.setColor(new Color(150, 0, 0));
                int[] xpoints = {0, 50, 25};
                int[] ypoints = {40, 40, 0};
                g2d.setStroke(new BasicStroke(4.0f));
                g2d.drawLine(30, 25, 60,0);
                g2d.drawLine(90, 25, 60,0);
            }
        };
        panel8.setBackground(Color.WHITE);
        panel8.setSize(new Dimension(200, 200));
        panel8.setBounds(240, 200, 100, 50);
        JPanel panel9 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setClip(null);
                g2d.setColor(new Color(150, 0, 0));
                int[] xpoints = {0, 50, 25};
                int[] ypoints = {40, 40, 0};
                g2d.setStroke(new BasicStroke(4.0f));
                g2d.drawLine(30, 25, 60,0);
                g2d.drawLine(90, 25, 60,0);
            }
        };
        panel9.setBackground(Color.WHITE);
        panel9.setSize(new Dimension(200, 200));
        panel9.setBounds(240, 270, 100, 50);
        JPanel panelText = new JPanel();
        panelText.setBackground(Color.WHITE);
        panelText.setBounds(0, 425, 600, 200);
        panelText.setLayout(new BorderLayout());
        JLabel label = new JLabel(ex.espacerLettres(motDef[0].toString()));
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        panelText.add(label);
        panelText.setFocusable(true);
        panelText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char character = e.getKeyChar();
                String input = motDef[0].toString();
                motDef[0] = ex.verifierMot(character, mot[0].toString(), motDef[0].toString());
                String output = motDef[0].toString();
                label.setText(ex.espacerLettres(motDef[0].toString()));
                if (input.equals(output)) {
                    level.set(0, level.get(0) + 1);
                }
                if (level.get(0) == 1) {
                    CentralPanel.add(panel3);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                } 
                else if (level.get(0) == 2) {
                    CentralPanel.add(panel4);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                }
                else if (level.get(0) == 3) {
                    CentralPanel.add(panel5);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                }
                else if (level.get(0) == 4) {
                    CentralPanel.add(panel6);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                }
                else if (level.get(0) == 5) {
                    CentralPanel.add(panel7);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                }
                else if (level.get(0) == 6) {
                    CentralPanel.add(panel8);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                }
                else if (level.get(0) == 7) {
                    level.set(0, 0);
                    CentralPanel.add(panel9);
                    CentralPanel.revalidate();
                    CentralPanel.repaint();
                    Timer timer1 = new Timer(500, t -> {
                        JLabel labelFin = new JLabel("GAME OVER!");
                        labelFin.setFont(new Font("Arial", Font.PLAIN, 90));
                        labelFin.setForeground(new Color(150, 0, 0));
                        frame.getContentPane().removeAll();
                        frame.setLayout(new BorderLayout());
                        frame.add(labelFin, BorderLayout.CENTER);
                        frame.revalidate();
                        frame.repaint();
                        Timer timer2 = new Timer(1000, t2 -> {
                            frame.setLayout(null);
                            frame.getContentPane().removeAll();
                            int i = random.nextInt(mots.length - 1);
                            mot[0].setLength(0);
                            mot[0].append(mots[i]);
                            motDef[0].setLength(0);
                            for (int o = 0; o < mot[0].toString().length(); o++) {
                                motDef[0].append("_");
                            }
                            label.setText(ex.espacerLettres(motDef[0].toString()));
                            frame.add(panelText);
                            panelText.requestFocusInWindow();
                            CentralPanel.removeAll();
                            CentralPanel.add(panel);
                            CentralPanel.add(panel2);
                            frame.add(CentralPanel);
                            frame.revalidate();
                            frame.repaint();
                        });
                        timer2.setRepeats(false);
                        timer2.start();
                    });
                    timer1.setRepeats(false);
                    timer1.start();
                }
                if (mot[0].toString().equals(motDef[0].toString())) {
                level.set(0, 0);
                    Timer timer1 = new Timer(500, t -> {
                        JLabel labelFin = new JLabel("GAME WON!");
                        labelFin.setFont(new Font("Arial", Font.PLAIN, 91));
                        labelFin.setForeground(new Color(0, 200, 0));
                        frame.getContentPane().removeAll();
                        frame.setLayout(new BorderLayout());
                        frame.add(labelFin, BorderLayout.CENTER);
                        frame.revalidate();
                        frame.repaint();
                        Timer timer2 = new Timer(1000, t2 -> {
                            frame.setLayout(null);
                            System.out.println("debug #1");
                            frame.getContentPane().removeAll();
                            int i = random.nextInt(mots.length - 1);
                            mot[0].setLength(0);
                            mot[0].append(mots[i]);
                            motDef[0].setLength(0);
                            for (int o = 0; o < mot[0].toString().length(); o++) {
                                motDef[0].append("_");
                            }
                            label.setText(ex.espacerLettres(motDef[0].toString()));
                            frame.add(panelText);
                            panelText.requestFocusInWindow();
                            CentralPanel.removeAll();
                            CentralPanel.add(panel);
                            CentralPanel.add(panel2);
                            frame.add(CentralPanel);
                            frame.revalidate();
                            frame.repaint();
                        });
                        timer2.setRepeats(false);
                        timer2.start();
                    });
                    timer1.setRepeats(false);
                    timer1.start();
                }
            }
        });
        frame.add(panelText);
        CentralPanel.add(panel);
        CentralPanel.add(panel2);
        frame.add(CentralPanel);
        frame.setVisible(true);
    }
}