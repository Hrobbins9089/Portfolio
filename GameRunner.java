
/**
 * Write a description of class GameRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GameRunner
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of Game:");
        String s = scan.nextLine();
        System.out.println("Name of Genre");
        String d = scan.nextLine();
        System.out.println("Date release:");
        int r = scan.nextInt();
        Games game1 = new Games (s, d, r);
        Games game2 = new Games ("Call of Duty", "FPS", 2001);
        System.out.println(game1);
        System.out.println(game2);
    }
}
