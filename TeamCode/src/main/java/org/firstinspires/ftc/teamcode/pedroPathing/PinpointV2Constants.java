package org.firstinspires.ftc.teamcode.pedroPathing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.OptionalDouble;

/**
 * This is the PinpointV2Constants class. It holds many constants and parameters for the Pinpoint Localizer.
 * @author Baron Henderson - 20077 The Indubitables
 * @version 1.0, 12/24/2024
 */

@TargetApi(Build.VERSION_CODES.N)
public class PinpointV2Constants {

    /** The Y Offset of the Forward Encoder (Deadwheel) from the center of the robot in DistanceUnit
     * @see #distanceUnit
     * Default Value: 1 */
    public  double forwardPodY = 1;

    /** The X Offset of the Strafe Encoder (Deadwheel) from the center of the robot in DistanceUnit
     * @see #distanceUnit
     * Default Value: -2.5 */
    public  double strafePodX = -2.5;

    /** The Unit of Distance that the Pinpoint uses to measure distance
     * Default Value: DistanceUnit.INCH */
    public DistanceUnit distanceUnit = DistanceUnit.INCH;

    /** The name of the Pinpoint in the hardware map (name of the I2C port it is plugged into)
     * Default Value: "pinpoint" */
    public  String hardwareMapName = "pinpoint";

    /** Custom Yaw Scalar for the Pinpoint (overrides the calibration of the Pinpoint) */
    @SuppressLint("NewApi")
    public OptionalDouble yawScalar = OptionalDouble.empty();

    /** The Encoder Resolution for the Pinpoint. Used by default, but can be changed to a custom resolution.
     * Default Value: GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_4_BAR_POD */
    public GoBildaPinpointDriverV2.GoBildaOdometryPods encoderResolution = GoBildaPinpointDriverV2.GoBildaOdometryPods.goBILDA_4_BAR_POD;

    /** The Encoder Resolution for the Pinpoint. Unused by default, but can be used if you want to use a custom encoder resolution. */
    @SuppressLint("NewApi")
    public OptionalDouble customEncoderResolution = OptionalDouble.empty();

    /** The Encoder Direction for the Forward Encoder (Deadwheel)
     * Default Value: GoBildaPinpointDriver.EncoderDirection.REVERSED */
    public GoBildaPinpointDriverV2.EncoderDirection forwardEncoderDirection = GoBildaPinpointDriverV2.EncoderDirection.REVERSED;

    /** The Encoder Direction for the Strafe Encoder (Deadwheel)
     * Default Value: GoBildaPinpointDriver.EncoderDirection.FORWARD */
    public GoBildaPinpointDriverV2.EncoderDirection strafeEncoderDirection = GoBildaPinpointDriverV2.EncoderDirection.FORWARD;

    /**
     * This creates a new PinpointV2Constants with default values.
     */
    public PinpointV2Constants() {
        defaults();
    }

    public PinpointV2Constants forwardPodY(double forwardPodY) {
        this.forwardPodY = forwardPodY;
        return this;
    }

    public PinpointV2Constants strafePodX(double strafePodX) {
        this.strafePodX = strafePodX;
        return this;
    }

    public PinpointV2Constants distanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    public PinpointV2Constants hardwareMapName(String hardwareMapName) {
        this.hardwareMapName = hardwareMapName;
        return this;
    }

    public PinpointV2Constants yawScalar(double yawScalar) {
        this.yawScalar = OptionalDouble.of(yawScalar);
        return this;
    }

    public PinpointV2Constants encoderResolution(GoBildaPinpointDriverV2.GoBildaOdometryPods encoderResolution) {
        this.encoderResolution = encoderResolution;
        return this;
    }

    public PinpointV2Constants customEncoderResolution(double customEncoderResolution) {
        this.customEncoderResolution = OptionalDouble.of(customEncoderResolution);
        return this;
    }

    public PinpointV2Constants forwardEncoderDirection(GoBildaPinpointDriverV2.EncoderDirection forwardEncoderDirection) {
        this.forwardEncoderDirection = forwardEncoderDirection;
        return this;
    }

    public PinpointV2Constants strafeEncoderDirection(GoBildaPinpointDriverV2.EncoderDirection strafeEncoderDirection) {
        this.strafeEncoderDirection = strafeEncoderDirection;
        return this;
    }

    public void defaults() {
        forwardPodY = 1;
        strafePodX = -2.5;
        distanceUnit = DistanceUnit.INCH;
        hardwareMapName = "pinpoint";
        yawScalar = OptionalDouble.empty();
        encoderResolution = GoBildaPinpointDriverV2.GoBildaOdometryPods.goBILDA_4_BAR_POD;
        customEncoderResolution = OptionalDouble.empty();
        forwardEncoderDirection = GoBildaPinpointDriverV2.EncoderDirection.REVERSED;
        strafeEncoderDirection = GoBildaPinpointDriverV2.EncoderDirection.FORWARD;
    }
}
