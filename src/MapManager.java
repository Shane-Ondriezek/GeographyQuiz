
import java.awt.Graphics;
import java.util.HashMap;
import javax.swing.JFrame;

public class MapManager {

    
    static void MapManager(JFrame frame1, String[] s1a, String[] s2a, String[] s3a, String[] s4a, String[] s5a,
            String[] s6a, String[] s7a, String[] s8a, String[] s9a, String[] s10a){
        
        HashMap<String, String> coordsMap = new HashMap<>();
        
        ListManager.loadCoordsMap(coordsMap);
        
        Graphics g = frame1.getGraphics();
        
         // get coordinates from coordinate hashmap corresponding to state
        String[] s1coords = coordsMap.get(s1a[0]).split(",");
        String[] s2coords = coordsMap.get(s2a[0]).split(",");
        String[] s3coords = coordsMap.get(s3a[0]).split(",");
        String[] s4coords = coordsMap.get(s4a[0]).split(",");
        String[] s5coords = coordsMap.get(s5a[0]).split(",");
        String[] s6coords = coordsMap.get(s6a[0]).split(",");
        String[] s7coords = coordsMap.get(s7a[0]).split(",");
        String[] s8coords = coordsMap.get(s8a[0]).split(",");
        String[] s9coords = coordsMap.get(s9a[0]).split(",");
        String[] s10coords = coordsMap.get(s10a[0]).split(",");
        
        // draw the name above the star of the capitals using their coordinates
        DrawingManager.drawWord(g, s1a[0], Integer.parseInt(s1coords[0]) - 35, Integer.parseInt(s1coords[1]) - 5);
        DrawingManager.drawWord(g, s2a[0], Integer.parseInt(s2coords[0]) - 35, Integer.parseInt(s2coords[1]) - 5);
        DrawingManager.drawWord(g, s3a[0], Integer.parseInt(s3coords[0]) - 35, Integer.parseInt(s3coords[1]) - 5);
        DrawingManager.drawWord(g, s4a[0], Integer.parseInt(s4coords[0]) - 35, Integer.parseInt(s4coords[1]) - 5);
        DrawingManager.drawWord(g, s5a[0], Integer.parseInt(s5coords[0]) - 35, Integer.parseInt(s5coords[1]) - 5);
        DrawingManager.drawWord(g, s6a[0], Integer.parseInt(s6coords[0]) - 35, Integer.parseInt(s6coords[1]) - 5);
        DrawingManager.drawWord(g, s7a[0], Integer.parseInt(s7coords[0]) - 35, Integer.parseInt(s7coords[1]) - 5);
        DrawingManager.drawWord(g, s8a[0], Integer.parseInt(s8coords[0]) - 35, Integer.parseInt(s8coords[1]) - 5);
        DrawingManager.drawWord(g, s9a[0], Integer.parseInt(s9coords[0]) - 35, Integer.parseInt(s9coords[1]) - 5);
        DrawingManager.drawWord(g, s10a[0], Integer.parseInt(s10coords[0]) - 35, Integer.parseInt(s10coords[1]) - 5);
    }
}
