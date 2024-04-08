package Applet;

import java.awt.Color;
import java.awt.Graphics;

public class Shapes extends java.applet.Applet {

    public void paint(Graphics g) {
        // Rectangle
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 50);

        // Circle
        g.setColor(Color.blue);
        g.fillOval(200, 50, 100, 100);

        // Triangle
        g.setColor(Color.green);
        int[] xPoints = {350, 400, 300};
        int[] yPoints = {50, 150, 150};
        g.fillPolygon(xPoints, yPoints, 3);

    }
}
