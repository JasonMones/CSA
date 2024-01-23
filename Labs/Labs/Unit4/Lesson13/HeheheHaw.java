
package Unit4.Lesson13;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Cursor;


/**
 * Write a description of class HeheheHaw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HeheheHaw
{
    public static void main(String[] args) {
        
        NewWindowThread nwt = new NewWindowThread();
        
        nwt.start();
    }
}

class NewWindowThread extends Thread {
    ArrayList<JFrame> frames;
    ArrayList<Thread> localThreads;
    int counter;
    
    public NewWindowThread() {
        frames = new ArrayList<JFrame>();
        localThreads = new ArrayList<Thread>();
        counter = 0;
    }
    public void run() {
        while(true) {
            JFrame currentFrame = new JFrame("Skill Issue " + (++counter));
            NewWindowThread currentThread = new NewWindowThread();
            currentFrame.setCursor(Cursor.CROSSHAIR_CURSOR);
            currentFrame.setSize((int) (Math.random() * 1000), (int) (Math.random() * 1000));
            currentFrame.setVisible(true);
            currentThread.start();
            frames.add(currentFrame);
            localThreads.add(currentThread);
        }
    }
}