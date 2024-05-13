
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
  
public void runF(int time){
motorLeft.setPower(1);
motorRight.setPower(1);
sleep(time);
}

public void runB(int time){
motorLeft.setPower(-1);
motorRight.setPower(-1);
sleep(time);
}

public void stop() {
motorLeft.setPower(0);
motorRight.setPower(0);
}

public void left_90(){
motorLeft.setPower(-1);
motorRight.setPower(1);
sleep(440);
stop();
}

public void right_90(){
motorLeft.setPower(1);
motorRight.setPower(-1);
sleep(440);
stop();
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
    motorLeft.setDirection(DcMotor.Direction.REVERSE);

    runF(200);
    stop();
      
    left_90();
    runF(600);
    stop();
    int blue1 = color1.blue(); // 读取第一个颜色板的蓝色值
    int red1 = color1.red(); // 读取第一个颜色板的红色值
    telemetry.addData("Blue Value (Color1)", blue1);
    telemetry.addData("Red Value (Color1)", red1);
    
    runB(1300);
    stop();
    int blue2 = color1.blue();
    int red2 = color1.red();


  // 输出读取的颜色值
    // telemetry.addData("Blue Value (Color2)", blue2);
    // telemetry.addData("Red Value (Color2)", red2);
    // telemetry.update();
    

    // telemetry.addData("Distance (cm)", distance1.getDistance(DistanceUnit.CM));
    // Put run blocks here
    while (opModeIsActive()) {
      // Put loop blocks here
      telemetry.update();
      // Put loop blocks here
      stop();
    }
  }
  
}
