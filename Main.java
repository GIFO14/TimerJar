
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 *
 * @author mblan
 */
public class Main extends JFrame{

    short mDuracio, mDescans;
    
    boolean check = false;
    
    static JLabel labelDescans;
    
    public Main(){
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Timer");
        
        labelDescans = new JLabel("");
        labelDescans.setBounds(350, 250, 800, 300);
        labelDescans.setFont(new Font("Times New Roman",1,45));
        add(labelDescans);
        
    }
    
    //timer
     public void DuracioTreballTimer(short minutsAvis) {

        this.mDuracio = minutsAvis;
        
        for (short m = 0; m<mDuracio; m++) {
            
            for (short s = 0; s < 60; s++) {

                try {

                    TimeUnit.SECONDS.sleep(1);

                } catch (InterruptedException e) {

                    System.out.println(e);

                }

            }
            
        }

    }
     
     //DuracioTreballTimer is used to do not duplocate the code
     public void DuracioDescansTimer(short minutsDescans) {
        
        this.mDescans = minutsDescans;
        
        DuracioTreballTimer(minutsDescans);
        
    }
     
    //It has to return a Main var because in the main method the Interficie method is put in a same type var  
    public Main Interficie(){
        
        Main t = new Main();
        t.setBounds(0,0,0,0);
        t.setVisible(true);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        
        return t;
        
    }
     
     public static void Timer(Main t, short treball, short descans, String missatge){
        
        for (short i = 0; i <= 100; i++) {

            t.DuracioTreballTimer(treball);

            labelDescans.setText(missatge);
            t.setBounds(0,0,1300,700);

            t.DuracioDescansTimer(descans);

            t.setBounds(0,0,0,0);

        }
        
    }
    
    public static void main(String[] args) {

        short treball, descans;
        String missatge;
        
        Main t = new Main();

        treball = Short.parseShort(JOptionPane.showInputDialog("Cada quan vols descansar? (Mínim 1 minut)."));
        System.out.println("");

        descans = Short.parseShort(JOptionPane.showInputDialog("Quan temps vols descansar? (Mínim 1 minut)."));
        System.out.println("");
        
        missatge = JOptionPane.showInputDialog("Quin missatge vols introduir?");
        System.out.println("");

        t = t.Interficie();

        Timer(t,treball,descans,missatge);
        
    }

}
