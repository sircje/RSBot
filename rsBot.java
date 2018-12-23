import java.awt.Robot;
import java.util.Random;

import javax.imageio.ImageIO;

import com.sun.glass.events.KeyEvent;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;


public class rsBot{
	
	public static void main(String[] args) throws Exception {
		Thread.sleep(3000);
		RuneEssenceMiner();
	}
	

private static void PixelScan(int startX, int startY, int endX, int endY) throws Exception {
	
	int red = 89;
	int green = 46;
	int blue = 5;
	Color find = new Color(red,green,blue);
	Color find1 = new Color(red+1,green+1,blue+1);
	Color find2 = new Color(red+2,green+2,blue+2);
	Color find3 = new Color(red+3,green+3,blue+3);
	Color find4 = new Color(red-1,green-1,blue-1);
	Color find5 = new Color(red-2,green-2,blue-2);
	Color find6 = new Color(red-3,green-3,blue-3);
//	Color pixel = PixelGrab();
	MMove(startX,startY);
	while(true) {
		if(find.equals(PixelGrab()) || find2.equals(PixelGrab()) || find3.equals(PixelGrab()) || find4.equals(PixelGrab()) || find5.equals(PixelGrab())|| find6.equals(PixelGrab())) {break;}
		Robot robot = new Robot();
        int currentX = MouseInfo.getPointerInfo().getLocation().x;
	    int currentY = MouseInfo.getPointerInfo().getLocation().y;	    
	    while(currentX < endX) {
	    	//Thread.sleep(1);
	    	currentX = currentX+10;
	    	robot.mouseMove(currentX, currentY);
	    	if(find.equals(PixelGrab())) {break;}
	    } if(find.equals(PixelGrab())) {break;}
	    if(currentY < endY) {
	    	//Thread.sleep(1);
	    	currentX = 0;
	    	currentY = currentY+30;
	    	robot.mouseMove(currentX, currentY);
	    	if(find.equals(PixelGrab())) {break;}
	    	if(currentY >= 1000) {break;}
	    }
	}
}
private static Color PixelGrab() throws Exception {
	{
        Robot robot = new Robot();
        int currentX = MouseInfo.getPointerInfo().getLocation().x;
	    int currentY = MouseInfo.getPointerInfo().getLocation().y;
	    Color c = robot.getPixelColor(currentX, currentY); 
	    System.out.println(c);
	    return c;
	}
}
private static void RuneEssenceMiner()throws Exception{
	Random random = new Random();
	Robot robot = new Robot();
	Thread.sleep(3000);

	
	int count = 5;
	while(count != 0) {
	RunEnergyCheck();
	boolean isRunning = RunEnergyCheck();
	int pace = 1;
	if(isRunning == true) {
		pace++;
	}
    MapReset();
    robot.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(900+random.nextInt(50));
	robot.keyRelease(KeyEvent.VK_RIGHT);
	MMove(394+random.nextInt(3), 499+random.nextInt(3));
	Thread.sleep(100+random.nextInt(50));
	LeftClick();
	Thread.sleep(900+random.nextInt(50));
	MapReset();
	Thread.sleep((10000/pace)+random.nextInt(50));
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1200+random.nextInt(150));
	robot.keyRelease(KeyEvent.VK_DOWN);
	MMove(900,500);
	//BlackBackground();
	CursorScanAubury();
	
	
	int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
	Thread.sleep(100+random.nextInt(50));
	MMove(currentX+random.nextInt(5), currentY+60);
	Thread.sleep(100+random.nextInt(50));
	LeftClick();	
	Thread.sleep(1200+random.nextInt(150));
	GameText();
	double difference  = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\GameText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ICantReach.png");
	if(difference <1) {
		CursorScanDoor(700, 1110, 700, "C:\\Users\\Connor\\Desktop\\ImageFinder\\Open.png", 700, 300, 8, 3, 50);
		CursorScanAubury();
	}
    MapReset();
	MMove(1897+random.nextInt(5), 111+random.nextInt(5));
	LeftClick();
	//BlackBackground();				
	CursorScan(10, 1910,1000, "C:\\Users\\Connor\\Desktop\\ImageFinder\\MineRuneEssence.png", 0, 0, 11, 10, 70);
	Thread.sleep((8000/pace)+random.nextInt(3500));
	//BlackBackground();	
	CursorScanEssencePortal();
	Thread.sleep((8000/pace)+random.nextInt(3500));
	MapReset();
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1200+random.nextInt(150));
	robot.keyRelease(KeyEvent.VK_DOWN);
	CursorScanDoor(800, 1110, 700, "C:\\Users\\Connor\\Desktop\\ImageFinder\\Open.png", 700, 450, 8, 3, 50);
	MapReset();
	MMove(973+random.nextInt(20), 255+random.nextInt(20));
	Thread.sleep(100+random.nextInt(100));
	LeftClick();
	Thread.sleep((8100/pace)+random.nextInt(1100));
	//BlackBackground();
	CursorScanBank(600, 1410,900, "C:\\Users\\Connor\\Desktop\\ImageFinder\\BankBankBooth.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\BankBankBooth2.png", 600, 200, 11, 12, 15);
	Thread.sleep((22100/pace)+random.nextInt(3100));
	MMove(1038+random.nextInt(5), 823+random.nextInt(5));
	Thread.sleep(100+random.nextInt(100));
	LeftClick();

