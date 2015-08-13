// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;
JLabel a;
    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame Frame1=new JFrame();
   	 // 2. Make the frame visible
   	 Frame1.show();
   	 // 3. Set the size of the frame
   	 Frame1.setSize(1000,800);
   	 // 4. Set the title of the frame
   	 Frame1.setTitle("Sounds of the Swamp");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel meme1 = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
     Frame1.add(meme1);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
    String Doot = "doot.png";
   	 // 9. Use the "createLabelImage()" method to initialize the drumLabelWithImage variable.
   	   a = createLabelImage(Doot); 	
   	 // 10. Add the image to the panel
    meme1.add(a);
   	 // 11. Set the layout of the panel to "new GridLayout()"
    meme1.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 Frame1.pack();
   	 // 13. add a mouse listener to drumLabelWithImage.
a.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
System.out.println("mouse clicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". There are some sounds here: http://bit.ly/drum-sounds or you can also get them from freesound.org
   	 // 16. If they clicked on the drumImage...
String Skull = "SKULL_TRUMPET.wav";
   	 if(drumClicked == a)
{
	
	playSound(Skull);
}
   		 // 17. ...use the playSound method to play a drum sound.

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



