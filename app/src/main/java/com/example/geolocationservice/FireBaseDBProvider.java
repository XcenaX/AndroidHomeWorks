package com.example.geolocationservice;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FireBaseDBProvider {
    private static FirebaseDatabase database;

    static {
        if (database == null) {
            database = FirebaseDatabase.getInstance();
        }
    }

    public static void sendGeoLocation(GeoLocation geoLocation) {
        DatabaseReference ref = database.getReference("locations");
        if (ref != null) {
            ref.child(geoLocation.getId())
                    .child(geoLocation.getDateTime())
                    .setValue(geoLocation.getCoord());
        }
    }
}
