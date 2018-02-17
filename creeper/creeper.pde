PImage creeper;
PImage bomb;
PImage tnt;
int place = 52;
int there = 359;

void setup() {    
  size(500, 500);
  PImage minecraft = loadImage("minecraft.jpeg");
  minecraft.resize(500, 500);
  background(minecraft);
  creeper = loadImage("creeper.png");
  creeper.resize(8, 8);
  tnt= loadImage("creeper.png");
  tnt.resize(30,30);
  bomb=loadImage("creeper.png");
  bomb.resize(30,30);
}
void draw() {
  image(creeper, place, there);
  image(tnt,50,50);
  image(bomb,123,300);
  
  
  
  
  
  if (mousePressed == true) {


    if (mouseX>place-10 && mouseX<place+10 && mouseY>there-10 && mouseY<there+10   ) {
      fill(0, 255, 0);
      println("You found the creeper!");
    } else {
      fill(247, 12, 12);
    }     
    ellipse(mouseX, mouseY, 10, 10);
  }
}