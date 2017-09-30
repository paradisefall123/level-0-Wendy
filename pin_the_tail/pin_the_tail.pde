PImage donkey;
PImage tail;
void setup(){
 size(788,434); 
  donkey= loadImage("donkey.jpg");
  background(donkey);
  tail = loadImage("tail.png");
   tail.resize(100,100);
}
void draw(){
  if(mousePressed){
  image(tail,mouseX-60,mouseY-40);
  }
  rect(1,1,66,66);
    if(mouseX)

  
  
  
}

  
  
  

