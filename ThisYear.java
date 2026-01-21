import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  // Variables (instance & static)
private String [] goalsImages;
private String [] goalsCaptions;
private String [] janImages;
private String [] janCaptions;
  // Constuctors
  public ThisYear() {
goalsImages = FileReader.toStringArray("goalsImages.txt");
goalsCaptions = new String[] {"Catch Shiny Giratina!", "Get 5's On My AP Tests!", "Learn To Cook!"};
janImages = FileReader.toStringArray("janImages.txt");
janCaptions = new String[] {"Drawing Gestures In Art!", "More Gestures!", "Got Some Kanto Cards!"};
  }
//Parameterized constructor
   public ThisYear (String nothing){
   String nothing1 = nothing;
 }

  /**
   * Top level drawScene method that has specific text formatted 
   and optimizable colors for background and text
   */
  public void drawScene() {
drawTransitionScreen("    2026!", "blue", "yellow");
drawTransitionScreen("  January!", "white", "black");
drawJan();
pause(2);
drawTransitionScreen("   Goals!", "yellow", "purple");
drawGoals();
drawTransitionScreen(" The End!", "white", "black");
  }

  // other methods
  /*
All the draw methods below draw the images of each category
and draw a caption of what the image is/represents. Each time the loops iterate,
the background will clear to gray, draw the image and caption, pause, then repeats.
*/
  public void drawJan() {
    for(int i = 0; i < janCaptions.length; i++) {
      clear("gray");
      drawImage(janImages[i], 0, 0, 400);
      drawCaptionBox(30, 310, 340, 75, janCaptions[i]);
      pause(1);
    }
  }

    public void drawGoals() {
    for(int i = 0; i < goalsCaptions.length; i++) {
      clear("gray");
      drawImage(goalsImages[i], 0, 0, 400);
      drawCaptionBox(30, 310, 340, 75, goalsCaptions[i]);
      pause(1);
    }
  }
//Sets the title screens font, style, height, and color
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

   /* 
This method returns whether there is an even amount of images or not
  */
  public boolean isImagesEven(){
    int length = janCaptions.length + goalsCaptions.length;
    //checks if the number is even
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
  return  janCaptions.length + goalsCaptions.length;
  }
  
}
