  PImage backgroundImage;
int xPos=100;
int xDir=1;
int yPos=200;
int yDir=1;
void setup() {
    size(1000, 1000);
backgroundImage =  loadImage("pingpong.jpg");
backgroundImage.resize(1000,1000);
  noStroke();
  
}
void draw() {
  background(backgroundImage);
  fill(83,15,245);
  rect(mouseX,mouseY,100,200);
  fill(156,209,211);
  ellipse(xPos, 500, 100, 100);
  xPos=xPos+xDir*3;

  if (xPos>width-20 || xPos<20) {
    xDir=-xDir;
  }
}