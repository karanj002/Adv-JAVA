package Applet;

import java.awt.*;

public class BasicApplet extends java.applet.Applet{
    Font f = new Font("TimesRoman",Font.BOLD,36);
    String name;
    public void init() {
        this.name = getParameter("name");
        if (this.name == null)
            this.name = " Karan Jadhav ";
    }

    public void paint(Graphics g) {
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString(this.name, 5, 50);
    }

}