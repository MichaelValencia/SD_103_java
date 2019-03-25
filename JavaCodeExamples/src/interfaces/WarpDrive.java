package interfaces;

/**
 * Created by Edge Tech Academy on 11/11/2016.
 */
public interface WarpDrive {

    double LIGHT_SPEED = 299_792.458;
    double MAX_WARP = 9.99;
//    public float warpFactor = 0;

    void setWarpFactor(double warpFactor);
    void engage();

    default double getTimeDilationFactor(int speed)
    {
        return 1/getLorentzFactor(speed);
    }

    static double getLorentzFactor(int speed)
    {
        double velocityLightRatio = Math.pow(speed,2)/Math.pow(LIGHT_SPEED,2);
        if (velocityLightRatio > 1)
            velocityLightRatio = 1;

        return Math.sqrt(1 - velocityLightRatio);
    }
}
