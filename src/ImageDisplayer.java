
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class ImageDisplayer extends JPanel {

    private ImageIcon imageIcon = new ImageIcon("/Volumes/OSXData/Google Drive/"
            + "OO Design/Assignments/Final Project Nov 29/Final_Project_OOD/src/USAMAP.jpg");
    private Image image = imageIcon.getImage();

    @Override
    /**
     * Draw image on the panel
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
