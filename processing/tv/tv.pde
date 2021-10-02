float xpos1;
float xpos2;
float xpos3;
float xpos4; 

void setup() {
size(400,400);
xpos1 = (290/2);
xpos2 = (290/2)+20;
xpos3 = (290/2)+40;
xpos4 = (290/2)+60;
}

void draw() {
background(0);
fill(180);
rect(25, 25, 350, 350, 28);
fill(0);
rect(55, 55, 290, 260);
noStroke();
float mx = mouseX * 0.4 - 290/5.0;
fill(237, 232, 157); //yellow
rect(xpos1,55,15,260);
fill(235, 148, 145); //red
rect(xpos2,55,15,260);
fill(93, 232, 213); //blue
rect(xpos3,55,15,260);
fill(178, 235, 167); //green
rect(xpos4,55,15,260);
xpos1 += mx/16;
xpos2 += mx/64;
xpos3 -= mx/16;
xpos4 -= mx/64;
System.out.println(mouseX);
//System.out.println(mx);
System.out.println(xpos1);
if(xpos1 < 55)  { xpos1 = 55; }
if(xpos1 >  330) { xpos1 = 330; }
if(xpos2 < 55) { xpos2 =  330; }
if(xpos2 >  330) { xpos2 = 55; }
if(xpos3 < 55)  { xpos3 =  330; }
if(xpos3 >  330) { xpos3 = 55; }
if(xpos4 < 55) { xpos4 =  330; }
if(xpos4 >  330) { xpos4 = 55; }
}
