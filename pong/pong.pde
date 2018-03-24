PImage backgroundImage;
int xPos=100;
int xDir=1;
int yPos=1;
int yDir=1;
int ypaddle=1000;
int paddleL=100;

void setup() {
  size(1000, 1000);
  backgroundImage =loadImage("pingpong.jpg");
  backgroundImage.resize(1000, 1000);
  noStroke();
}

void draw() {
  background(backgroundImage);
  fill(83, 15, 245);
  fill(156, 209, 211);
  rect(mouseX, 900, 200, 100);
  ellipse(xPos, yPos, 100, 100);
  xPos=xPos+xDir*7;
  yPos=yPos+yDir*7;
  if (xPos>width-20 || xPos<20) {
    xDir=-xDir;
  }
  if (intersects(xPos, yPos, mouseX, paddleL) || yPos<0) { 
    yDir=-yDir;
  }
}

boolean  intersects( int xPos, int yPos, int mouseX, int paddleL) {
  if (yPos>821 && xPos> mouseX && xPos<mouseX+ paddleL) {
    return true;
  } else {
    return false;
  }
}