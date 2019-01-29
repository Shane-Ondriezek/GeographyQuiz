
import java.util.*;
import javax.swing.JTextArea;

public class AnswerManager {

    //includes all jtextareas so that they can be formatted afterwards
    public AnswerManager(int[] a1, JTextArea ja1, JTextArea ja2, JTextArea ja3, JTextArea ja4,
            JTextArea ja5, JTextArea ja6, JTextArea ja7, JTextArea ja8, JTextArea ja9,
            JTextArea ja10) {

        //creates strings from each jtextarea to error check
        String s1 = ja1.getText();
        String s2 = ja2.getText();
        String s3 = ja3.getText();
        String s4 = ja4.getText();
        String s5 = ja5.getText();
        String s6 = ja6.getText();
        String s7 = ja7.getText();
        String s8 = ja8.getText();
        String s9 = ja9.getText();
        String s10 = ja10.getText();
        

        LinkedList<String[]> list = ListManager.makelist();
        
        //error checks against each string from the statecapitals list
        for (int i = 0; i < a1.length; i++) {
            switch(i){
                case (0):
                    ja1.setText(checkAnswers(i, list, a1, s1));
                case(1):
                    ja2.setText(checkAnswers(i, list, a1, s2));
                case(2):
                    ja3.setText(checkAnswers(i, list, a1, s3));
                case(3):
                    ja4.setText(checkAnswers(i, list, a1, s4));
                case(4):
                    ja5.setText(checkAnswers(i, list, a1, s5));
                case(5):
                    ja6.setText(checkAnswers(i, list, a1, s6));
                case(6):
                    ja7.setText(checkAnswers(i, list, a1, s7));
                case(7):
                    ja8.setText(checkAnswers(i, list, a1, s8));
                case(8):
                    ja9.setText(checkAnswers(i, list, a1, s9));
                case(9):
                    ja10.setText(checkAnswers(i, list, a1, s10));
                    
            }
            
            
            
        }
        if(QuizManager.a == true && QuizManager.b == true && QuizManager.c == true && QuizManager.d == true &&
                 QuizManager.e == true && QuizManager.f == true && QuizManager.g == true && QuizManager.h == true &&
                 QuizManager.j == true && QuizManager.k == true){
            QuizManager instance = QuizManager.getInstance();
        }
    }
    
    private String checkAnswers(int i, LinkedList<String[]> list, int[] a1, String s1){
        String correct = "You have this one right, try all the others!";
        String incorrect = "Sorry, incorrect, try again";
        String s = Arrays.toString(list.get(a1[i]));
            s = s.replace("[", "");
            s = s.replace("]", "");
            s = s.replaceFirst(" ", "");
            String[] sa = s.split(",");
            while(sa[1].startsWith(" ")){
                sa[1] = sa[1].replaceFirst(" ", "");
            }
            
            
            
            if (i == 0) {
                if (QuizManager.a == true) {
                    return correct;
                } else {
                    QuizManager.a = s1.equals(sa[1]);
                    if (QuizManager.a == true) {
                        return correct;
                    }
                    if (QuizManager.a == false) {
                        return incorrect;
                    }
                }
            } else if (i == 1) {
                if (QuizManager.b == true) {
                    return correct;
                } else {
                    QuizManager.b = s1.equals(sa[1]);
                    if (QuizManager.b == true) {
                        return correct;
                    }
                    if (QuizManager.b == false) {
                        return incorrect;
                    }
                }
            } else if (i == 2) {
                if (QuizManager.c == true) {
                   return correct;
                } else {
                    QuizManager.c = s1.equals(sa[1]);
                    if (QuizManager.c == true) {
                        return correct;
                    }
                    if (QuizManager.c == false) {
                        return incorrect;
                    }
                }
            } else if (i == 3) {
                if (QuizManager.d == true) {
                    return correct;
                } else {
                    QuizManager.d = s1.equals(sa[1]);
                    if (QuizManager.d == true) {
                       return correct;
                    }
                    if (QuizManager.d == false) {
                        return incorrect;
                    }
                }
            } else if (i == 4) {
                if (QuizManager.e == true) {
                   return correct;
                } else {
                    QuizManager.e = s1.equals(sa[1]);
                    if (QuizManager.e == true) {
                        return correct;
                    }
                    if (QuizManager.e == false) {
                        return incorrect;
                    }
                }
            } else if (i == 5) {
                if (QuizManager.f == true) {
                    return correct;
                } else {
                    QuizManager.f = s1.equals(sa[1]);
                    if (QuizManager.f == true) {
                        return correct;
                    }
                    if (QuizManager.f == false) {
                       return incorrect;
                    }
                }
            } else if (i == 6) {
                if (QuizManager.g == true) {
                   return correct;
                } else {
                    QuizManager.g = s1.equals(sa[1]);
                    if (QuizManager.g == true) {
                        return correct;
                    }
                    if (QuizManager.g == false) {
                        return incorrect;
                    }
                }
            } else if (i == 7) {
                if (QuizManager.h == true) {
                    return correct;
                } else {
                    QuizManager.h = s1.equals(sa[1]);
                    if (QuizManager.h == true) {
                        return incorrect;
                    }
                    if (QuizManager.h == false) {
                        return incorrect;
                    }
                }
            } else if (i == 8) {
                if (QuizManager.j == true) {
                    return correct;
                } else {
                    QuizManager.j = s1.equals(sa[1]);
                    if (QuizManager.j == true) {
                        return correct;
                    }
                    if (QuizManager.j == false) {
                       return incorrect;
                    }
                }
            } else if (i == 9) {
                if (QuizManager.k == true) {
                   return correct;
                } else {
                    QuizManager.k = s1.equals(sa[1]);
                    if ( QuizManager.k == true) {
                       return correct;
                    }
                    if (QuizManager.k == false) {
                        return incorrect;
                    }
                }
            }
            return "error";
    }

    
}