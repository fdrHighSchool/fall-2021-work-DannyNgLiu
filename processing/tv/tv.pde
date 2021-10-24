//variables containg the x-values of the rectangles
float xpos1;
float xpos2;
float xpos3;
float xpos4;
float xpos5;
float xpos6;
float xpos7;
float xpos8;
float xpos9;
float xpos10;
float xpos11;
float xpos12;
float xpos13;
float xpos14;

float xpos1q;
float xpos2q;
float xpos3q;
float xpos4q;
float xpos5q;
float xpos6q;
float xpos7q;
float xpos8q;
float xpos9q;
float xpos10q;
float xpos11q;
float xpos12q;
float xpos13q;
float xpos14q;

void setup() {
size(400,400);
//set the x-values to a specific place on the screen
xpos1 = (290/2)-90;
xpos2 = (290/2)-70;
xpos3 = (290/2)-50;
xpos4 = (290/2)-30;
xpos5 = (290/2)-10;
xpos6 = (290/2)+10;
xpos7 = (290/2)+30;
xpos8 = (290/2)+50;
xpos9 = (290/2)+70;
xpos10 = (290/2)+90;
xpos11 = (290/2)+110;
xpos12 = (290/2)+130;
xpos13 = (290/2)+150;
xpos14 = (290/2)+170;

xpos1q = (290/2)-90;
xpos2q = (290/2)-70;
xpos3q = (290/2)-50;
xpos4q = (290/2)-30;
xpos5q = (290/2)-10;
xpos6q = (290/2)+10;
xpos7q = (290/2)+30;
xpos8q = (290/2)+50;
xpos9q = (290/2)+70;
xpos10q = (290/2)+90;
xpos11q = (290/2)+110;
xpos12q = (290/2)+130;
xpos13q = (290/2)+150;
xpos14q = (290/2)+170;
}

int mx = 50;
float xposmx = mx/16;
float xposmx2 = mx/16;
float xposmx3 = mx/16;
float xposmx4 = mx/16;
float xposmx5 = mx/16;
float xposmx6 = mx/16;
float xposmx7 = mx/16;
float xposmx8 = mx/16;
float xposmx9 = mx/16;
float xposmx10 = mx/16;
float xposmx11 = mx/16;
float xposmx12 = mx/16;
float xposmx13 = mx/16;
float xposmx14 = mx/16;

