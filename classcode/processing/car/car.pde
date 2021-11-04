void setup() {
  size(800, 800);
  rectMode(CENTER);
  // noStroke();
} // end setup method


void draw() {
  background(100);
  
  carV1();
  // carV2();
  
} // end draw method

void carV1() {
   // car body
   rect(width/2, height/2, 300, 100);
   
   // wheels 
   ellipse(width/2 - 100, height/2 + 60, 50, 50);
   ellipse(width/2 + 100, height/2 + 60, 50, 50);
   
   // top
   triangle(width/2 - 150, height/2 - 50, width/2 - 75, height/2 - 50, width/2 - 75, height/2 - 100);
   triangle(width/2 + 150, height/2 - 50, width/2 + 75, height/2 - 50, width/2 + 75, height/2 - 100);
   rect(width/2, height/2 - 75, 150, 50);
   
   line(275, 460, 325, 460);
   
} // end carV1 method

void carV2() {
   rect(mouseX, mouseY, 300, 100);
   ellipse(mouseX - 100, mouseY + 60, 50, 50);
   ellipse(mouseX + 100, mouseY + 60, 50, 50);
   triangle(mouseX - 150, mouseY - 50, mouseX - 75, mouseY - 50, mouseX - 75, mouseY - 100);
   triangle(mouseX + 150, mouseY - 50, mouseX + 75, mouseY - 50, mouseX + 75, mouseY - 100);
   rect(mouseX, mouseY - 75, 150, 50);
   
} // end carV2 method
