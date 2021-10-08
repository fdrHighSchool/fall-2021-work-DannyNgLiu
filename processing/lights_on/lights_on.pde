float speedOfDash = 3;

float minusOne = 500;

float timer = 1;
float timer2 = 1;

float dash1 = 40;
float dash1q = 35;
float dash1w = 85;
float dash1e = 90;

float dash2 = 130;
float dash2q = 125;
float dash2w = 175;
float dash2e = 180;

float dash3 = 220;
float dash3q = 215;
float dash3w = 265;
float dash3e = 270;

float dash4 = 310;
float dash4q = 305;
float dash4w = 355;
float dash4e = 360;

float dash5 = 410;
float dash5q = 405;
float dash5w = 455;
float dash5e = 460;

float a = 157;
float b = 211;
float c = 245;
float d = 255;

void setup() {
  size(400,400);
}

void draw() {
  

minusOne -= 1;

if (minusOne < 0) {
  background(0);
 timer = timer*1.001;
 //System.out.println(minusOne);
 System.out.println(timer);
if(timer > 2) {
  System.out.println(d);
  if(d < 255) {
  a = a*1.005;
  b = b*1.005;
  c = c*1.005;
  d = d*1.005; 
  //System.out.println("got here");
  background(a,b,c,d);
 } else {
    a = 157;
    b = 211;
    c = 245;
    d = 255;
  background(a,b,c,d);
  System.out.println(timer2);
  timer2 = timer2*1.001;
  if(timer2 > 2) {
    timer = 1;
    timer2 = 1;
    minusOne = 500;
    a = 157;
    b = 211;
    c = 245;
    d = 255;
  }
 }

}

} else {
  a = a*0.995;
  b = b*0.995;
  c = c*0.995;
  d = d*0.995;
  background(a,b,c,d);
}

  fill(85,81,72,255);
  rect(0,260,400,60);
  fill(241,202,34);
  quad(dash1, 295, dash1q, 285, dash1w, 285, dash1e, 295);
  quad(dash2, 295, dash2q, 285, dash2w, 285, dash2e, 295);
  quad(dash3, 295, dash3q, 285, dash3w, 285, dash3e, 295);
  quad(dash4, 295, dash4q, 285, dash4w, 285, dash4e, 295);
  quad(dash5, 295, dash5q, 285, dash5w, 285, dash5e, 295);
  
dash1 -= speedOfDash;
dash1q -= speedOfDash;
dash1w -= speedOfDash;
dash1e -= speedOfDash;

dash2 -= speedOfDash;
dash2q -= speedOfDash;
dash2w -= speedOfDash;
dash2e -= speedOfDash;

dash3 -= speedOfDash;
dash3q -= speedOfDash;
dash3w -= speedOfDash;
dash3e -= speedOfDash;

dash4 -= speedOfDash;
dash4q -= speedOfDash;
dash4w -= speedOfDash;
dash4e -= speedOfDash;

dash5 -= speedOfDash;
dash5q -= speedOfDash;
dash5w -= speedOfDash;
dash5e -= speedOfDash;

if (dash1e < 0) {
dash1 = 410;
dash1q = 405;
dash1w = 455;
dash1e = 460;
  }

if (dash2e < 0) {
dash2 = 410;
dash2q = 405;
dash2w = 455;
dash2e = 460;
  }

if (dash3e < 0) {
dash3 = 410;
dash3q = 405;
dash3w = 455;
dash3e = 460;
  }

if (dash4e < 0) {
dash4 = 410;
dash4q = 405;
dash4w = 455;
dash4e = 460;
  }
  
if (dash5e < 0) {
dash5 = 410;
dash5q = 405;
dash5w = 455;
dash5e = 460;
  }  
  
car1();
}

void car1() {
//body
fill(166,39,42);
rect(80,245,140,25,5);
//wheels
fill(1);
arc(100, 270, 25, 25, PI, PI+TWO_PI);
fill(56,44,46,255);
arc(100, 270, 20, 20, PI, PI+TWO_PI);
fill(1);
arc(200, 270, 25, 25, PI, PI+TWO_PI);
fill(56,44,46,255);
arc(200, 270, 20, 20, PI, PI+TWO_PI);
//roof
fill(166,39,42);
noStroke();
triangle(95, 245, 125, 230, 125, 245);
triangle(160 ,245, 160, 230, 190, 245);
rect(125,230,35,15);
rect(125,245,35,25);
fill(202,227,243,255);
triangle(100, 245, 130, 230, 130, 245);
triangle(155 ,245, 155, 230, 185, 245);
rect(138,231,17,14);
rect(130,231,5,14);
ellipse(218,250,5,10);
if(d < 70) {
  fill(217,182,117,255);
  ellipse(218,250,5,10);
  rect(223,249, 5, 2);
  translate(222,244);
  rotate(TWO_PI - PI*3/18);
  rect(0,0, 5, 2);
  rotate(PI*6/18);
  rect(6,8, 5, 2);
}else {
  fill(146,158,167);
  ellipse(218,250,5,10);
}
}
