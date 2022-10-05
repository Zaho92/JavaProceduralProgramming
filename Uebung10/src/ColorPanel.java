import java.awt.*;

public class ColorPanel extends Canvas {
    public void paint(Graphics grafic){
        setBackground(Color.BLACK);
        Color c = null;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 0; j < 256; j++) {
                int r = 0;
                int g = 0;
                int b = 0;

                switch (i){
                    case 1:
                        r = j;
                        g=0;
                        b = 0;
                        break;
                    case 2:
                        r=255;
                        g =j;
                        b = 0;
                        break;
                    case 3:
                        r = 255-j;
                        g=255;
                        b = 0;
                        break;
                    case 4:
                        r=0;
                        g=255;
                        b=j;
                        break;
                    case 5:
                        r=0;
                        g=255-j;
                        b=255;
                        break;
                    case 6:
                        r=j;
                        g=0;
                        b=255;
                        break;
                    case 7:
                        r=255;
                        g=j;
                        b=255;
                        break;
                }

                int x = ((i-1)*256)+j;
                int y = 600;
                c = new Color(r,g,b);
                grafic.setColor(c);
                grafic.drawLine(x,0,x,y);
            }
        }
    }
}
