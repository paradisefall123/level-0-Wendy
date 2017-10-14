PImage donkey;
PImage tail;
int saveX;
int saveY;
boolean gotP= false;
void setup() {
  size(788, 434); 

  donkey= loadImage("donkey.jpg");
  background(donkey);
  tail = loadImage("tail.png");
  tail.resize(100, 100);
}
void draw() {
  System.out.println(mouseX);
  System.out.println(mouseY);
  rect(1, 1, 66, 66);
  if (mouseX<66 && mouseY<66) {
    size(788, 434); 
    donkey= loadImage("donkey.jpg");
    background(donkey);
  } else {
    PImage nachos = loadImage("nachos.jpg");
    nachos.resize(788, 434);
    //background(nachos);
  }
  if (gotP==true) {
    image(tail,saveX,saveY);
  }
}
void mousePressed() {
   System.out.print
  if (mouseX<148 && mouseX>134 && mouseY<244 && mouseY>188) {
    gotP=true;
    saveX=mouseX;
    saveY=mouseY;
    
  }
}

