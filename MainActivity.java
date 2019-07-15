// Prepare Turtle to Draw
hide();
penUp();

// First draw the background
drawBackground();

// Draw all the fish
moveTo(100,100);
drawFish(randomNumber(10, 30));
moveTo(200, 200);
drawFish(200, 255, 1, 182);

//Draw all the Starfish
moveTo(150,400);
drawStarfish(randomNumber(10, 30));
moveTo(50, 420);
drawStarfish(60);

// Draw all the seagrass on bottom of screen
moveTo(50,450);
turnTo(0);
drawSeagrass(randomNumber(10, 30));
moveTo(100, 450);
turnTo(0);
drawSeagrass(randomNumber(2, 20));

// Make the background by drawing a large dot
function drawBackground(){
  penColor("DarkBlue");
  dot(1000);
}

// Draw a five pointed star with a wide pen.
function drawStarfish(size){
  // Setting up the pen
  penRGB(red,green,blue);
  penWidth(20);
  penDown();
  
  turnTo(0);
  moveForward(60);
  turnRight(144);
  moveForward(60);
  turnRight(144);
  moveForward(60);
  turnRight(144);
  moveForward(60);
  turnRight(144);
  moveForward(60);
  turnRight(144);
  penUp();
}

// Switches between left and right arcs to make sea grass
function drawSeagrass(arcSize){
  // Setting up the pen
  penRGB(red,green,blue);
  penWidth(10);
  penDown();
  
  // Draw four arcs to make grass
  arcLeft(30,100);
  arcRight(60,100);
  arcLeft(60,100);
  arcRight(60,100);
  
  penUp();
}

// Draw a single fish at current turtle location
function drawFish(size, red, green, blue){
  // Setting up the pen
   penRGB(0,0,0);
  penWidth(30);
  penDown();
  
  // Fish body
  dot(30);
  turnTo(90);
  moveForward(30);
  
  // Fish tail
  turnLeft(30);
  moveForward(30);
  turnRight(120);
  moveForward(30);
  turnRight(120);
  moveForward(30);
  turnRight(120);
  
  penUp();
}
