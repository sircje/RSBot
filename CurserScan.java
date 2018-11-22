import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CurserScan {
	public static void main(String[] args) throws Exception{
		Thread.sleep(1000);
		CursorScan();
	}
	
	private static void CursorScan() throws Exception {
		Thread.sleep(1000);
		Robot robot = new Robot();
	    robot.mouseMove(0, 0);
	    int currentX = MouseInfo.getPointerInfo().getLocation().x;
	    int currentY = MouseInfo.getPointerInfo().getLocation().y;
	    while(1000> currentY) {
	    	currentY = currentY +50;
		 while(1911 > currentX) {
	     	Thread.sleep(1);
	     	robot.mouseMove(currentX, currentY);	
	     	currentX++;
	     	} currentY = currentY +50;
	     	while(10 < currentX) {
	     		Thread.sleep(0);
		     	robot.mouseMove(currentX, currentY);	
		     	currentX--;
	     	}}
		 
	
	
	}
	private static void CornerText() throws Exception {
		{
//	        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	        Rectangle rectangle = new Rectangle(1,26,136,15);
	        Robot robot = new Robot();
	        BufferedImage screen = robot.createScreenCapture(rectangle);
	        try {
	            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\testArea.png"));
	        } catch (IOException e) {

	            e.printStackTrace();
	        }}
	}}
