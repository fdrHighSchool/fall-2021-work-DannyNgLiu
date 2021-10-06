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

void setup() {
  size(400,400);
}

void draw() {
  background(157,211,245,255);
  fill(85,81,72,255);
  rect(0,260,400,60);
  fill(241,202,34);
  quad(dash1, 295, dash1q, 285, dash1w, 285, dash1e, 295);
  quad(dash2, 295, dash2q, 285, dash2w, 285, dash2e, 295);
  quad(dash3, 295, dash3q, 285, dash3w, 285, dash3e, 295);
  quad(dash4, 295, dash4q, 285, dash4w, 285, dash4e, 295);
  quad(dash5, 295, dash5q, 285, dash5w, 285, dash5e, 295);
dash1 -= 4;
dash1q -= 4;
dash1w -= 4;
dash1e -= 4;

dash2 -= 4;
dash2q -= 4;
dash2w -= 4;
dash2e -= 4;

dash3 -= 4;
dash3q -= 4;
dash3w -= 4;
dash3e -= 4;

dash4 -= 4;
dash4q -= 4;
dash4w -= 4;
dash4e -= 4;

dash5 -= 4;
dash5q -= 4;
dash5w -= 4;
dash5e -= 4;

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
}
