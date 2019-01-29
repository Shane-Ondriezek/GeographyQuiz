
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DrawingManager{
public static void drawWord(Graphics g, String str, int x, int y) {
        g.setColor(Color.RED);
        g.setFont(new Font("default", Font.BOLD, 16));
        g.drawString(str, x, y);
    }
}