package repetitorium.ausdruecke;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class PhotoHopp {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image srcImage = toolkit.getImage("river.gif");

        ImageFilter colorfilter = new TestFilter();
        Image filteredImage = toolkit.createImage(
                new FilteredImageSource(srcImage.getSource(),colorfilter));
        JFrame srcFrame = new DisplayFrame(srcImage,0,0,500,200);
        JFrame filteredFrame = new DisplayFrame(filteredImage,0, 200, 500, 200);

        filteredFrame.setBackground(Color.WHITE);


        Image srcImage2 = toolkit.getImage("farbenkreis_b.gif");

        Image filteredImage2 = toolkit.createImage(
                new FilteredImageSource(srcImage2.getSource(),colorfilter));
        JFrame srcFrame2 = new DisplayFrame(srcImage2, 500, 0, 200, 200);
        JFrame filteredFrame2 = new DisplayFrame(filteredImage2, 500, 200, 200, 200);

        filteredFrame2.setBackground(Color.WHITE);
    }
}

class DisplayFrame extends JFrame  {
    private Image image;
    int x,y,b,h;

    public DisplayFrame(Image image, int x, int y, int b, int h)  {
        this.image = image;
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(x,y,b,h);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0,b, h, this);
    }
}

enum Action {
    RED, GREEN, BLUE, PAINT, SWITCH_RED_BLUE, LIGHT, DARK, LIGHT_UP, GREY, INVERT
}


class TestFilter extends RGBImageFilter {
    int count = 0;
    public int filterRGB(int x, int y, int pixel) {
        int filteredPixel;
        count ++;

















        int alpha = (pixel & 0xFF000000) >>> 24;
        int red = (pixel & 0x00FF0000) >>> 16;
        int green = (pixel & 0x0000FF00) >>> 8;
        int blue = (pixel & 0x000000FF);

        float brightness = (red + blue + green) / 3f;

        Action action = Action.LIGHT_UP;

        switch (action) {
            case RED:
                filteredPixel = (alpha << 24) | (red << 16) | (blue);
                break;
            case GREEN:
                filteredPixel = (alpha << 24) | (green << 8);
                break;
            case BLUE:
                filteredPixel = (alpha << 24) | (blue);
                break;
            case PAINT:
                filteredPixel = 0xFF123456;
                break;
            case SWITCH_RED_BLUE:
                filteredPixel = (alpha << 24) | (blue << 16) | (green << 8) | red;
                break;
            case LIGHT:
                filteredPixel = brightness > 128 ? pixel : 0x0;
                break;
            case DARK:
                filteredPixel = brightness < 128 ? pixel : 0x0;
                break;
            case LIGHT_UP:
                float lightUpFactor = 1.8f;

                red *= lightUpFactor;
                blue *= lightUpFactor;
                green *= lightUpFactor;

                if (red > 0xFF) red = 0xFF;
                if (blue > 0xFF) blue = 0xFF;
                if (green > 0xFF) green = 0xFF;

                filteredPixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
                break;
            case GREY:
                int average = (int) brightness;
                filteredPixel = (alpha << 24) | (average << 16) | (average << 8) | average;
                break;
            case INVERT:
                filteredPixel = (0xFF << 24) | ~pixel;
                break;
            default:
                filteredPixel = pixel;
        }



        return filteredPixel;
    }
}