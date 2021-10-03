

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
int mx = 50;
float xposmx = mx/16;
float xposmx2 = mx/16;
float xposmx3 = mx/16;
float xposmx4 = mx/16;
float xposmx5 = mx/16;
float xposmx6 = mx/16;
void draw() {

background(0);
fill(180);
rect(25, 25, 350, 350, 28);
fill(0);
rect(55, 55, 290, 260);
noStroke();
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

System.out.println(xposmx);
xpos1 -= xposmx;
xpos2 += xposmx2;
xpos3 -= xposmx3;
xpos4 -= xposmx4;
xpos5 += xposmx5;
xpos6 -= xposmx6;

if(xpos1 < 55) { xposmx = xposmx * -1; }
if(xpos1 >  330) { xposmx = xposmx * -1;}
if(xpos2 < 55)  { xposmx2 = xposmx2 * -1; }
if(xpos2 >  330) { xposmx2 = xposmx2 * -1; }
if(xpos3 < 55)  { xposmx3 =  xposmx3 * -1; }
if(xpos3 >  330) { xposmx3 = xposmx3 * -1; }
if(xpos4 < 55) { xposmx4 =  xposmx4 * -1; }
if(xpos4 >  330) { xposmx4 = xposmx4 * -1; }
if(xpos5 < 55) { xposmx5 =  xposmx5 * -1; }
if(xpos5 >  330) { xposmx5 = xposmx5 * -1; }
if(xpos6 < 55) { xposmx6 =  xposmx6 * -1; }
if(xpos6 >  330) { xposmx6 = xposmx6 * -1; }
}
