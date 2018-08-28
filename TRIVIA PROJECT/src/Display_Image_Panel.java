import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
class Display_Image_Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	
	public Display_Image_Panel(){}
	@Override
	protected void paintComponent(Graphics g)
	{
		// Displaying the image to the panel
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	/**
	 * @return the image
	 */
	public BufferedImage getImage()
	{
		return image;
	}

	/**
	 * @param image
	 * the image to set
	 */
	public void setImage(String Location)
	{
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(new File(Location));
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		this.image = image;
		this.repaint();
	}
	
}