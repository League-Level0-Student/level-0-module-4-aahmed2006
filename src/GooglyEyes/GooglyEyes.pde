void setup() {
PImage face = loadImage("spongebob.jpg");
size(400, 250);
face.resize(width, height);
background(face);
}

void draw() {
 fill(#FFFFFF);
 ellipse(114, 128, 48, 36);
 ellipse(210, 128, 48, 36);
 fill(#050505);
 ellipse(mouseX, mouseY, 15, 15);
 ellipse(mouseX+96, mouseY, 15, 15);
}