import java.util.concurrent.ThreadLocalRandom;

void setup() {
size(400,400);
}

void draw() {
int min = 1;
int max = 400;
//gets a random number which is then used in a if statement, if it less than,
//all of the rectangles will flash black
int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
System.out.println(randomNumber);
background(0);
fill(180);
rect(25, 25, 350, 350, 28);
fill(0);
rect(55, 55, 290, 260);
//if statements to turn the rectangles black, it also creates the rectangles and assigns the color
if (randomNumber < 30) {
fill(255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //white
}
else {
fill(255,255,255,255);
}
rect(55,55,40,180);
if (randomNumber < 30) {
fill(255 * randomNumber/400,243 * randomNumber/400,8 * randomNumber/400,255 * randomNumber/400); //yellow
}
else {
fill(255,243,8,255);
}
rect(95,55,40,180);
if (randomNumber < 30) {
fill(0 * randomNumber/400,230 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //cyan
}
else {
fill(0,230,255,255);
}
rect(135,55,35,180);
if (randomNumber < 30) {
fill(0 * randomNumber/400,255 * randomNumber/400,30 * randomNumber/400,255 * randomNumber/400); //green
}
else {
fill(0,255,30,255);
}
rect(170,55,30,180);
if (randomNumber < 30) {
fill(255 * randomNumber/400,25 * randomNumber/400,209 * randomNumber/400,255 * randomNumber/400); //pink
}
else {
fill(255,25,209,255);
}
rect(200,55,50,180);
if (randomNumber < 30) {
fill(255 * randomNumber/400,0 * randomNumber/400,0 * randomNumber/400,255 * randomNumber/400); //red
}
else {
fill(255,0,0,255);
}
rect(250,55,50,180);
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
rect(300,55,45,180);

if (randomNumber < 30) {
fill(0 * randomNumber/400,30 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //blue
}
else {
fill(0,30,255,255);
}
rect(55,235,40,30);
if (randomNumber < 30) {
fill(13 * randomNumber/400,13 * randomNumber/400,13 * randomNumber/400,255 * randomNumber/400); //black
}
else {
fill(13,13,13,255);
}
rect(95,235,40,30);
if (randomNumber < 30) {
fill(255 * randomNumber/400,25 * randomNumber/400,209 * randomNumber/400,255 * randomNumber/400); //pink
}
else {
fill(255,25,209,255);
}
rect(135,235,35,30);
if (randomNumber < 30) {
fill(13 * randomNumber/400,13 * randomNumber/400,13 * randomNumber/400,255 * randomNumber/400); //black
}
else {
fill(13,13,13,255);
}
rect(170,235,30,30);
if (randomNumber < 30) {
fill(0 * randomNumber/400,230 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //cyan
}
else {
fill(0,230,255,255);
}
rect(200,235,50,30);
if (randomNumber < 30) {
fill(13 * randomNumber/400,13 * randomNumber/400,13 * randomNumber/400,255 * randomNumber/400); //black
}
else {
fill(13,13,13,255);
}
rect(250,235,50,30);
if (randomNumber < 30) {
fill(255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //white
}
else {
fill(255,255,255,255);
}
rect(300,235,45,30);
if (randomNumber < 30) {
fill(255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //navy
}
else {
fill(63,81,181,255);
}
rect(55,265,43,50);
if (randomNumber < 30) {
fill(255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //white
}
else {
fill(255,255,255,255);
}
rect(98,265,43,50);
if (randomNumber < 30) {
fill(111 * randomNumber/400,0 * randomNumber/400,255 * randomNumber/400,255 * randomNumber/400); //violet
}
else {
fill(111,0,255,255);
}
rect(141,265,43,50);
if (randomNumber < 30) {
fill(13 * randomNumber/400,13 * randomNumber/400,13 * randomNumber/400,255 * randomNumber/400); //black
}
else {
fill(13,13,13,255);
}
rect(184,265,100,50);
if (randomNumber < 30) {
fill(20 * randomNumber/400,20 * randomNumber/400,20 * randomNumber/400,255 * randomNumber/400); //grey
}
else {
fill(20,20,20,255);
}
rect(284,265,16,50);
if (randomNumber < 30) {
fill(13 * randomNumber/400,13 * randomNumber/400,13 * randomNumber/400,255 * randomNumber/400); //black
}
else {
fill(13,13,13,255);
}
rect(300,265,45,50);
noStroke();

}
