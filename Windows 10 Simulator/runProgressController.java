package Exercise1;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class runProgressController {
    public ListView<String> run_progress_list;
    public Label my_label;
    public Label size_of_program;

    public void setLabel (String label) {
        my_label.setText (label);
    }

    public void setList (String note) {
        run_progress_list.getItems().add(note);
    }

    public void setSize (String size) {
        size_of_program.setText (size);
    }
}


