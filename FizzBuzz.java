
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{ 
    public void run () {
        for (int i = 1; i <= 100; i++) 
        {
            if(i/3.0 == i/3 && i/5.0 == i/5) {
                System.out.println("FizzBuzz");
            }else if (i/3.0 == i/3) {
                System.out.println("Fizz");
            }else if (i/5.0 == i/5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void main (String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
