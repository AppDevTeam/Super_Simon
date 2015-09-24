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

//int currentLED   = 0;
int ledCode = 0;
int duration = 0;
//String data;
//double duration, preDecimal, postDecimal;
//boolean decimal = false; 
//double decimalPlaces = 1;

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

  ledTest();

  readLED();
}

void readLED() {

  while (Serial.available() > 0) {
    ledCode = Serial.parseInt();
    duration = Serial.parseInt();
  
    Serial.print("LEDCode: ");
    Serial.println(ledCode);
    Serial.print("Duration: ");
    Serial.println(duration);
    
    Serial.println("Calling lightLED()");
    lightLED(ledCode, duration);
  }
}

void lightLED(int color, double duration) {
  switch (color) {
      case 1:
        // Turn on white LED
        digitalWrite(whiteLED, HIGH);
        Serial.println("White LED is ON");
        break;
      case 2:
        // Turn on red LED
        digitalWrite(redLED, HIGH);
        Serial.println("Red LED is ON");
        break;
      case 3:
        // Turn on blue LED
        digitalWrite(blueLED, HIGH);
        Serial.println("Blue LED is ON");
        break;
      case 4:
        // Turn on green LED
        digitalWrite(greenLED, HIGH);
        Serial.println("Green LED is ON");
        break;
      case 5:
        // Turn on yellow LED
        digitalWrite(yellowLED, HIGH);
        Serial.println("Yellow LED is ON");
        break;
      default: 
        // Turn off all LEDs
        digitalWrite(whiteLED, LOW);
        digitalWrite(greenLED, LOW);
        digitalWrite(blueLED, LOW);
        digitalWrite(redLED, LOW);
        digitalWrite(yellowLED, LOW);
        break;
    }
        
    delay(duration);
    digitalWrite(whiteLED, LOW);
    digitalWrite(greenLED, LOW);
    digitalWrite(blueLED, LOW);
    digitalWrite(redLED, LOW);
    digitalWrite(yellowLED, LOW);
}

void ledTest() {
  if (digitalRead(whiteButton) == HIGH) {
    digitalWrite(whiteLED, LOW);
  } else {
    digitalWrite(whiteLED, HIGH);
    Serial.println("white button pressed");
  }

  if (digitalRead(redButton) == HIGH) {
    digitalWrite(redLED, LOW);
  } else {
    digitalWrite(redLED, HIGH);
    Serial.println("red button pressed");
  }

  if (digitalRead(blueButton) == HIGH) {
    digitalWrite(blueLED, LOW);
  } else {
    digitalWrite(blueLED, HIGH);
    Serial.println("blue button pressed");
  }

  if (digitalRead(greenButton) == HIGH) {
    digitalWrite(greenLED, LOW);
  } else {
    digitalWrite(greenLED, HIGH);
    Serial.println("green button pressed");
  }

  if (digitalRead(yellowButton) == HIGH) {
    digitalWrite(yellowLED, LOW);
  } else {
    digitalWrite(yellowLED, HIGH);
    Serial.println("yellow button pressed");
  }
}


