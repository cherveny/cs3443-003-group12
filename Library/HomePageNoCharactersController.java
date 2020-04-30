package Library;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomePageNoCharactersController {
	@FXML 
	private SplitPane mainPane2;
	
	@FXML
    void startButon(ActionEvent event) throws IOException {
		mainPane2 = FXMLLoader.load(getClass().getResource("RacePage.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainPane2,800,600);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setTitle("D&D 5E Character Builder - Race");
		window.setScene(scene);
		window.setResizable(false);
		window.show();
		
    }

}
