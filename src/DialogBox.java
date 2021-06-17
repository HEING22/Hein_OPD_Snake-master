
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DialogBox extends WindowAdapter{

    int score = 0;
    Window f;

    public DialogBox(Window w) {
        f = w;
        f.addWindowListener(this);
//        f.setSize(300, 300);
//        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        f.setVisible(true);
    }

    public Boolean Dialog() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String n = sc.next();
        int a = JOptionPane.showConfirmDialog(f," your score is " + score
                +"\nDo you want to continue?", "Defeat", JOptionPane.YES_NO_OPTION);
        if(a == JOptionPane.YES_OPTION){
            return false;
        }else{
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            return true;
        }
    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure?","Exit",JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if (a == JOptionPane.NO_OPTION) {
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    public void setScore(int score) {
        this.score += score;
    }

}