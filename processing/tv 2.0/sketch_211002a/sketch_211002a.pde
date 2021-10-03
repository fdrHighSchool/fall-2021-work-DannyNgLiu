import java.util.concurrent.ThreadLocalRandom;

void setup() {
size(400,400);
}

void draw() {
int min = 1;
int max = 400;
int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
System.out.println(randomNumber);
background(0);
fill(180);
rect(25, 25, 350, 350, 28);
fill(0);
rect(55, 55, 290, 260);
if (randomNumber < 30) {
fill(255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //white
}
else {
fill(255,255,255,255);
}
rect(55,55,40,170);
if (randomNumber < 30) {
fill(255 * randomNumber/400,243 * randomNumber/400,8 * randomNumber/400,255 * randomNumber/400); //yellow
}
else {
fill(255,243,8,255);
}
rect(95,55,40,170);
if (randomNumber < 30) {
fill(0 * randomNumber/400,230 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //cyan
}
else {
fill(0,230,255,255);
}
rect(135,55,35,170);
if (randomNumber < 30) {
fill(0 * randomNumber/400,255 * randomNumber/400,30 * randomNumber/400,255 * randomNumber/400); //green
}
else {
fill(0,255,30,255);
}
rect(170,55,30,170);
if (randomNumber < 30) {
fill(255 * randomNumber/400,25 * randomNumber/400,209 * randomNumber/400,255 * randomNumber/400); //pink
}
else {
fill(255,25,209,255);
}
rect(200,55,50,170);
if (randomNumber < 30) {
fill(255 * randomNumber/400,0 * randomNumber/400,0 * randomNumber/400,255 * randomNumber/400); //red
}
else {
fill(255,0,0,255);
}
rect(250,55,50,170);
if (randomNumber < 30) {
fill(0 * randomNumber/400,30 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //blue
}
else {
fill(0,30,255,255);
}
if (randomNumber < 30) {
fill(0 * randomNumber/400,30 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //blue
}
else {
fill(0,30,255,255);
}
rect(300,55,45,170);





noStroke();

}
