
/**
 * Write a description of class Games here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Games
{
    private String game;
    private String genre;
    private int release;
    private int id;
    private static int gameCount;
    
    /**
     * Constructor for objects of class Games
     */
    public Games(String a, String b, int i)
    {
        game = a;
        genre = b; 
        release = i;
        gameCount++;
        id = gameCount;
    }

    public String toString()
    {
        String toString = "Game: " + game + "\n ";
        toString += "Genre: " + genre + "\n ";
        toString += "Released: " + release + "\n ";
        toString += "Id: " + id + "\n";
        toString += "Game Count: " + gameCount + "\n";
        return toString;
    }
    
    //get title
    public String getGame(){
        return game;
    }
    
    public void setGame(String s){
        game = s;
    }
    
    
    public int getReleased(){
        return release;
    }
    
    
    
    public void setReleased(int r){
        if(r>= 2000){
            release = r;
        }
        else{
            release = 2000;
        }
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String d){
        genre = d;
    }
}
