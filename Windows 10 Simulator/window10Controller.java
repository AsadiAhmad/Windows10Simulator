package Exercise1;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class window10Controller {

    public void createWindowRunning (String fileName, String title, String note, String label, String size) throws IOException {
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
        Parent root = loader.load();
        runProgressController controller = loader.getController();
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root, 600, 400));
        controller.setLabel (label);
        controller.setSize (size);
        primaryStage.show();

        Thread thread = new Thread(() -> {
            Runnable updater = () -> controller.setList(note);
            while (true) {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ignored) {
                }
                Platform.runLater(updater);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public void onClickFireFox () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "FireFox", "FireFox is running", "FireFox browser", "the size of the program is : 1.3 GB");
    }

    public void onClickChrome () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Chrome", "Chrome is running", "Chrome browser", "the size of the program is : 1.2 GB");
    }

    public void onClickIntellij () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Intellij", "Intellij is running", "Intellij IDE", "the size of the program is : 0.7 GB");
    }

    public void onClickWord2019 () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Word 2019", "Word 2019 is running", "Word 2019", "the size of the program is : 0.3 GB");
    }

    public void onClickPhotoshop () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Photoshop", "Photoshop is running", "Photoshop", "the size of the program is : 4.7 GB");
    }

    public void onClickPycharm () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Pycharm", "Pycharm is running", "Pycharm IDE", "the size of the program is : 0.6 GB");
    }

    public void onClickMediaPlayer () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Media Player", "Media Player is running", "Media Player", "the size of the program is : 0.5 GB");
    }

    public void onClickAssassinsCreedUnity () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Assassin sCreed Unity", "Assassins Creed Unity is running", "Assassin's Creed Unity Game", "the size of the program is : 67 GB");
    }

    public void onClickPaint () throws IOException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Paint", "Paint is running", "Paint", "the size of the program is : 1.1 GB");
    }

    public void onCLickTelegram () throws IOException, InterruptedException {
        createWindowRunning ("myFXMLFile/run_progress.fxml", "Telegram ", "Telegram  is running", "Telegram", "the size of the program is : 6.77 GB");
    }
}