	count--;
	} 
}
private static boolean RunEnergyCheck() throws Exception {
	Random random = new Random();
		{
	        Rectangle rectangle = new Rectangle(1721,149,50,17); 
	        Robot robot = new Robot();
	        BufferedImage screen = robot.createScreenCapture(rectangle);
	        while(true){try {
	            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\CurrentEnergy.png"));
	            break;
	        } catch (IOException e) {

	            e.printStackTrace();
	        }}}
	double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CurrentEnergy.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\FullRunEnergy.png");
	if(difference < 0.1) {
		MMove(1756+random.nextInt(4), 152+random.nextInt(4));
		Thread.sleep(25+random.nextInt(25));
		LeftClick();
		return(true);
	} else {return(false);}
	}
private static void NPCName() throws Exception {
		{
	        Rectangle rectangle = new Rectangle(52,25,55,15);  //52
	        Robot robot = new Robot();
	        BufferedImage screen = robot.createScreenCapture(rectangle);
	        while(true){try {
	            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png"));
	            break;
	        } catch (IOException e) {

	            e.printStackTrace();
	        }}}
	}
private static void ClickCheck() throws Exception {
	int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
	{	Thread.sleep(200);
        Rectangle rectangle = new Rectangle(currentX,currentY,3,3);  //52
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        while(true){try {
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\ClickCheck.png"));
            break;
        } catch (IOException e) {

            e.printStackTrace();
        }}}
}
private static void LeftCheck(String file, String file2) throws Exception{
	LeftClick();
	ClickCheck();
	Random random = new Random();
	double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\ClickCheck.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\RedClick.png");
	while(true) {
	if(difference < 2) {
		System.out.println("red click");
		break;} 
	else {
		try {
		CornerText();}
		catch (IOException e) {

            e.printStackTrace();
        }
		double difference2 = ImageCompare(file,"C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png");
		//Thread.sleep(1);
		double difference3 = ImageCompare(file2,"C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png");
		if(difference2<11 || difference3 <11) {
		int clickX= MouseInfo.getPointerInfo().getLocation().x;
	    int clickY = MouseInfo.getPointerInfo().getLocation().y;
		MMove(clickX+random.nextInt(20)-random.nextInt(20),clickY+random.nextInt(20)-random.nextInt(20));
		System.out.println("unkown click");
		LeftClick();
		ClickCheck();
		//Thread.sleep(1);
		difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\ClickCheck.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\RedClick.png");}}}
	
}
private static void LeftCheckPortal() throws Exception{
	CornerText();
	int accuracy = 11;
	double difference1 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
    double difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
    if (difference1 > accuracy && difference2 > accuracy) {
    	CursorScanEssencePortalArea();
    	CornerText();
    	difference1 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
        if (difference1 > accuracy && difference2 > accuracy) {
        	CursorScanEssencePortal();
        }
    }
}
private static void GameText() throws Exception {
		{
	        Rectangle rectangle = new Rectangle(9,978,75,15); 
	        Robot robot = new Robot();
	        BufferedImage screen = robot.createScreenCapture(rectangle);
	        while(true){try {
	            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\GameText.png"));
	            break;
	        } catch (IOException e) {

	            e.printStackTrace();
	        }}}
	}
private static void MiningLevelUp() throws Exception {
	Random random =  new Random();
	
	{
        Rectangle rectangle = new Rectangle(15, 893,470,100); 
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        while(true){try {
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\MiningLevelUpCheck.png"));
            break;
        } catch (IOException e) {

            e.printStackTrace();
        }}}
	double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\MiningLevelUpCheck.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\MiningLevelUp.png");
	if(difference < 2) {
		int currentX = MouseInfo.getPointerInfo().getLocation().x;
	    int currentY = MouseInfo.getPointerInfo().getLocation().y;
	    System.out.println("You leveled up");
		MMove(297, 984);
		LeftClick();
		MMove(currentX, currentY);
	}// else { System.out.println("You did not level up");}
}
private static void RandomRadar() throws Exception {
	    int startingX = MouseInfo.getPointerInfo().getLocation().x;
	    int startingY = MouseInfo.getPointerInfo().getLocation().y;
	    TalkToFinder();	     
		CursorScanRandom(880, 1030, 575, "C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkToFinder.png", 910, 450, 17, 3, 15);
		MMove(startingX, startingY);
		
	}
private static void EssenceRandomRadar() throws Exception {
    int startingX = MouseInfo.getPointerInfo().getLocation().x;
    int startingY = MouseInfo.getPointerInfo().getLocation().y;
    TalkToFinder();	
	EssenceCursorScanRandom(880, 1030, 575, "C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkToFinder.png", 910, 450, 17, 3, 15);
	MMove(startingX, startingY);
    }
private static void TalkToFinder()throws Exception {
	{
        Rectangle rectangle = new Rectangle(1,25,55,15); 
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        try {
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkToFinder.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }}
} 
private static void FullEssenceCheck(int count) throws Exception {
		while(true) {
        	EssenceRandomRadar();
			InventoryScan();
			boolean FullEssenceCheck = false;
			Random random = new Random();
			double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CurrentInventory.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\FullEssence.png");
			if(difference <0.11){
				System.out.println("Your inventory is full of Rune Essence.");
				FullEssenceCheck =  true;
			} else {FullEssenceCheck = false;}
        	Thread.sleep(1000+random.nextInt(500));       	
        	System.out.println("Checked, not full");
        	MiningLevelUp();
        	boolean FullCheck = FullEssenceCheck;
        	if(FullCheck == true) {
        		break;
        	}if(count == 0) {
        		break;
        	} count--;
        }
	}
private static void InventoryScan() throws Exception {
	{
        Rectangle rectangle = new Rectangle(1719,734,200,250);
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        try {
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\CurrentInventory.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }}
}
private static void BlackBackground() throws Exception {
		Random random = new Random();
		CornerText();		
		double WalkHere = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\WalkHere.png");		
		while (15<WalkHere) {
			Thread.sleep(10);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(100+random.nextInt(100));
			robot.keyRelease(KeyEvent.VK_RIGHT);
			CornerText();
			WalkHere = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\WalkHere.png");
		}
		
	}
private static void CursorScanEssencePortal() throws Exception {
		int accuracy = 11;
		int speedX = 5;
		int speedY = 30;
		double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
	    double difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
	    int count = 3;
	    while (true) {
		int startingX = 300;
		int startingY = 200;
		Robot robot = new Robot();
		Random random = new Random();
	    MMove(startingX, startingY);
	    int currentX = MouseInfo.getPointerInfo().getLocation().x;
	    int currentY = MouseInfo.getPointerInfo().getLocation().y;
	    CornerText();
	    
	    while(900> currentY) {
	    	currentY = currentY +speedY;
		 while(1611 > currentX) {
	     	while(true){try {
				CornerText();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 1");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
	        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
	        if (difference < accuracy || difference2 < accuracy) {
	        	FullEssenceCheck(1000);
	        	LeftCheckPortal();
	        	LeftClick();
	        	count++;
	        	break;
	        }
	  //      Thread.sleep(5);
	     	robot.mouseMove(currentX, currentY);
	     //	Thread.sleep(5);
	     	currentX = currentX+speedX;    
		 
		 }if (difference < accuracy || difference2 < accuracy) {
	        	break;
	        }
	        currentY = currentY +speedY;
	     	while(300 < currentX) {

		     	while(true){try {
					CornerText();
					break;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("number 2");
				}}
		        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
		        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
		        if (difference < accuracy || difference2 < accuracy) {
		        	FullEssenceCheck(1000);
		        	LeftCheckPortal();
		        	LeftClick();
		        	count++;
		        	break;
		        }
		     //   Thread.sleep(5);
		        robot.mouseMove(currentX, currentY);
		      //  Thread.sleep(5);
		     	currentX = currentX-speedX;  
	     	}if (difference < accuracy || difference2 < accuracy) {
	        	break;
	        }}
	    if(difference < accuracy || difference2 < accuracy || count == 1) {
	    	
	    	break;}
	    robot.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(300+random.nextInt(300));
		robot.keyRelease(KeyEvent.VK_RIGHT);
		BlackBackground();
		count--;
		EssenceRandomRadar();
		MiningLevelUp();
		}if(count == 1) {
    		LogOut();
    	}
	    Thread.sleep(200);
		 


	}
private static void CursorScanEssencePortalArea() throws Exception {
	int accuracy = 11;
	int speedX = 3;
	int speedY = 15;
	double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
    double difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
    int count = 1;
    while (true) {
	int startingX = MouseInfo.getPointerInfo().getLocation().x - 50;
	int startingY = MouseInfo.getPointerInfo().getLocation().y - 50;
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    CornerText();
    
    while(startingY+100> currentY) {
    	currentY = currentY +speedY;
	 while(startingX+100 > currentX) {
     	while(true){try {
			CornerText();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
        if (difference < accuracy || difference2 < accuracy) {
        	FullEssenceCheck(1000);
        	LeftCheckPortal();
        	LeftClick();
        	count++;
        	break;
        }
  //      Thread.sleep(5);
     	robot.mouseMove(currentX, currentY);
     //	Thread.sleep(5);
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy || difference2 < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(startingX - 75 < currentX) {

	     	while(true){try {
				CornerText();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\UsePortal.png");
	        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\ExitPortal.png");
	        if (difference < accuracy || difference2 < accuracy) {
	        	FullEssenceCheck(1000);
	        	LeftCheckPortal();
	        	LeftClick();
	        	count++;
	        	break;
	        }
	     //   Thread.sleep(5);
	        robot.mouseMove(currentX, currentY);
	      //  Thread.sleep(5);
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy || difference2 < accuracy) {
        	break;
        }}
    if(difference < accuracy || difference2 < accuracy || count == 1) {
    	
    	break;}
    robot.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(300+random.nextInt(300));
	robot.keyRelease(KeyEvent.VK_RIGHT);
	BlackBackground();
	count--;
	EssenceRandomRadar();
	MiningLevelUp();
	}if(count >= 1) {
		
	}
    Thread.sleep(200);
	 


}
private static void MapReset() throws Exception {
	Robot robot = new Robot();
	Random random = new Random();
	Thread.sleep(1500+random.nextInt(500));
		MMove(1757, 48);
		LeftClick();
		Thread.sleep(100+random.nextInt(50));
		robot.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000+random.nextInt(1000));
		robot.keyRelease(KeyEvent.VK_UP);
	
	//Compass clicked, map reset^
	
}
private static void CursorScanDoor(int LeftBorder, int RightBorder, int BottomBorder, String file,int startingX, int startingY, int accuracy, int speedX, int speedY) throws Exception {
	DoorText();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\DoorText.png",file);
//	int startingX = 0;
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    DoorText();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
			DoorText();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\DoorText.png",file);
        if (difference < accuracy) {
        	LeftCheck(file, file);
        	System.out.println("click");
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
				DoorText();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\DoorText.png",file);
	        if (difference < accuracy) {
	        	LeftCheck(file, file);
	        	System.out.println("click");
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy) {
        	break;
        }}
	
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void CursorScanAubury() throws Exception {
	int LeftBorder = 450;
	int RightBorder = 1310;
	int BottomBorder = 650;
	int startingX = 650;
	int startingY = 350;
	int accuracy = 8;
	int speedX = 2;
	int speedY = 50;
	NPCName();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury.png");
    double difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury2.png");
    double difference3 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury3.png");
    double difference4 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury4.png");
    int count = 3;
	while (true) {
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    NPCName();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
     		NPCName();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
     	difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury.png");
     	difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury2.png");
     	difference3 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury3.png");
     	difference4 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury4.png");
        if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
        	RightClick();
        	count++;
        	System.out.println("click");
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
	     		NPCName();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	     	difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury.png");
	     	difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury2.png");
	     	difference3 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury3.png");
	     	difference4 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\NPCName.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\Aubury4.png");
	        if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
	        	RightClick();
	        	count++;
	        	System.out.println("click");
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
        	break;
        }}
    if(difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy || count == 1) {
    
    	break;}
    robot.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(300+random.nextInt(300));
	robot.keyRelease(KeyEvent.VK_RIGHT);
	//BlackBackground();
	count--;
	}
	if(count == 1) {
		LogOut();
	}
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void CursorScanRightClick(int LeftBorder, int RightBorder, int BottomBorder, String file,int startingX, int startingY, int accuracy, int speedX, int speedY) throws Exception {
	CornerText();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
    int count = 3;
	while (true) {
//	int startingX = 0;
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    CornerText();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
			CornerText();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
        if (difference < accuracy) {
        	count++;
        	RightClick();
        	System.out.println("click");
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
				CornerText();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
	        if (difference < accuracy) {
	        	count++;
	        	RightClick();
	        	System.out.println("click");
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy) {
        	break;
        }}
    if(difference < accuracy || count == 1) {
    
    	break;}
    robot.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(300+random.nextInt(300));
	robot.keyRelease(KeyEvent.VK_RIGHT);
	count--;
	}
	if(count == 1) {
		LogOut();
	}
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void CursorScanRandom(int LeftBorder, int RightBorder, int BottomBorder, String file,int startingX, int startingY, int accuracy, int speedX, int speedY) throws Exception {
	TalkToFinder();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkTo.png",file);
    int count = 1;
	while (true) {
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    TalkToFinder();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
     		TalkToFinder();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkTo.png",file);
        if (difference < accuracy) {
        	count++;
        	RightClick();
    		int npcX = MouseInfo.getPointerInfo().getLocation().x;
    	    int npcY = MouseInfo.getPointerInfo().getLocation().y;
    		MMove(npcX, npcY+40);
    		Thread.sleep(100);
    		LeftClick();
        	System.out.println("click");
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
	     		TalkToFinder();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkTo.png",file);
	        if (difference < accuracy) {
	        	count++;
	        	RightClick();
	    		int npcX = MouseInfo.getPointerInfo().getLocation().x;
	    	    int npcY = MouseInfo.getPointerInfo().getLocation().y;
	    		MMove(npcX, npcY+40);
	    		Thread.sleep(100);
	    		LeftClick();
	        	System.out.println("click");
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy) {
        	break;
        }}
    if(difference < accuracy || count == 1) {
    
    	break;}
	count--;
	}
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void EssenceCursorScanRandom(int LeftBorder, int RightBorder, int BottomBorder, String file,int startingX, int startingY, int accuracy, int speedX, int speedY) throws Exception {
	TalkToFinder();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkTo.png",file);
    int count = 1;
	while (true) {
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    TalkToFinder();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
     		TalkToFinder();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkTo.png",file);
        if (difference < accuracy) {
        	count++;
        	RightClick();
    		int npcX = MouseInfo.getPointerInfo().getLocation().x;
    	    int npcY = MouseInfo.getPointerInfo().getLocation().y;
    		MMove(npcX, npcY+40);
    		Thread.sleep(100);
    		LeftClick();
        	System.out.println("random found");
        	CursorScan(300, 1910,800, "C:\\Users\\Connor\\Desktop\\ImageFinder\\MineRuneEssence.png", 300, 200, 9, 10, 70);
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
	     		TalkToFinder();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\TalkTo.png",file);
	        if (difference < accuracy) {
	        	count++;
	        	RightClick();
	    		int npcX = MouseInfo.getPointerInfo().getLocation().x;
	    	    int npcY = MouseInfo.getPointerInfo().getLocation().y;
	    		MMove(npcX, npcY+40);
	    		Thread.sleep(100);
	    		LeftClick();
	        	System.out.println("random found");
	        	CursorScan(300, 1910,800, "C:\\Users\\Connor\\Desktop\\ImageFinder\\MineRuneEssence.png", 300, 200, 9, 10, 70);
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy) {
        	break;
        }}
    if(difference < accuracy || count == 1) {
    
    	break;}
	count--;
	}
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void CursorScan(int LeftBorder, int RightBorder, int BottomBorder, String file,int startingX, int startingY, int accuracy, int speedX, int speedY) throws Exception {
	CornerText();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
    int count = 3;
	while (true) {
//	int startingX = 0;
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    CornerText();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
			CornerText();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
        if (difference < accuracy) {
        	LeftCheck(file, file);
        	count++;
        	System.out.println("click");
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
				CornerText();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
	        if (difference < accuracy) {
	        	LeftCheck(file, file);
	        	count++;
	        	System.out.println("click");
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy) {
        	break;
        }}
    if(difference < accuracy || count == 1) {
    	break;}
    robot.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(300+random.nextInt(300));
	robot.keyRelease(KeyEvent.VK_RIGHT);
	BlackBackground();
	count--;
	}
	if(count == 1) {
		LogOut();
	}
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void CursorScanBank(int LeftBorder, int RightBorder, int BottomBorder, String file, String file2, int startingX, int startingY, int accuracy, int speedX, int speedY) throws Exception {
	CornerText();
    double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
    double difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file2);
    double difference3 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\BankBankBooth3.png");
    double difference4 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\BankBankBooth4.png");
    int count = 3;
	while (true) {
//	int startingX = 0;
	Robot robot = new Robot();
	Random random = new Random();
    MMove(startingX, startingY);
    int currentX = MouseInfo.getPointerInfo().getLocation().x;
    int currentY = MouseInfo.getPointerInfo().getLocation().y;
    CornerText();

    while(BottomBorder> currentY) {
    	currentY = currentY +speedY;
	 while(RightBorder > currentX) {
     	while(true){try {
			CornerText();
			break;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("number 1");
		}}
        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file2);
        if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
        	LeftCheck(file, file);
        	count++;
        	System.out.println("click");
        	break;
        }
     	robot.mouseMove(currentX, currentY);	
     	currentX = currentX+speedX;    
	 
	 }if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
        	break;
        }
        currentY = currentY +speedY;
     	while(LeftBorder < currentX) {

	     	while(true){try {
				CornerText();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("number 2");
			}}
	        difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file);
	        difference2 = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png",file2);
	        if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
	        	LeftCheck(file, file);
	        	count++;
	        	System.out.println("click");
	        	break;
	        }
	        
	        robot.mouseMove(currentX, currentY);	
	     	currentX = currentX-speedX;  
     	}if (difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy) {
        	break;
        }}
    if(difference < accuracy || difference2 < accuracy || difference3 < accuracy || difference4 < accuracy || count == 1) {
    	break;}
    robot.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(300+random.nextInt(300));
	robot.keyRelease(KeyEvent.VK_RIGHT);
	BlackBackground();
	count--;
	}
	if(count == 1) {
		LogOut();
	}
//    LeftClick();
    Thread.sleep(200);
	 


}
private static void CornerText() throws Exception {
	{
        Rectangle rectangle = new Rectangle(1,25,75,15); 
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        while(true){try {
        	Thread.sleep(1);
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\CornerText.png"));
            Thread.sleep(1);
            break;
        } catch (IOException e) {

            e.printStackTrace();
        }}}
}
private static void DoorText() throws Exception {
	{
        Rectangle rectangle = new Rectangle(1,25,40,15); 
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        while(true){try {
        	Thread.sleep(1);
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\DoorText.png"));
            Thread.sleep(1);
            break;
        } catch (IOException e) {

            e.printStackTrace();
        }}}
}
private static void AirRune() throws Exception {
	/*For main
	int loops = 2;
	MapReset();		
	while(loops >0) {		
    AirRune();
    loops--;
	}
	*/

	Random random = new Random();
	try {
		ScreenCapture();
	} catch (AWTException e) {
		e.printStackTrace();
	}
	 //Checks to see you are in the proper place:
	 double difference = ImageCompare("C:\\Users\\Connor\\Desktop\\ImageFinder\\test.png","C:\\Users\\Connor\\Desktop\\ImageFinder\\EastFaladorBank.png");
	 double threshold = 10.0;
	 if(threshold > difference) {
	
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
	  	Thread.sleep(12500+random.nextInt(5500));
	  	MMove(1838, 179);
	  	LeftClick();
	  	Thread.sleep(12500+random.nextInt(5500));
	  	MMove(1789, 150);
	  	LeftClick();
	  	Thread.sleep(12500+random.nextInt(5500));
	  	MMove(1770, 115);
	  	LeftClick();
	  	Thread.sleep(12500+random.nextInt(5500));
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
	  	Thread.sleep(11500+random.nextInt(5500));
	  	MMove(1845, 39);
	  	LeftClick();
	  	Thread.sleep(11500+random.nextInt(5500));
	  	MMove(1854, 42);
	  	LeftClick();
	  	Thread.sleep(11500+random.nextInt(5500));
	  	MMove(1839, 38);
	  	LeftClick();
	  	Thread.sleep(17500+random.nextInt(5500));
	  	MMove(1854, 37);
	  	LeftClick();
	  	Thread.sleep(17500+random.nextInt(5500));
	  	MMove(901, 955);
	  	LeftClick();
	  	Thread.sleep(4500+random.nextInt(5500));
	  	MMove(904, 830);
	  	LeftClick();
	  	Thread.sleep(4500+random.nextInt(5500));
	  	MMove(1802, 764);
	  	RightClick();
	  	Thread.sleep(1000+random.nextInt(5500));
	  	MMove(1781, 857);
	  	LeftClick();
	  	//end of air rune run
	 }if(difference > threshold) {
	  		LogOut();}
	  	
	
}
private static void LogOut() throws Exception{
	Random random = new Random();
	//to do: add detection if bank open or closed
	Thread.sleep(1500+random.nextInt(1500));
  	MMove(1082, 69);
  	LeftClick();
  	//exits the bank if you have it open
  	Thread.sleep(1500+random.nextInt(1500));
  	MMove(1902, 40);
  	LeftClick();
  	Thread.sleep(1500+random.nextInt(1500));
  	MMove(1807, 958);
  	LeftClick();
}	
private static void RightClick() throws InterruptedException, AWTException {
	Robot robot = new Robot();
//    Random random = new Random();
    robot.mousePress(InputEvent.BUTTON3_MASK);
 //   Thread.sleep(17 + random.nextInt(100));
    robot.mouseRelease(InputEvent.BUTTON3_MASK);
}
private static void LeftClick() throws InterruptedException, AWTException {
	Robot robot = new Robot();
 //   Random random = new Random();
    robot.mousePress(InputEvent.BUTTON1_MASK);
 //   Thread.sleep(17 + random.nextInt(100));
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
        	Thread.sleep(random.nextInt(2)+1);
        	robot.mouseMove(currentX, currentY);
        	if(currentX <= compassVarianceX){
        	    currentX++;}
        	if(currentY <= compassVarianceY){
        	    currentY++;}}
        }
        if(compassVarianceX <= currentX && compassVarianceY <= currentY) {
        while(compassVarianceX <= currentX || compassVarianceY <= currentY) {
    		Thread.sleep(random.nextInt(2)+1);
        	robot.mouseMove(currentX, currentY);
        	if(currentY >= compassVarianceY){
        	    currentY--;}
        	if(currentX >= compassVarianceX){
        	    currentX--;}
    	}}
        if(compassVarianceX >= currentX && compassVarianceY <= currentY) {
            while(compassVarianceX >= currentX || compassVarianceY <= currentY) {        	
            	Thread.sleep(random.nextInt(2)+1);
            	robot.mouseMove(currentX, currentY);
            	if(currentX <= compassVarianceX){
            	    currentX++;}
            	if(currentY >= compassVarianceY){
            	    currentY--;}}
            }
        if(compassVarianceX <= currentX && compassVarianceY >= currentY) {
            while(compassVarianceX <= currentX || compassVarianceY >= currentY) {        	
            	Thread.sleep(random.nextInt(2)+1);
            	robot.mouseMove(currentX, currentY);
            	if(currentX >= compassVarianceX){
            	    currentX--;}
            	if(currentY <= compassVarianceY){
            	    currentY++;}}
            }
        Thread.sleep(random.nextInt(100)+100);
        System.out.println(currentX + "," + currentY);
		
}
private static void ScreenCapture() throws AWTException {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(dimension);
        Robot robot = new Robot();
        BufferedImage screen = robot.createScreenCapture(rectangle);
        try {
            ImageIO.write(screen, "png", new File("C:\\Users\\Connor\\Desktop\\ImageFinder\\test.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }}
private static double ImageCompare(String file1, String file2){ 
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
	

