package mew_images;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProxyImage implements MyImage {
    private JFrame frame;

    public ProxyImage(String filename) {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public ProxyImage() {
    }

    public void display() {
        frame.setVisible(true);
    }
}