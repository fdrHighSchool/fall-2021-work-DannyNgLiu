

float xpos1;
float xpos2;
float xpos3;
float xpos4;
float xpos5;
float xpos6;

void setup() {
size(400,400);
xpos1 = (290/2);
xpos2 = (290/2)+10;
xpos3 = (290/2)+20;
xpos4 = (290/2)+30;
xpos5 = (290/2)+40;
xpos6 = (290/2)+50;
}

void draw() {
int min = 200;
int max = 200;
background(0);
fill(180);
rect(25, 25, 350, 350, 28);
fill(0);
rect(55, 55, 290, 260);
noStroke();
double mx = (Math.random() * (max - min + 1) + min) * 0.4 - 290/5.0;
double mx2 = (Math.random() * (max - min + 1) + min) * 0.4 - 290/5.0;
double mx3 = (Math.random() * (max - min + 1) + min) * 0.4 - 290/5.0;
double mx4 = (Math.random() * (max - min + 1) + min) * 0.4 - 290/5.0;
double mx5 = (Math.random() * (max - min + 1) + min) * 0.4 - 290/5.0;
double mx6 = (Math.random() * (max - min + 1) + min) * 0.4 - 290/5.0;
double change1 = mx/16;
fill(237, 232, 157); //yellow
rect(xpos1,55,15,260);
fill(235, 148, 145); //red
rect(xpos2,55,15,260);
fill(93, 232, 213); //blue
rect(xpos3,55,15,260);
fill(178, 235, 167); //green
rect(xpos4,55,15,260);
fill(242, 167, 241); //pink
rect(xpos5,55,15,260);
fill(204, 240, 236); //cyan
rect(xpos6,55,15,260);
xpos1 -= change1;
xpos2 += mx2/64;
xpos3 -= mx3/16;
xpos4 -= mx4/64;
xpos5 += mx5/16;
xpos6 -= mx6/64;
//System.out.println(mouseX);
//System.out.println(mx);
System.out.println(change1);
if(xpos1 < 55)  { change1 = change1 * -2; } else if (xpos1 > 330) { change1 = change1 * 2; }
System.out.println(xpos1);
System.out.println(change1);
if(xpos2 < 55) { xpos2 =  330; }
if(xpos2 >  330) { xpos2 = 55; }
if(xpos3 < 55)  { xpos3 =  330; }
if(xpos3 >  330) { xpos3 = 55; }
if(xpos4 < 55) { xpos4 =  330; }
if(xpos4 >  330) { xpos4 = 55; }
if(xpos5 < 55) { xpos5 =  330; }
if(xpos5 >  330) { xpos5 = 55; }
if(xpos6 < 55) { xpos6 =  330; }
if(xpos6 >  330) { xpos6 = 55; }
}
