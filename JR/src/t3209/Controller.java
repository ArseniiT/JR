package t3209;

import javax.swing.text.html.HTMLDocument;
import java.io.File;

/**
 * Created by DELL on 11/14/2017.
 */
public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        view.setController(controller);
        view.init();
        controller.init();

    }

    public Controller(View view) {
        this.view = view;
    }

    public void init(){

    }

    public void exit(){
        System.exit(0);
    }
}