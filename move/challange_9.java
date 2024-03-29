
/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       |
* on our discord channel! https://discord.gg/e7nVjMM                   *
* Only BLOCKS code is submitted when in Arena                          *
*                                                                      *
***********************************************************************/


public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor frontLeft;
    DcMotor frontRight;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;
    
public void turnRight(int time) {
    motorLeft.setPower(-1);
    motorRight.setPower(-1);
    sleep(time);
}    
    
public void slowLeft(int time) {
    motorLeft.setPower(-0.5);
    motorRight.setPower(1);
    sleep(time);
}

public void nomalLeft(int time) {
    motorLeft.setPower(0);
    motorRight.setPower(1); 
    sleep(time);
}

public void festlLeft(int time) {
    motorLeft.setPower(1);
    motorRight.setPower(1); 
    sleep(time);
}

public void goFast(int time) {
    motorLeft.setPower(-1);
    motorRight.setPower(1); 
    sleep(time);
}

public void stop() {
    motorLeft.setPower(0);
    motorRight.setPower(0); 
}

@Override
    public void runOpMode() {
      motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
      motorRight = hardwareMap.get(DcMotor.class, "motorRight");
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      color1 = hardwareMap.get(ColorSensor.class, "color1");
      distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
      imu = hardwareMap.get(BNO055IMU.class, "imu");
      // Put initialization blocks here
      waitForStart();
      // Put run blocks here
      turnRight(400);
      slowLeft(800);
        
      nomalLeft(1600);
        
      festlLeft(80);
        
      goFast(100);
        
      festlLeft(800);
        
      goFast(800);
        
      festlLeft(500);
        
      goFast(900);
        
      stop();
        
        
      while (opModeIsActive()) {
        // Put loop blocks here
      }
    }
    
}
