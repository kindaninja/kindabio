import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Model  {
   
    private MySQL db;
    private String screen = "1";
    private String seats = "55";
    
    
    public Model()
    {
        // Open connection to database
        db = MySQL.getInstance();
    }
    
    public String getScreen()   {
        return screen;
    }
    
    public String getSeats()   {
        return seats;
    }
    
    public void addMovie(String name)  {
        
        // Execute SQL
        db.executeCommand("INSERT INTO movies (title) VALUES ('"+ name +"');");
    }
    
    public String getMovie(int id)    {

        // Execute SQL
        ResultSet r = db.executeQuery("SELECT title FROM movies WHERE id = " + id + ";");
        try {
            if(r.next())
            {
                String title = r.getString("title");
                return title;
            }
        }   catch (SQLException e)  {
            e.printStackTrace();
        }   finally {
            db.closeConnection();
        }
        return "null";
    }
    
}
