package menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    JLabel et;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem fondo_azul, fondo_rojo, fuente_blanca, fuente_negra, arial_18, times_36;
    
    Menu(){
    setLayout(null);
    setTitle("Menú de opciones");
    setBounds(300,300,400,400);
    //Etiqueta
    et = new JLabel("Hola mundo");
    et.setBounds(150,150,170,50);
    et.setOpaque(true);
    add(et);
    //Menú
    menuBar = new JMenuBar();
    
    menu = new JMenu("Colores");
    menuBar.add(menu);
    fondo_azul = new JMenuItem("Fondo azul");
   fondo_azul.addActionListener(this);
    menu.add(fondo_azul);
    fondo_rojo = new JMenuItem("Fondo rojo");
    fondo_rojo.addActionListener(this);
    menu.add(fondo_rojo);
    menu.addSeparator();
    
    fuente_blanca = new JMenuItem("Fuente blanca");
    fuente_blanca.addActionListener(this);
    menu.add(fuente_blanca);
    fuente_negra = new JMenuItem("Fuente negra");
    fuente_negra.addActionListener(this);
    menu.add(fuente_negra);
    
    
    
    menu = new JMenu("Fuente");
    menuBar.add(menu);
    arial_18 = new JMenuItem("Arial 18");
    arial_18.addActionListener(this);
    menu.add(arial_18);
    times_36 = new JMenuItem("Times 36");
    times_36.addActionListener(this);
    menu.add(times_36);
    
    setJMenuBar(menuBar);
    
    }

  
    public static void main(String[] args) {
        
        Menu marco = new Menu();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Font arial = new Font("Arial",Font.ITALIC,18);
        Font times = new Font("Times",Font.BOLD,36);
        
        
        if(e.getSource()==fondo_azul) et.setBackground(Color.BLUE);
        if(e.getSource()==fondo_rojo) et.setBackground(Color.red);
        if(e.getSource()==fuente_blanca) et.setForeground(Color.WHITE);
        if(e.getSource()==fuente_negra) et.setForeground(Color.BLACK);
        
        if(e.getSource()==arial_18) et.setFont(arial);
        if(e.getSource()==times_36) et.setFont(times);
       
    }
    
}
