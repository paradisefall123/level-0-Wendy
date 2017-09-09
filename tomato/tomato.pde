void setup(){
  size(500,500);
  
}
void draw(){
  background(200,200,200);
  noStroke();
  fill(242,40,29);
  ellipse(150,200,150,150);
  ellipse(212,200,150,150);
  fill(39,129,46);
  rect(176,103,12,32);
 
  if(mousePressed){
     fill(197,203,198);
  ellipse(80,200,30,30);
  }
}
