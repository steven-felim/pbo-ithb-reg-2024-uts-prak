package model.classes;

public class Vendor {
    private String vendorName;
    private String serviceType;
    private double vendorFee;

    public String getVendorDetails() {
        return "Vendor Name\t: " + vendorName + "\nService Type\t: " + serviceType + "\nVendor Fee\t: " + vendorFee;
    }
}
