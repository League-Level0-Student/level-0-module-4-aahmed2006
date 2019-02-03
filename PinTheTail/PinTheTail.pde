PImage donkey;
PImage tail;

void setup() {
  donkey = loadImage("donkey.jpg");
  size(600,450);
  donkey.resize(600,450);
}

void draw() {
  background (donkey);
  rect(0,0,30,30);
} 