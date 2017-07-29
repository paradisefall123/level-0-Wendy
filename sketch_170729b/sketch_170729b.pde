void setup() {
  size(800, 800);
}

void draw() {
  
   //2. make it a nice color
        fill(206,177,180);
   //3. if the mouse is pressed, fill the circle with a different color          
        if(mousePressed){  
         fill(212,220,247); 
         ellipse(300,500,250,250);
         fill(212,238,247);
         
        }
   //1. draw an ellipse
        ellipse(200,300,150,150);
        
}
// Copyright Wintriss Technical Schools 2013