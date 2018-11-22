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
	
	public static void main(String[] args) throws Exception{
		Random random = new Random();
		Thread.sleep(1500);
		try {
			MMove(1750, 38);
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
 double difference = imageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\test.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\EastFaladorBank.png");
 double threshold = 10.0;
 if(threshold > difference){
      MMove(912, 710);	
     
    LeftClick();
    //Opens the bank
    Thread.sleep(150+random.nextInt(150));
	MMove(678,258);
	Thread.sleep(50+random.nextInt(50));
	RightClick();
	Thread.sleep(50+random.nextInt(50));
	//Selects essence
	MMove(641, 344);
	LeftClick();
	//Withdraws max essence
	Thread.sleep(150+random.nextInt(150));
	// Walking to the Altar vvv
  	MMove(1820, 170);
  	LeftClick();
  	Thread.sleep(17500+random.nextInt(5500));
  	MMove(1838, 179);
  	LeftClick();
  	Thread.sleep(15500+random.nextInt(5500));
  	MMove(1838, 179);
  	LeftClick();
  	Thread.sleep(15500+random.nextInt(5500));
  	MMove(1789, 150);
  	LeftClick();
  	Thread.sleep(15500+random.nextInt(5500));
  	MMove(1770, 115);
  	LeftClick();
  	Thread.sleep(15500+random.nextInt(5500));
  	MMove(1855, 107);
  	LeftClick();
  //	Walking to the Altar^^^   
  	Thread.sleep(7500+random.nextInt(5500));
  	MMove(1752, 759);
  	LeftClick();
  	Thread.sleep(1500+random.nextInt(5500));
  	MMove(1522, 386);
  	LeftClick();
  	Thread.sleep(1500+random.nextInt(5500));
  	MMove(1644, 55);
  	LeftClick();
  	//Runes crafted
  	Thread.sleep(4500+random.nextInt(5500));
  	MMove(682, 1001);
  	LeftClick();
  	Thread.sleep(2500+random.nextInt(5500));
  	MMove(615, 1008);
  	LeftClick();
  	Thread.sleep(3500+random.nextInt(5500));
  	MMove(918, 1018);
  	LeftClick();
  	//Altar exited
  	Thread.sleep(5500+random.nextInt(5500));
  	MMove(1908, 106);
  	LeftClick();
  	Thread.sleep(13500+random.nextInt(5500));
  	MMove(1845, 39);
  	LeftClick();
  	Thread.sleep(13500+random.nextInt(5500));
  	MMove(1854, 42);
  	LeftClick();
  	Thread.sleep(13500+random.nextInt(5500));
  	MMove(1839, 38);
  	LeftClick();
  	Thread.sleep(17500+random.nextInt(5500));
  	MMove(1854, 37);
  	LeftClick();
  	Thread.sleep(13500+random.nextInt(5500));
  	MMove(901, 955);
  	LeftClick();
  	Thread.sleep(1500+random.nextInt(5500));
  	MMove(901, 955);
  	LeftClick();
  	Thread.sleep(2500+random.nextInt(5500));
  	MMove(1802, 764);
  	RightClick();
  	Thread.sleep(500+random.nextInt(5500));
  	MMove(1781, 857);
  	LeftClick();
  	//end of air rune run
  	
  	
 }
	 
 }

	
private static void RightClick() throws InterruptedException, AWTException {
	Robot robot = new Robot();
    Random random = new Random();
    robot.mousePress(InputEvent.BUTTON3_MASK);
    Thread.sleep(17 + random.nextInt(100));
    robot.mouseRelease(InputEvent.BUTTON3_MASK);
}
private static void LeftClick() throws InterruptedException, AWTException {
	Robot robot = new Robot();
    Random random = new Random();
    robot.mousePress(InputEvent.BUTTON1_MASK);
    Thread.sleep(17 + random.nextInt(100));
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
}
private static void MMove(int XCord, int YCord) throws Exception{	
		
	    Robot robot = new Robot();
        Random random = new Random();
        int variance = random.nextInt(1);
        //Move the mouse to and click the compass, resetting the camera
        
        int currentX = MouseInfo.getPointerInfo().getLocation().x;
        int currentY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(currentX + "," + currentY);
        int compassVarianceX = XCord+variance;
        int compassVarianceY = YCord+variance;
        if(compassVarianceX >= currentX && compassVarianceY >= currentY) {
        while(compassVarianceX >= currentX || compassVarianceY >= currentY) {        	
        	Thread.sleep(random.nextInt(1)+1);
        	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
        	if(currentX <= compassVarianceX){
        	    currentX++;}
        	if(currentY <= compassVarianceY){
        	    currentY++;}}
        }
        if(compassVarianceX <= currentX && compassVarianceY <= currentY) {
        while(compassVarianceX <= currentX || compassVarianceY <= currentY) {
    		Thread.sleep(random.nextInt(1)+1);
        	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
        	if(currentY >= compassVarianceY){
        	    currentY--;}
        	if(currentX >= compassVarianceX){
        	    currentX--;}
    	}}
        if(compassVarianceX >= currentX && compassVarianceY <= currentY) {
            while(compassVarianceX >= currentX || compassVarianceY <= currentY) {        	
            	Thread.sleep(random.nextInt(1)+1);
            	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
            	if(currentX <= compassVarianceX){
            	    currentX++;}
            	if(currentY >= compassVarianceY){
            	    currentY--;}}
            }
        if(compassVarianceX <= currentX && compassVarianceY >= currentY) {
            while(compassVarianceX <= currentX || compassVarianceY >= currentY) {        	
            	Thread.sleep(random.nextInt(1)+1);
            	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
            	if(currentX >= compassVarianceX){
            	    currentX--;}
            	if(currentY <= compassVarianceY){
            	    currentY++;}}
            }

        System.out.println(currentX + "," + currentY);
		
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
	public static double imageCompare(String file1, String file2){ 
        BufferedImage imgA = null; 
        BufferedImage imgB = null; 
  
        try
        { 
            File fileA = new File(file1); 
            File fileB = new File(file2); 
  
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
	

