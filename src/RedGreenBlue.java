
public class RedGreenBlue {
static String favoriteColor = "Red";

RedGreenBlue(){
	
}

public static void main(String[] args) {
	RedGreenBlue rgb = new RedGreenBlue();
	rgb.setFavoriteColor("Apple");
	System.out.println(favoriteColor);
}
public void setFavoriteColor(String newFavoriteColor) {
	
	favoriteColor = newFavoriteColor;
	
}

}
