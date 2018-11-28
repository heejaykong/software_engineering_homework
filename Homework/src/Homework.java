import Contacts.*;
import Appointments.*;
// import TODO.*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Homework extends JFrame {
   private Contacts contacts;
   private Appointments appoints;
   // private TODO
   
   private JButton [] menuBtn = new JButton [3];
   private Font font;
   
   public Homework() {
      setTitle("Menu");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500,500);
      Container a = getContentPane();
      GridLayout grid = new GridLayout(3,1,20,20);
      a.setLayout(grid);
      a.setBackground(Color.WHITE);
      
      font = new Font("돋움", Font.BOLD, 30);
      
      menuBtn[0] = new JButton("연락처");
      menuBtn[0].setSize(200,40);
      menuBtn[0].setFont(font);
      a.add(menuBtn[0]);
      
      menuBtn[0].addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
            contacts = new Contacts();   
         }
      });
      
      menuBtn[1] = new JButton("약속 관리");
      menuBtn[1].setSize(200,40);
      menuBtn[1].setFont(font);
      a.add(menuBtn[1]);
      
      menuBtn[1].addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
             appoints = new Appointments();  
          }
       });
      
      menuBtn[2] = new JButton("To-Do");
      menuBtn[2].setSize(200,40);
      menuBtn[2].setFont(font);
      a.add(menuBtn[2]);
      
      // 엑션리스너
      
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new Homework();
   }
}