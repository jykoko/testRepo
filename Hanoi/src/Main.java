import java.util.Timer;
import java.util.TimerTask;

/**
 * <p>Towers of Hanoi problem solved recursively.<p>
 * 
 * @author jakekoko727
 *
 */
public class Main 
{
   public static void main(String[] args)
   {
	   Main main = new Main();
	   
	   main.towers(10, "peg one", "peg two", "peg three");
   }
   
   public void towers(int disks, String peg1, String peg2, String peg3)
   {
	   if(disks == 1)
	   {
		   // print peg1 to peg 3
		   System.out.println("Move from " + peg1 + " to " + peg3);
	   }
	   else
	   {
		   towers(disks - 1, peg1, peg3, peg2);
		   System.out.println("Recursive Call #1: " + disks);
		   towers(1, peg1, peg2, peg3);
		   System.out.println("Recursive Call #2: "   + disks);
		   towers(disks - 1, peg2, peg1, peg3);
		   System.out.println("Recursive Call #3: "  + disks);
	   }
   }
}