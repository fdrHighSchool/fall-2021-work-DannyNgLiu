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


if (dash1e < 0) {
dash1 = 310;
dash1q = 305;
dash1w = 355;
dash1e = 360;
  }

if (dash2e < 0) {
dash2 = 310;
dash2q = 305;
dash2w = 355;
dash2e = 360;
  }

if (dash3e < 0) {
dash3 = 310;
dash3q = 305;
dash3w = 355;
dash3e = 360;
  }

if (dash4e < 0) {
dash4 = 310;
dash4q = 305;
dash4w = 355;
dash4e = 360;
  }
  
  
}
