import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lau on 11/15/2017.
 */

public class DeliveryPackage {

    public String targetLocation;
    public int targetDistance;
    public double packageValue;
    public Date deliveryDate;

    public DeliveryPackage(String targetLocation, int targetDistance, double packageValue, Date deliveryDate) {
        this.targetLocation = targetLocation;
        this.targetDistance = targetDistance;
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public int getTargetDistance() {
        return targetDistance;
    }

    public double getPackageValue() {
        return packageValue;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }


//    SimpleDateFormat parser=new SimpleDateFormat("YYYY-MM-DD");

    @Override
    public String toString() {
        return String.format("Package{" +
                "targetLocation=" + targetLocation  +
                ", targetDistance=" + targetDistance +
                ", packageValue=" + packageValue +
                ", deliveryDate=" + (new SimpleDateFormat("yyyy-MM-dd").format(deliveryDate)) +
                "}\n");
    }



}
