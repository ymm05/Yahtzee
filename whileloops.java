
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloops
{ 
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run () {
        for (int i = 0; i < 15; i = i+ 1) {
            System.out.println("i is equal to "+i);
        }
        
        for (int i = 0, j = 10; i < 10 && j < 0; j++, j=j+(-2)) {
           System.out.println("Compund for loop j="+i+" j="+j); 
        }
        
        for (int j = 0, k = 10; j < 10 && k < 0; k++, k=k+(-3)) {
           System.out.println("Compund for loop k="+k+" j="+k); 
        }
    }

    public static void main (String[] args)
    {
        whileloops hw = new whileloops();
        hw.run();
    }
}
