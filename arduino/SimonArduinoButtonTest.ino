// Assigning variables for button pin values 
int whiteButton  = 5;   
int redButton    = 4;   
int blueButton   = 3;   
int greenButton  = 2;   
int yellowButton = 6;   

// Assigning variables for LED pin values 
int whiteLED     = 13;
int redLED       = 12;
int blueLED      = 11;
int greenLED     = 10;
int yellowLED    = 9;

void setup() {
  // put your setup code here, to run once:

  pinMode(whiteLED, OUTPUT);
  pinMode(whiteButton, INPUT);   

  pinMode(redLED, OUTPUT);
  pinMode(redButton, INPUT);  
  
  pinMode(blueLED, OUTPUT);
  pinMode(blueButton, INPUT);

  pinMode(greenLED, OUTPUT);
  pinMode(greenButton, INPUT);

  pinMode(yellowLED, OUTPUT);
  pinMode(yellowButton, INPUT);
  
  Serial.begin(9600);
  
}

void loop() {
  // put your main code here, to run repeatedly:
  
  if (digitalRead(whiteButton) == LOW) {
    digitalWrite(whiteLED, LOW);
    Serial.println("white button pressed");
  } else {
    digitalWrite(whiteLED, HIGH);
  }

  if (digitalRead(redButton) == LOW) {
    digitalWrite(redLED, LOW);
    Serial.println("red button pressed");
  } else {
    digitalWrite(redLED, HIGH);
  }

  if (digitalRead(blueButton) == LOW) {
    digitalWrite(blueLED, LOW);
    Serial.println("blue button pressed");
  } else {
    digitalWrite(blueLED, HIGH);
  }

  if (digitalRead(greenButton) == LOW) {
    digitalWrite(greenLED, LOW);
    Serial.println("green button pressed");
  } else {
    digitalWrite(greenLED, HIGH);
  }

  if (digitalRead(yellowButton) == LOW) {
    digitalWrite(yellowLED, LOW);
    Serial.println("yellow button pressed");
  } else {
    digitalWrite(yellowLED, HIGH);
  }


}


