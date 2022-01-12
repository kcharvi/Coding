
package objectorientedprogramming;

/**
 *
 * @author Charvi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class PizzaCost implements ActionListener{
    private final JButton Calculate;
    private JRadioButton small, medium, large;
    private JTextField Display;
    private JCheckBox plain,sausage,mushroom,pepperoni;
    static int totalCost = 0;
    public PizzaCost(){
    JFrame jfrm=new JFrame("Radio Button Programming Example");
    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(400,250);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel size = new JPanel();
    Border b1 = BorderFactory.createTitledBorder("Pizza Size");
    size.setBorder(b1);
      
    small=new JRadioButton("Small");
    small.addActionListener(this);
    size.add(small);
    
    medium=new JRadioButton("Medium");
    medium.addActionListener(this);
    size.add(medium);
    
    large=new JRadioButton("Large");
    large.addActionListener(this);
    size.add(large);
    
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    
    
    JPanel toppings = new JPanel();
    Border b2 = BorderFactory.createTitledBorder("Toppings");
    toppings.setBorder(b2);
    plain = new JCheckBox("Plain");
    plain.addActionListener(this);
    toppings.add(plain);
    
    sausage = new JCheckBox("Sausage");
    sausage.addActionListener(this);
    toppings.add(sausage);

    mushroom = new JCheckBox("Mushrooms");
    mushroom.addActionListener(this);
    toppings.add(mushroom);

    pepperoni = new JCheckBox("Pepperoni");
    pepperoni.addActionListener(this);
    toppings.add(pepperoni);
    
    jfrm.add(size);
    jfrm.add(toppings);
    Calculate = new JButton("Calculate Total");
    Calculate.addActionListener(this);
    jfrm.add(Calculate);
    
    Display = new JTextField(15);
    jfrm.add(Display);
      
    jfrm.setVisible(true);
    
       
    }
    public void actionPerformed(ActionEvent ae){
        if (small.isSelected())
           totalCost= 100;
        if (medium.isSelected())
          totalCost= 130;
        if (large.isSelected())
          totalCost= 160;
        if (plain.isSelected())
           totalCost = totalCost+0;
        if (sausage.isSelected())
           totalCost = totalCost+20;
        if (mushroom.isSelected())
          totalCost = totalCost+20;
        if (pepperoni.isSelected())
         totalCost = totalCost+20;
        
        if(ae.getSource() == Calculate)
        { 
            Display.setText("Your total cost is Rs."+totalCost);
            totalCost=0;
//            plain.setSelected(false);
//            sausage.setSelected(false);
//            mushroom.setSelected(false);
//            pepperoni.setSelected(false);
//            small.setSelected(false);
//            medium.setSelected(false);
//            large.setSelected(false);
        }
        
        
    }
//        
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new PizzaCost();
            }
        });
    }
}
