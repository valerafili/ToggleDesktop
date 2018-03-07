import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ToggleDesktopApplication extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new MainWindowScene().getScene();
        stage.setTitle("Toggle Desktop");
        stage.minWidthProperty().setValue(scene.getWidth());
        stage.setScene(scene);
        stage.show();
    }
}