float xposmxq = mx/16;
float xposmx2q = mx/16;
float xposmx3q = mx/16;
float xposmx4q = mx/16;
float xposmx5q = mx/16;
float xposmx6q = mx/16;
float xposmx7q = mx/16;
float xposmx8q = mx/16;
float xposmx9q = mx/16;
float xposmx10q = mx/16;
float xposmx11q = mx/16;
float xposmx12q = mx/16;
float xposmx13q = mx/16;
float xposmx14q = mx/16;
void draw() {
//making the background black and changes the color of the rectangles.
background(0);
fill(180);
rect(25, 25, 350, 350, 28);
fill(0);
rect(55, 55, 290, 260);
noStroke();
fill(255, 0, 0); //red
rect(xpos1,55,15,260);
fill(255, 136, 0); //orange
rect(xpos2,55,15,260);
fill(252, 248, 0); //yellow
rect(xpos3,55,15,260);
fill(80, 252, 0); //green
rect(xpos4,55,15,260);
fill(0, 252, 210); //cyan
rect(xpos5,55,15,260);
fill(0, 105, 252); //blue
rect(xpos6,55,15,260);
fill(86, 0, 247); //violet
rect(xpos7,55,15,260);
fill(163, 5, 247); //purple
rect(xpos8,55,15,260);
fill(247, 5, 235); //pink
rect(xpos9,55,15,260);
fill(255, 0, 0); //red
rect(xpos10,55,15,260);
fill(255, 136, 0); //orange
rect(xpos11,55,15,260);
fill(252, 248, 0); //yellow
rect(xpos12,55,15,260);
fill(80, 252, 0); //green
rect(xpos13,55,15,260);
fill(0, 252, 210); //cyan
rect(xpos14,55,15,260);

fill(255, 0, 0); //red
rect(xpos1q,55,15,260);
fill(255, 136, 0); //orange
rect(xpos2q,55,15,260);
fill(252, 248, 0); //yellow
rect(xpos3q,55,15,260);
fill(80, 252, 0); //green
rect(xpos4q,55,15,260);
fill(0, 252, 210); //cyan
rect(xpos5q,55,15,260);
fill(0, 105, 252); //blue
rect(xpos6q,55,15,260);
fill(86, 0, 247); //violet
rect(xpos7q,55,15,260);
fill(163, 5, 247); //purple
rect(xpos8q,55,15,260);
fill(247, 5, 235); //pink
rect(xpos9q,55,15,260);
fill(255, 0, 0); //red
rect(xpos10q,55,15,260);
fill(255, 136, 0); //orange
rect(xpos11q,55,15,260);
fill(252, 248, 0); //yellow
rect(xpos12q,55,15,260);
fill(80, 252, 0); //green
rect(xpos13q,55,15,260);
fill(0, 252, 210); //cyan
rect(xpos14q,55,15,260);

System.out.println(xposmx);
//changes the x-values moving the rectangles to the left or right
xpos1 += xposmx;
xpos2 += xposmx2;
xpos3 += xposmx3;
xpos4 += xposmx4;
xpos5 += xposmx5;
xpos6 += xposmx6;
xpos7 += xposmx7;
xpos8 += xposmx8;
xpos9 += xposmx9;
xpos10 += xposmx10;
xpos11 += xposmx11;
xpos12 += xposmx12;
xpos13 += xposmx13;
xpos14 += xposmx14;

xpos1q -= xposmxq;
xpos2q -= xposmx2q;
xpos3q -= xposmx3q;
xpos4q -= xposmx4q;
xpos5q -= xposmx5q;
xpos6q -= xposmx6q;
xpos7q -= xposmx7q;
xpos8q -= xposmx8q;
xpos9q -= xposmx9q;
xpos10q -= xposmx10q;
xpos11q -= xposmx11q;
xpos12q -= xposmx12q;
xpos13q -= xposmx13q;
xpos14q -= xposmx14q;
//if the rectangles are close to the edge of the screen, it bounces.
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
if(xpos7 < 55) { xposmx7 =  xposmx7 * -1; }
if(xpos7 >  330) { xposmx7 = xposmx7 * -1; }
if(xpos8 < 55) { xposmx8 =  xposmx8 * -1; }
if(xpos8 >  330) { xposmx8 = xposmx8 * -1; }
if(xpos9 < 55) { xposmx9 =  xposmx9 * -1; }
if(xpos9 >  330) { xposmx9 = xposmx9 * -1; }
if(xpos10 < 55) { xposmx10 =  xposmx10 * -1; }
if(xpos10 >  330) { xposmx10 = xposmx10 * -1; }
if(xpos11 < 55) { xposmx11 =  xposmx11 * -1; }
if(xpos11 >  330) { xposmx11 = xposmx11 * -1; }
if(xpos12 < 55) { xposmx12 =  xposmx12 * -1; }
if(xpos12 >  330) { xposmx12 = xposmx12 * -1; }
if(xpos13 < 55) { xposmx13 =  xposmx13 * -1; }
if(xpos13 >  330) { xposmx13 = xposmx13 * -1; }
if(xpos14 < 55) { xposmx14 =  xposmx14 * -1; }
if(xpos14 >  330) { xposmx14 = xposmx14 * -1; }

if(xpos1q < 55) { xposmxq = xposmxq * -1; }
if(xpos1q >  330) { xposmxq = xposmxq * -1;}
if(xpos2q < 55)  { xposmx2q = xposmx2q * -1; }
if(xpos2q >  330) { xposmx2q = xposmx2q * -1; }
if(xpos3q < 55)  { xposmx3q =  xposmx3q * -1; }
if(xpos3q >  330) { xposmx3q = xposmx3q * -1; }
if(xpos4q < 55) { xposmx4q =  xposmx4q * -1; }
if(xpos4q >  330) { xposmx4q = xposmx4q * -1; }
if(xpos5q < 55) { xposmx5q =  xposmx5q * -1; }
if(xpos5q >  330) { xposmx5q = xposmx5q * -1; }
if(xpos6q < 55) { xposmx6q =  xposmx6q * -1; }
if(xpos6q >  330) { xposmx6q = xposmx6q * -1; }
if(xpos7q < 55) { xposmx7q =  xposmx7q * -1; }
if(xpos7q >  330) { xposmx7q = xposmx7q * -1; }
if(xpos8q < 55) { xposmx8q =  xposmx8q * -1; }
if(xpos8q >  330) { xposmx8q = xposmx8q * -1; }
if(xpos9q < 55) { xposmx9q =  xposmx9q * -1; }
if(xpos9q >  330) { xposmx9q = xposmx9q * -1; }
if(xpos10q < 55) { xposmx10q =  xposmx10q * -1; }
if(xpos10q >  330) { xposmx10q = xposmx10q * -1; }
if(xpos11q < 55) { xposmx11q =  xposmx11q * -1; }
if(xpos11q >  330) { xposmx11q = xposmx11q * -1; }
if(xpos12q < 55) { xposmx12q =  xposmx12q * -1; }
if(xpos12q >  330) { xposmx12q = xposmx12q * -1; }
if(xpos13q < 55) { xposmx13q =  xposmx13q * -1; }
if(xpos13q >  330) { xposmx13q = xposmx13q * -1; }
if(xpos14q < 55) { xposmx14q =  xposmx14q * -1; }
if(xpos14q >  330) { xposmx14q = xposmx14q * -1; }
}
