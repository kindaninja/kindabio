import java.awt.event.*;

public class Controller {
    
    private Model model;
    private View view;
    
    private int momio = 3;
    
    
    public Controller(Model model, View view) {
        this.model = model; 
        this.view = view;
        updateView();
    }    
    
    private void updateView()
    {
        view.setScreen(model.getScreen());
        view.setSeats(model.getSeats());
    }
    
    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
    
}