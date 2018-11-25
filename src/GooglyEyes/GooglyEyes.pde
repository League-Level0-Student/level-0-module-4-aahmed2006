void setup() {
PImage face = loadImage("spongebob.jpg");
size(800, 500);
face.resize(width, height);
background(face);
}

void draw() {
 fill(#FFFFFF);
 ellipse(227, 255, 88, 76);
 fill(#050505);
 ellipse(mouseX, mouseY, 20, 20);
}
