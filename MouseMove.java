import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class MouseMove {
    public static void main(String[] args) {
	try {
		CamReset(1145,1115);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
        if(compassVarianceX >= currentX && compassVarianceY >= currentY) {
        while(compassVarianceX >= currentX && compassVarianceY >= currentY) {        	
        	Thread.sleep(random.nextInt(1)+1);
        	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
        	currentX++;
        	if(currentY <= compassVarianceY){
        	    currentY++;}}
        }
        if(compassVarianceX <= currentX && compassVarianceY <= currentY) {
        while(compassVarianceX <= currentX && compassVarianceY <= currentY) {
    		Thread.sleep(random.nextInt(1)+1);
        	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
        	currentY--;
        	if(currentX >= compassVarianceX){
        	    currentX--;}
    	}}
        if(compassVarianceX >= currentX && compassVarianceY <= currentY) {
            while(compassVarianceX >= currentX && compassVarianceY <= currentY) {        	
            	Thread.sleep(random.nextInt(1)+1);
            	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
            	currentX++;
            	if(currentY >= compassVarianceY){
            	    currentY--;}}
            }
        if(compassVarianceX <= currentX && compassVarianceY >= currentY) {
            while(compassVarianceX <= currentX && compassVarianceY >= currentY) {        	
            	Thread.sleep(random.nextInt(1)+1);
            	robot.mouseMove(currentX+random.nextInt(1), currentY+random.nextInt(1));
            	currentX--;
            	if(currentY <= compassVarianceY){
            	    currentY++;}}
            }
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        System.out.println(currentX + "," + currentY);
        //compass clicked, map reset
		
}}

