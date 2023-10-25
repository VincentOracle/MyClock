import java.awt.Dimension;
import java.awt.Container;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.*;  
//In place of star we use Color,Dimension,Font,Graphics,event.ActionEvent,event.ActionListner.   
import java.util.*;  
//In place of star we use Calendar.   
import javax.swing.*;  
//In place of star we use Jframe.JPane1,WindowConstants.  
import java.awt.event.ActionListener;  
import javax.swing.Timer;  
import java.awt.event.ActionEvent;  

//this class implements the action listener
public class Drug extends Uzima implements ActionListener,ItemSelectable{

    @Override
    public void actionPerformed(ActionEvent e) {
        // 
        
    }

{

   // JFrame frame = new JFrame();
    JPanel dateTime= new JPanel();
    dateTime.setBounds(5,5,200,150);  
   // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
    SimpleDigitalClock clock1 = new SimpleDigitalClock();
   // frame.setBackground(Color.BLUE);
   // frame.add(dateTime); 
    dateTime.setBackground(Color.BLUE); 
   // frame.add(clock1); 
    //frame.setLocationRelativeTo(frame.add(clock1));
  //  frame.setSize(700,700);
   // frame.setLayout(null);
    //dateTime.setLayout(null);
   // dateTime.setBounds(5,5,75,75);
    dateTime.add(clock1); 
   // frame.pack();  
   // frame.setVisible(true);  
}  
//The SimpleDigital Clock class
static class SimpleDigitalClock extends JPanel {  
    String stringTime;  
    int hour, minute, second;  
    String aHour = "";  
    String bMinute = "";  
    String cSecond = "";  
    public void setStringTime(String abc) {  
        this.stringTime = abc;  
    }  
    public int Number(int a, int b) {  
        return (a <= b) ? a : b;  
    }  
    SimpleDigitalClock() {  
        Timer t = new Timer(1000, new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                repaint();  
            }  
        });  
        t.start();  
    }  
    @Override  
    public void paintComponent(Graphics v) {  
        super.paintComponent(v);  
        Calendar rite = Calendar.getInstance();  
        hour = rite.get(Calendar.HOUR_OF_DAY);  
        minute = rite.get(Calendar.MINUTE);  
        second = rite.get(Calendar.SECOND);  
        if (hour < 10) {  
            this.aHour = "0";  
        }  
        if (hour >= 10) {  
            this.aHour = "";  
        }  
        if (minute < 10) {  
            this.bMinute = "0";  
        }  
        if (minute >= 10) {  
            this.bMinute = "";  
        }  
        if (second < 10) {  
            this.cSecond = "0";  
        }  
        if (second >= 10) {  
            this.cSecond = "";  
        }  
        setStringTime(aHour + hour + ":" + bMinute + minute + ":" + cSecond + second);  
        v.setColor(Color.red);  
        int length = Number(this.getWidth(), this.getHeight());  
        Font Font1 = new Font("SansSerif", Font.PLAIN, length / 5);  
        v.setFont(Font1);  
        v.drawString(stringTime, (int) length / 6, length / 2);  
    }  
    @Override  
    public Dimension getPreferredSize() {  
        return new Dimension(70, 70);


}


}
}
