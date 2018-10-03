package temporitzador;

import java.awt.Font;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 *
 * @author mblan
 */
public class Temporitzador extends JFrame{

    short mDuracio, mDescans;
    
    boolean check = false;
    
    JLabel labelDescans;
   
    
    public Temporitzador(){
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temporitzador");
        
        labelDescans = new JLabel("DESCANSA LA VISTA!!");
        labelDescans.setBounds(300, 400, 200, 100);
        labelDescans.setFont(new Font("Times New Roman",1,30));
        add(labelDescans);
        
    }
    
    

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
    
    public void DuracioDescansTimer(short minutsDescans) {
        
        this.mDescans = minutsDescans;
        
        DuracioTreballTimer(minutsDescans);
        
    }
    
    public Temporitzador Interficie(){
        
        Temporitzador t = new Temporitzador();
        t.setBounds(0,0,1300,700);
        t.setVisible(false);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        
        return t;
        
    }

}
