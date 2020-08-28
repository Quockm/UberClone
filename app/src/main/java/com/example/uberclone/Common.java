package com.example.uberclone;

public class Common {
    public static final String DRIVER_INFO_REFERENCE = "DriverInfo" ;
    public static final String DRIVER_LOCATION_REFERENCE = "DriverLocation";

    public static DriverInfoModel currentUser;

    public static int buildWelcomeMessage() {
        if(Common.currentUser !=null)
        {
            return new StringBuilder("Welcome ")
                    .append(Common.currentUser.getFisrtnasme())
                    .append(" ")
                    .append(Common.currentUser.getLastname()).toString();
        }
        else
            return "";
    }
}
