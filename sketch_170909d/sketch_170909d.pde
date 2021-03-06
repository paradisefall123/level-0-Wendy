

void setup() {
  size(500, 500);
  fill(237, 196, 120);
  ellipse(250, 250, 400, 400);
  fill(229, 46, 9);
  ellipse(250, 250, 350, 350);
  fill(255, 233, 103);
  ellipse(250, 250, 290, 290);
}
void draw() {
  PImage pepperoni = loadImage("pepperoni.jpg");
  PImage pineapple = loadImage("pineapple.jpg");

  if (mousePressed) {
    pepperoni.resize(40, 40);
    image(pepperoni, mouseX+50, mouseY);
    pineapple.resize(40, 40);
    image(pineapple, mouseX, mouseY);
  }
}