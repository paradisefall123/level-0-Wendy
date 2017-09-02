 
 int x =350;
 int y =340;
 
 void setup(){
  size(500,500);
  PImage catPic = loadImage("kitten.jpg");
  catPic.resize(500,500); 
  background(catPic);
}
void draw(){
  fill(234,85,85);
  ellipse(x,y,70,70);
  
  
}
void keyPressed() {
  noStroke();
  x++;
  y++;
}

