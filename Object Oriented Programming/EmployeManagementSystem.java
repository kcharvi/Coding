/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogramming;

/**
 *
 * @author Charvi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionListener;

public class EmployeManagementSystem implements ActionListener{
    private JTextField Name;
    private JLabel name;
    
    private JTextField Branch;
    private JLabel branch;
    
    private JTextField Address;
    private JLabel address;
    
    private JRadioButton Male, Female;
    
    final String cars[]={"BMW","AUDI","BREZZA","DUSTER"};
    
    private JCheckBox Cricket,Football,Volleyball;
    
    private final JButton Submit;
    
    public EmployeManagementSystem(){
    JFrame jfrm=new JFrame("Employee Registration");
    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(400,250);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    name=new JLabel("Name");
    Name=new JTextField(20);  
    jfrm.add(name);
    jfrm.add(Name);
    
    
    branch=new JLabel("Name");
    Branch=new JTextField(20); 
    jfrm.add(branch);
    jfrm.add(Branch);
    
    address=new JLabel("Name");
    Address=new JTextField(20); 
    jfrm.add(address);
    jfrm.add(Address);
    
    JLabel car=new JLabel("Car");    
    JList<String> jlst= new JList<String>(cars);
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    JScrollPane scroll = new JScrollPane(jlst);
    scroll.setPreferredSize(new Dimension(120,90));
    jlst.addListSelectionListener(new ListSelectionListener(){
      public void valueChanged(Event ae){
          int idx=jlst.getSelectedIndex();
          
          if(idx!=-1){
              car.setText(cars[idx]);
          }
          else{
              car.setText("Choose");
          }
      }   
           
    });  
    
    
    Male=new JRadioButton("Small");
    Male.addActionListener(this);
    jfrm.add(Male);
    
    Female=new JRadioButton("Small");
    Female.addActionListener(this);
    jfrm.add(Female);
    
    Cricket = new JCheckBox("Cricket");
    Cricket.addActionListener(this);
    jfrm.add(Cricket);
    
    Football = new JCheckBox("Football");
    Football.addActionListener(this);
        jfrm.add(Football);

    Volleyball = new JCheckBox("Volleyball");
    Volleyball.addActionListener(this);
        jfrm.add(Volleyball);
        
        Submit = new JButton("Calculate Total");
    Submit.addActionListener(this);
    jfrm.add(Submit);

     
    jfrm.setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == Submit)
        { 
            System.out.println("Name"+name.getText());//Aise
            System.out.println("YAAR TU ISME SB NAME YE SB PRINT KRLE");
            if (Cricket.isSelected())
               SOP("Cricket hobbiy");
            
            if (Volleyball.isSelected())
               SOP("Cricket hobbiy");
            
            if (Football.isSelected())
               SOP("Cricket hobbiy");
            
            //Aise sb radiobutton isSeleted() use krke print kr
            
            
        }
               
     
     }
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new EmployeManagementSystem();
            }
        });
    
}
}
