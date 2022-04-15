import coreproject.core.ViewHandler;
import coreproject.core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class RetailerApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ViewModelFactory vmf=new ViewModelFactory();
        ViewHandler viewHandler=new ViewHandler(vmf);
        viewHandler.start();
    }
}
