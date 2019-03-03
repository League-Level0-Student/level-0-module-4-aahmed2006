PImage donkey;
PImage tail;

void setup() {
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(550,406);
  tail.resize(125, 123);
}

void draw() {
  image(tail, mouseX, mouseY);
  noFill();
  rect(0,0,30,30);
  rect(454, 75, 40, 40);
  if(dist(0,0,mouseX, mouseY) < 30) {
    background (donkey);
} else {
  background(#050505);
}
}