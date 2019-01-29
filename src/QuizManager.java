
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class QuizManager {
    private static QuizManager uniqueInstance;

    public static QuizManager getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new QuizManager();
            uniqueInstance.begin();
        }
        return uniqueInstance;
    }

    public static Boolean a = false;
    public static Boolean b = false;
    public static Boolean c = false;
    public static Boolean d = false;
    public static Boolean e = false;
    public static Boolean f = false;
    public static Boolean g = false;
    public static Boolean h = false;
    public static Boolean j = false;
    public static Boolean k = false;

    private void begin() {
        
     
        

        //makes an display image for the map
        JFrame frame1 = new ImageManager();
        frame1.setTitle("Map");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        
        //creates Jframe for answers
        JFrame frame2 = new JFrame("Answers");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setLayout(new GridLayout(12, 2));
        
        frame1.setLocation(250,25);
        frame2.setLocation(0,25);

        

        //list to hold capitals, probably can be made into own class
        LinkedList<String[]> list = ListManager.makelist();
        int[] arr = new int[10];

        //creates states to ask for from list, and makes sure there are no duplicates,and adds them to array
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int j = r.nextInt((list.size() - 1) + 1);
            for (int k = 0; k < i; k++) {
                while (arr[k] == j) {
                    r = new Random();
                    j = r.nextInt((list.size() - 1) + 1);
                }
            }
            arr[i] = j;
        }

        //fixes list so that the formatting is correct for all answers 
        String s1 = Arrays.toString(list.get(arr[0]));
        s1 = s1.replace("[", "");
        s1 = s1.replace("]", "");
        String[] s1a = s1.split(",");

        String s2 = Arrays.toString(list.get(arr[1]));
        s2 = s2.replace("[", "");
        s2 = s2.replace("]", "");
        String[] s2a = s2.split(",");

        String s3 = Arrays.toString(list.get(arr[2]));
        s3 = s3.replace("[", "");
        s3 = s3.replace("]", "");
        String[] s3a = s3.split(",");

        String s4 = Arrays.toString(list.get(arr[3]));
        s4 = s4.replace("[", "");
        s4 = s4.replace("]", "");
        String[] s4a = s4.split(",");

        String s5 = Arrays.toString(list.get(arr[4]));
        s5 = s5.replace("[", "");
        s5 = s5.replace("]", "");
        String[] s5a = s5.split(",");

        String s6 = Arrays.toString(list.get(arr[5]));
        s6 = s6.replace("[", "");
        s6 = s6.replace("]", "");
        String[] s6a = s6.split(",");

        String s7 = Arrays.toString(list.get(arr[6]));
        s7 = s7.replace("[", "");
        s7 = s7.replace("]", "");
        String[] s7a = s7.split(",");

        String s8 = Arrays.toString(list.get(arr[7]));
        s8 = s8.replace("[", "");
        s8 = s8.replace("]", "");
        String[] s8a = s8.split(",");

        String s9 = Arrays.toString(list.get(arr[8]));
        s9 = s9.replace("[", "");
        s9 = s9.replace("]", "");
        String[] s9a = s9.split(",");

        String s10 = Arrays.toString(list.get(arr[9]));
        s10 = s10.replace("[", "");
        s10 = s10.replace("]", "");
        String[] s10a = s10.split(",");

        
        
        JLabel num1 = new JLabel(s1a[0]);
        JTextArea ta1 = new JTextArea("ANSWER GOES HERE");
        JLabel num2 = new JLabel(s2a[0]);
        JTextArea ta2 = new JTextArea("ANSWER GOES HERE");
        JLabel num3 = new JLabel(s3a[0]);
        JTextArea ta3 = new JTextArea("ANSWER GOES HERE");
        JLabel num4 = new JLabel(s4a[0]);
        JTextArea ta4 = new JTextArea("ANSWER GOES HERE");
        JLabel num5 = new JLabel(s5a[0]);
        JTextArea ta5 = new JTextArea("ANSWER GOES HERE");
        JLabel num6 = new JLabel(s6a[0]);
        JTextArea ta6 = new JTextArea("ANSWER GOES HERE");
        JLabel num7 = new JLabel(s7a[0]);
        JTextArea ta7 = new JTextArea("ANSWER GOES HERE");
        JLabel num8 = new JLabel(s8a[0]);
        JTextArea ta8 = new JTextArea("ANSWER GOES HERE");
        JLabel num9 = new JLabel(s9a[0]);
        JTextArea ta9 = new JTextArea("ANSWER GOES HERE");
        JLabel num10 = new JLabel(s10a[0]);
        JTextArea ta10 = new JTextArea("ANSWER GOES HERE");
        
        
        MapManager.MapManager(frame1, s1a, s2a, s3a, s4a, s5a,
            s6a, s7a, s8a, s9a, s10a);
       

        

        JButton btn1 = new JButton("Submit");
        btn1.addActionListener((java.awt.event.ActionEvent e) -> {
            //calls backend to perform answer checking
            AnswerManager backend = new AnswerManager(arr, ta1, ta2, ta3, ta4,
                    ta5, ta6, ta7, ta8, ta9, ta10);
        });
        JButton btn2 = new JButton("Shuffle");
        btn2.addActionListener((java.awt.event.ActionEvent e) -> {
            //rerandomizes the frame
            frame1.dispose();
            frame2.dispose();
            begin();
        });

        JButton btn3 = new JButton("Show Names");
        btn3.addActionListener((java.awt.event.ActionEvent e) -> {
            // draw the name above the star of the capitals using their coordinates
             
        });

        //add all nodes to frame2
        frame2.add(num1);
        frame2.add(ta1);
        frame2.add(num2);
        frame2.add(ta2);
        frame2.add(num3);
        frame2.add(ta3);
        frame2.add(num4);
        frame2.add(ta4);
        frame2.add(num5);
        frame2.add(ta5);
        frame2.add(num6);
        frame2.add(ta6);
        frame2.add(num7);
        frame2.add(ta7);
        frame2.add(num8);
        frame2.add(ta8);
        frame2.add(num9);
        frame2.add(ta9);
        frame2.add(num10);
        frame2.add(ta10);
        frame2.add(btn1);
        frame2.add(btn2);
        frame2.add(btn3);
        frame2.pack();
        
        //set size of frames
        frame1.setSize(1000, 900);
        frame2.setSize(400, 400);
    }

}
