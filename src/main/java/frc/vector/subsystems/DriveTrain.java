package frc.vector.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.vector.Constants;
import com.kauailabs.navx.frc.*;

public class DriveTrain extends SubsystemBase {
    private final PWMVictorSPX leftBackMotor, leftFrontMotor, rightFrontMotor, rightBackMotor;
    private double speedLeft, speedRight;


    public void setSpeedLeft(double speedLeft) {
        this.speedLeft = -speedLeft;
        leftFrontMotor.setSpeed(speedLeft);
        leftBackMotor.setSpeed(speedLeft);
    }

    public void setSpeedRight(double speedRight) {
        this.speedRight = -speedRight;
        rightFrontMotor.set(speedRight);
        rightBackMotor.setSpeed(speedRight);
    }

    public double getSpeedLeft() {
        return speedLeft;
    }

    public double getSpeedRight() {
        return speedRight;
    }

    public DriveTrain() {
        this.leftBackMotor = new PWMVictorSPX(Constants.LEFT_MOTOR_BACK);
        this.leftFrontMotor = new PWMVictorSPX(Constants.LEFT_MOTOR_FRONT);
        this.rightFrontMotor = new PWMVictorSPX(Constants.RIGHT_MOTOR_FRONT);
        this.rightBackMotor = new PWMVictorSPX(Constants.RIGHT_MOTOR_BACK);
    }
}
