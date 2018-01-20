  int xPos=200;
  int xDir=1;
  int yPos = 700;
  int yDir=1;
void setup() {
  size(1000, 1000);
  background(90);
  noFill();
}

void draw() {
  background(90);
  for(int i = 10; i< 401; i=i+50){
    ellipse(xPos,200,i,i);
    xPos=xPos+xDir;
    if(xPos>width-20 || xPos<20){
      xDir=-xDir;
      
      
      
    }
  }
  for(int i = 10;i < 401;i=i+50){
    ellipse(yPos,200,i,i);
    yPos=yPos-xDir;
    if(yPos>width-20 || yPos<20){
      yDir=-xDir;
      
      
      
    }
    
    
    
  }
}

