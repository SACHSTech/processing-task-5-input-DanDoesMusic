import processing.core.PApplet;

public class Sketch extends PApplet {
	


  public void settings() {
	// put your size call here
    size(900, 900);

  }
    public void setup() {
    background(32);

  }

public void draw() {
   if (mousePressed) {
    fill(204, 161, 112);
    ellipse(mouseX, mouseY, 45, 45);
    fill (74, 65, 55);
    ellipse(mouseX,mouseY,4,4);
    ellipse(mouseX + 5 ,mouseY - 5,4,4);
    ellipse(mouseX + 8 ,mouseY + 8,4,4);
    ellipse(mouseX - 7 ,mouseY + 3,4,4);
    ellipse(mouseX + 12,mouseY - 9,4,4);
    ellipse(mouseX - 6,mouseY + 15,4,4);
    ellipse(mouseX - 7,mouseY -14 ,4,4);

   }
   if (keyPressed){
    if (key == 'b'){
        fill (74, 65, 55);
  rect(mouseX, mouseY, 60, 30);
    }
    else if (keyPressed) {
         if (key == 't'){
          fill(255, 157, 28);
          ellipse(mouseX , mouseY, 30,30);
          fill(0,255,0);
          rect(mouseX-2,mouseY-15,20,10);
        }
    }
  }
}



}