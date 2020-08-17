package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TemplateController {
	public static int likeCounter = 1099998;
	
	@FXML
    private Label numberOfLikes;
	
	@FXML
    private void initialize() {
        numberOfLikes.setText(likeFormat());
    }
	
	public void addLike() {
		likeCounter++;
		initializeText();
		System.out.println(likeCounter);
	}
	
	private void initializeText() {
		numberOfLikes.setText(likeFormat());
	}
	
	
	public static String likeFormat() {
        if (likeCounter < 1000){
            return likeCounter + " Likes";
        }
        else if ( (likeCounter >= 1000) && (likeCounter < 1000000) ) {
            Double divK = Double.valueOf(likeCounter) / 1000;
            String divKString = String.valueOf(divK);
            String[] divKStringArray = divKString.split("\\.");
            if (divKStringArray[1].charAt(0) == '0') {
                return divKStringArray[0] + "k Likes";
            }
            else {
                return divKStringArray[0] + "." + divKStringArray[1].charAt(0) + "k Likes";
            }
        }
        else if (likeCounter >= 1000000) {
            Double divM = Double.valueOf(likeCounter) / 1000000;
            String divMString = String.valueOf(divM);
            String[] divMStringArray = divMString.split("\\.");
            if (divMStringArray[1].charAt(0) == '0') {
                return divMStringArray[0] + "M Likes";
            }
            else {
                return divMStringArray[0] + "." + divMStringArray[1].charAt(0) + "M Likes";
            }
        }
        return "";
    }

}
