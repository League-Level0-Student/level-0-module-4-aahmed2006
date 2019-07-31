int x = 0;
void setup() {
  size(400, 400);
  background(00000);
}

void draw() {
  if(x > width) {
  }
  ellipse(0, 0, width, height); 
  rect(mouseX, mouseY, 100, 50);
  
}
