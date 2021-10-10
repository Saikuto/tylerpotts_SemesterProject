package tylerpotts_SemesterProject;



import java.lang.reflect.InvocationTargetException;
// Tyler Potts
// Main program of car insurance
// // --module-path "C:\tylerpotts_SemesterProject\javafx-sdk-17.0.0.1\lib" --add-modules javafx.controls,javafx.fxml
import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 

public class main extends Application {
	
	Scene MainScene , UserScene, CarScene, CalculateScene;
	
	protected TextField tfCreditScore = new TextField();
	protected TextField tfYear = new TextField();
    protected TextField tfMileage = new TextField();
    protected TextField tfCarCost = new TextField();
    protected TextField tfPercentOff = new TextField();
    protected TextField tfMonthlyPayment = new TextField();
    protected TextField tfCoverage = new TextField();
    
	@Override
	public void start(Stage primaryStage) {
		
		// Main Scene
		Image imgCar = new Image(getClass().getResourceAsStream("caricon.png"));
		ImageView viewCar = new ImageView(imgCar);
		viewCar.setFitHeight(100);
		viewCar.setFitWidth(100);
		
		Label lblMainText = new Label(" Welcome to the FraudInsurance coverage estimator app.", viewCar);
		lblMainText.setWrapText(true);
		Label lblMainText2 = new Label("To begin please press Next.");
		
	
		Button btMain = new Button("Next");
		btMain.setPrefSize(100, 20);
		btMain.setOnAction(e -> primaryStage.setScene(UserScene));
		
		// Create border pane
		
		BorderPane paneMain = new BorderPane();
		paneMain.setTop(lblMainText);
		paneMain.setCenter(lblMainText2);
		paneMain.setBottom(btMain);
		paneMain.setAlignment(btMain, Pos.CENTER);
		paneMain.getChildren().add(viewCar);	
		
		MainScene = new Scene(paneMain, 500 ,200);
		
		// Create UserScene 
		
		// Create labels, text fields, and buttons
		Label lblUser = new Label("Please enter your personal information.");
		Label lblFirstName = new Label("First Name:");
		TextField tfFirstName = new TextField();
		Label lblLastName = new Label("Last Name:");
		TextField tfLastName = new TextField();
		Label lblBirthYear = new Label("Birthday Year:");
		TextField tfBirthYear = new TextField();
		Label lblState = new Label("State:");
		TextField tfState = new TextField();
		Label lblCreditScore = new Label("Credit Score:");
		//TextField tfCreditScore = new TextField();
		Button btUser = new Button("Next");
		btUser.setPrefSize(100, 20);
		btUser.setOnAction(e -> primaryStage.setScene(CarScene));
		
		HBox hbox1 = new HBox(10);
		hbox1.getChildren().addAll(lblFirstName, tfFirstName, lblLastName, tfLastName);
		HBox hbox2 = new HBox(10);
		hbox2.getChildren().addAll(lblBirthYear, tfBirthYear, lblState, tfState);
		HBox hbox3 = new HBox(10);
		hbox3.getChildren().addAll(lblCreditScore, tfCreditScore);
		
		
		VBox vboxUser = new VBox(5);
		vboxUser.getChildren().addAll(hbox1, hbox2, hbox3);
		
		HBox btUserBox = new HBox(5);
		btUserBox.getChildren().addAll(btUser);
		btUserBox.setAlignment(Pos.CENTER);
		
		BorderPane paneUser = new BorderPane();
		paneUser.setTop(lblUser);
		paneUser.setCenter(vboxUser);
		paneUser.setBottom(btUserBox);
		
		
		
	    UserScene = new Scene(paneUser, 500, 200);
	    
	    // Create CarScene 
		// Create labels, text fields, and buttons
		Label lblCar = new Label("Please enter some information about your vehicle. ");
		Label lblMake = new Label("Car Make:");
		TextField tfMake = new TextField();
		Label lblYear = new Label("Car Year:");
		//TextField tfYear = new TextField();
		Label lblMileage = new Label("Mileage:");
		//TextField tfMileage = new TextField();
		Label lblCarCost = new Label("Cost Of Car:");
		//TextField tfCarCost = new TextField();
		Button btCar = new Button("Next");
		Button btCarPrev = new Button("Previous");
		btCar.setPrefSize(100, 20);
		btCarPrev.setPrefSize(100, 20);
		btCarPrev.setOnAction(e -> primaryStage.setScene(UserScene));
		btCar.setOnAction(e -> primaryStage.setScene(CalculateScene));
		
		
		// Create HBox for lbl and tf
		HBox carHbox1 = new HBox(10);
		carHbox1.getChildren().addAll(lblMake, tfMake, lblYear, tfYear);
		HBox carHbox2 = new HBox(10);
		carHbox2.getChildren().addAll(lblMileage, tfMileage, lblCarCost, tfCarCost);

		
		
		VBox vboxCar = new VBox(5);
		vboxCar.getChildren().addAll(carHbox1, carHbox2);
		
		HBox btCarBox = new HBox(5);
		btCarBox.getChildren().addAll(btCarPrev, btCar);
		btCarBox.setAlignment(Pos.CENTER);
		
		BorderPane paneCar = new BorderPane();
		paneCar.setTop(lblCar);
		paneCar.setCenter(vboxCar);
		paneCar.setBottom(btCarBox);
		
		
		
	    CarScene = new Scene(paneCar, 500, 200);
	    
		
	    
	    // Create Calculate 
	    
	    // Create labels and text fields. Turn off editable 
		Label lblCal = new Label("Based on the information given. Here is estimated coverage. ");
		Label lblCoverage = new Label("Coverage:");
		//TextField tfCoverage = new TextField();
		Label lblMonthlyPayment = new Label("Monthly Payment:");
		//TextField tfMonthlyPayment = new TextField();
		Label lblPercentOff = new Label("Percentage Off:");
		//TextField tfPercentOff = new TextField();
		tfCoverage.setEditable(false);
		tfMonthlyPayment.setEditable(false);
		tfPercentOff.setEditable(false);	
		Button btCal = new Button("Calculate");
		Button btCalPrev = new Button("Previous");
		btCal.setPrefSize(100, 20);
		btCalPrev.setPrefSize(100, 20);
		btCal.setOnAction(e -> start());
		btCalPrev.setOnAction(e -> primaryStage.setScene(CarScene));
		
		// Create HBox for lbl and tf
		HBox calHbox1 = new HBox(25);
		calHbox1.getChildren().addAll(lblCoverage, tfCoverage);
		HBox calHbox2 = new HBox(25);
		calHbox2.getChildren().addAll(lblMonthlyPayment, tfMonthlyPayment);
		HBox calHbox3 = new HBox(25);
		calHbox3.getChildren().addAll(lblPercentOff, tfPercentOff);
		
		
		VBox vboxCal = new VBox(5);
		vboxCal.getChildren().addAll(calHbox1, calHbox2, calHbox3);
		
		
		HBox btCalBox = new HBox(5);
		btCalBox.getChildren().addAll(btCalPrev, btCal);
		btCalBox.setAlignment(Pos.CENTER);
		
		BorderPane paneCal = new BorderPane();
		paneCal.setTop(lblCal);
		paneCal.setCenter(vboxCal);
		paneCal.setBottom(btCalBox);
		
		

		
		
		
		
		CalculateScene = new Scene(paneCal, 500, 200);
	    
	    
	 
		// Create scene and display stage
		//Scene MainScene = new Scene(paneMain, 500 ,200);
		//Scene UserScene = new Scene(paneUser, 500, 200);
		primaryStage.setTitle("FraudeInsurance");
		primaryStage.setScene(MainScene);
		primaryStage.show();
		
	}

	public void start() {
		int creditScore = Integer.parseInt(tfCreditScore.getText());
		double year = Double.parseDouble(tfYear.getText());
		double mileage = Double.parseDouble(tfMileage.getText());
		double carCost = Double.parseDouble(tfCarCost.getText());
	
	 Calculate cal = new Calculate(year, mileage,carCost, creditScore);
	 cal.getPercentOff();
	 
	 tfPercentOff.setText(String.format("%.0f%%", (cal.calculateDiscount()*100)));
	 tfCoverage.setText(String.format("$%.2f", cal.calculateCoverage()));
	 tfMonthlyPayment.setText(String.format("$%.2f", cal.calculateMonthPayment()));
	}

	public static void main(String[] args) { 
	    launch(args);
	 }
	
}
