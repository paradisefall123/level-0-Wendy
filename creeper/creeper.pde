   PImage creeper;
   int place = 52;
   int there = 359;
   
void setup(){    
  size(500,500);
  PImage minecraft = loadImage("minecraft.jpeg");
  minecraft.resize(500,500);
  background(minecraft);
   creeper = loadImage("creeper.png");
   creeper.resize(8,8);
  
}
void draw(){
  image(creeper,place,there);
 println(mouseX + ", " + mouseY);
 fill(247,12,12);
  ellipse(50,50,10,10);
  
  
  
  
  
  
}