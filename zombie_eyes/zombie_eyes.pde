void setup(){
  PImage face = loadImage("fox.jpg");
  size(500,600);
  face.resize(500,600);
  image(face,0,0);
   
}
  void draw(){
    fill(mouseX,mouseY,100);
    ellipse(230,260,80,50);
    ellipse(360,220,80,50);
    fill(9,28,28);
    ellipse(230,260,60,30);
    ellipse(360,220,60,30);
    
  }
