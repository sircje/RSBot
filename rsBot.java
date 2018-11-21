import java.awt.Robot;
import java.util.Random;

import javax.imageio.ImageIO;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;


public class rsBot{
	
	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(500);
		try {
			CamReset(1760, 45);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Compass clicked, map reset^
		//Creates an image of the screen:
 try {
	screenCapture();
} catch (AWTException e) {
	e.printStackTrace();
}
 //Checks to see you are in the proper place:
// imageCompare();
 double difference = imageCompare();
 double threshold = 5.0;
 if(threshold > difference){
	 
 }
 
	}

	private static void CamReset(int XCord, int YCord) throws Exception{	
		
	    Robot robot = new Robot();
        Random random = new Random();
        int variance = random.nextInt(12);
        //Move the mouse to and click the compass, resetting the camera
        
        int currentX = MouseInfo.getPointerInfo().getLocation().x;
        int currentY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(currentX + "," + currentY);
        int compassVarianceX = XCord+variance;
        int compassVarianceY = YCord+variance;
        if(compassVarianceX > currentX || compassVarianceY < currentY) {
        while(compassVarianceX > currentX || compassVarianceY < currentY) {        	
        	Thread.sleep(random.nextInt(2)+1);
        	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
        	currentX++;
        	if(currentY > compassVarianceY){
        	    currentY--;}
        
        }
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);}
        System.out.println(currentX + "," + currentY);
        //compass clicked, map reset
		
}
	public static void screenCapture() throws AWTException {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(dimension);
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        try {
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\test.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }}
	public static double imageCompare(){ 
        BufferedImage imgA = null; 
        BufferedImage imgB = null; 
  
        try
        { 
            File fileA = new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\test.png"); 
            File fileB = new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\FaladorBankFull.png"); 
  
            imgA = ImageIO.read(fileA); 
            imgB = ImageIO.read(fileB); 
        } 
        catch (IOException e) 
        { 
            System.out.println(e); 
        } 
        int width1 = imgA.getWidth();  
        int height1 = imgA.getHeight(); 
  
        { 
            long difference = 0; 
            for (int y = 0; y < height1; y++) 
            { 
                for (int x = 0; x < width1; x++) 
                { 
                    int rgbA = imgA.getRGB(x, y); 
                    int rgbB = imgB.getRGB(x, y); 
                    int redA = (rgbA >> 16) & 0xff; 
                    int greenA = (rgbA >> 8) & 0xff; 
                    int blueA = (rgbA) & 0xff; 
                    int redB = (rgbB >> 16) & 0xff; 
                    int greenB = (rgbB >> 8) & 0xff; 
                    int blueB = (rgbB) & 0xff; 
                    difference += Math.abs(redA - redB); 
                    difference += Math.abs(greenA - greenB); 
                    difference += Math.abs(blueA - blueB); 
                } 
            }   

            double total_pixels = width1 * height1 * 3; 
  

            double avg_different_pixels = difference / 
                                          total_pixels; 
  

            double percentage = (avg_different_pixels / 
                                            255) * 100; 
  
            System.out.println("Difference Percentage-->" + 
                                                percentage);
            return(percentage);
        }
    }
	}
	

