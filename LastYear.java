import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  // Variables (instance & static)
private String [] placeImages;
private String [] placeCaptions;
private String [] academicImages;
private String [] academicCaptions;
private String [] pokemonImages;
private String[] pokemonCaptions;
private String [] foodImages;
private String [] foodCaptions;
public static final int SAMPLE_RATE = 44100; // for audioClip
  
  // Constuctors that read the textfiles and have caption arrays to display.
  public LastYear() {
pokemonImages = FileReader.toStringArray("pokemonImages.txt");
pokemonCaptions = new String[] {"Pikachu Haul!", "My Best Pull!", "My Favorite Shiny Hunt!"};
foodImages = FileReader.toStringArray("foodImages.txt");
foodCaptions = new String[] {"Fried Seafood Noodles!", "Tried Baking My First Pizza", "Thanksgiving Dinner!"};
academicImages = FileReader.toStringArray("academicImages.txt");
academicCaptions = new String[] {"Got a 4 on APCSP!", "All A's as a Sophmore!", "All A's as a Freshman!"};
placeImages = FileReader.toStringArray("placeImages.txt");
placeCaptions = new String[] {"My First Waterfall!", "Lake at SF Zoo!", "Roadside River in Utah!"};
  }

  //Parameterized Constructor
 public LastYear (String nothing){
   String nothing1 = nothing;
 }

  /**
   * Top level drawScene method that has specific text formatted 
   and optimizable colors for background and text
   */
  public void drawScene() {
playBackgroundTrack(48);
drawTitleScreen();
pause(2);
drawTransitionScreen("    2025!", "yellow", "brown");
drawTransitionScreen("Pokemon!", "yellow", "green");
drawPokemon();
pause(2);
drawTransitionScreen("    Food!", "red", "yellow");
drawFood();
pause(2);
drawTransitionScreen("Academic!", "green", "pink");
drawAcademic();
pause(2);
drawTransitionScreen("  Travels!", "blue", "orange");
drawPlace();
  }

 
/*
All the draw methods below draw the images of each category
and draw a caption of what the image is/represents. Each time the loops iterate,
the background will clear to gray, draw the image and caption, pause, then repeats.
*/
  public void drawPokemon() {
    for(int i = 0; i < pokemonCaptions.length; i++) {
      clear("gray");
      drawImage(pokemonImages[i], 0, 0, 400);
      drawCaptionBox(30, 310, 340, 75, pokemonCaptions[i]);
      pause(1);
    }
  }
   
  public void drawFood() {
    for(int i = 0; i < foodCaptions.length; i++) {
      clear("gray");
      drawImage(foodImages[i], 0, 0, 400);
      drawCaptionBox(30, 310, 340, 75, foodCaptions[i]);
      pause(1);
    }
  }

  public void drawAcademic() {
    for(int i = 0; i < academicCaptions.length; i++) {
      clear("gray");
      drawImage(academicImages[i], 0, 0, 400);
      drawCaptionBox(30, 310, 340, 75, academicCaptions[i]);
      pause(1);
    }
  }

    public void drawPlace() {
    for(int i = 0; i < placeCaptions.length; i++) {
      clear("gray");
      drawImage(placeImages[i], 0, 0, 400);
      drawCaptionBox(30, 310, 340, 75, placeCaptions[i]);
      pause(1);
    }
  }
  
  // other methods
  
//cited from Mr Aiello's example, used to draw the title screen
  public void drawTitleScreen() {
    setTitleScreenStyle("blue");
    clear("white");
    drawText("Timothy's", 50, 125);
    drawText("2025-2026", 90, 175);
    drawText("Journey!", 60, 225);
    pause(2);
  }

  //cited from Mr Aiello's example
    public void setTitleScreenStyle(String color) {
    setTextHeight(50);
    setTextColor(color);
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }
  //cited from Mr Aiello's example
    public void drawCaptionBox(int xPos, int yPos, int width, int height, String caption) {
    // shadow box, 5px offset
    setFillColor("black");
    drawRectangle(xPos + 5, yPos + 5, width, height);
    
    // front box
    setFillColor("white");
    drawRectangle(xPos, yPos, width, height);

    // text style (adjust to fit style/size)
    setTextStyle(Font.SERIF, FontStyle.BOLD);
    setTextColor("black");
    int fontSize = 24;
    setTextHeight(fontSize);

    // drawing text (adjust offsets)
    int xLinePos = xPos + 10;
    int yLinePos = yPos + fontSize;
    drawText(caption, xLinePos, yLinePos);
  }
 /*Method that sets a title for each category transition 
  (I used Mr Aiello's setTitleScreen method as a base and modified it)
  This method has 3 parameters that edit the text, color of text, and the backgrounds 
  color in order to customize the transitions
  */
  
  public void drawTransitionScreen(String text, String color, String bg) {
    setTitleScreenStyle(color);
    clear(bg);
    drawText(text, 85, 200);
    pause(2);
  }
   

   public void playBackgroundTrack(int numSeconds) {
    double[] audio = SoundLoader.read("energetic-sports-442840-(1).wav");
    // just play the first numSeconds
    double[] clip = createClip(audio, 0, numSeconds);
    playSound(clip);
  }

  /**
   * Creates an audio clip from a given start time to a end time
   */
  public static double[] createClip(double[] sound, int start, int end) {
    int startIndex = start * SAMPLE_RATE;
    int endIndex = end * SAMPLE_RATE;
    
    double[] newSound = new double[endIndex - startIndex];

    int index = 0;
    
    while (startIndex < endIndex) {
      newSound[index] = sound[startIndex];
      startIndex++;
      index++;
    }

    return newSound;
  }


  /* 
This method returns whether there is an even amount of images or not
  */
  public boolean isImagesEven(){
    int length = pokemonCaptions.length + foodCaptions.length + placeCaptions.length + academicCaptions.length;
      if (length % 2 == 0){
        return true;
      } else{
        return false;
      }
  }

  /*
  This method counts the number of images in this subclass
  */
   public int countImages(){
  return  pokemonCaptions.length + foodCaptions.length + placeCaptions.length + academicCaptions.length;
  }
}
