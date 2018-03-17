PImage backgroundImage;
int xPos=100;
int xDir=1;
int yPos=0;
int yDir=1;
int ypaddle=900;
int paddleL=100;
void setup() {
  size(1000, 1000);
  backgroundImage =  loadImage("pingpong.jpg");
  backgroundImage.resize(1000, 1000);
  noStroke();
}
void draw() {
  background(backgroundImage);
  fill(83, 15, 245);
  rect(mouseX, 900, 200, 100);
  fill(193, 164, 232);
  rect(mouseX, 900, 200, 100);
  fill(156, 209, 211);

  ellipse(xPos, yPos, 100, 100);
  xPos=xPos+xDir*7;
  yPos=yPos+yDir*7;
  if (xPos>width-20 || xPos<20) {
    xDir=-xDir;
  }
  if (yPos>height-100 || yPos<0) {
    yDir=-yDir;
  }
}

 boolean  intersects( int xPos,int yPos,int mouseX, int ypaddle,int paddleL) {
  if (yPos>ypaddle && xPos> mouseX && xPos<mouseX+ paddleL) {
  return true;
} else {
  return false;
}




}