PImage donkey;
PImage tail;
int saveX= mouseX;
int saveY= mouseY;
boolean gotP= false;
void setup() {
  size(788, 434); 

  donkey= loadImage("donkey.jpg");
  background(donkey);
  tail = loadImage("tail.png");
  tail.resize(100, 100);
}
void draw() {
  rect(1, 1, 66, 66);
  if (mouseX<66 && mouseY<66) {
    size(788, 434); 
    donkey= loadImage("donkey.jpg");
    background(donkey);
  } else {
    PImage nachos = loadImage("nachos.jpg");
    nachos.resize(788, 434);
    background(nachos);
  }image(tail, mouseX-60, mouseY-40);
}
void mousePressed() {
  gotP=true;
  saveX= mouseX;
  saveY=mouseY;
  
}