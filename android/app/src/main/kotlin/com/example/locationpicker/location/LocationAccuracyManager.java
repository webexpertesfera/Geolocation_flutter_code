package com.example.locationpicker.location;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

import com.example.locationpicker.errors.ErrorCallback;
import com.example.locationpicker.errors.ErrorCodes;


public class LocationAccuracyManager {

  public LocationAccuracyStatus getLocationAccuracy(Context context, ErrorCallback errorCallback) {
    if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
        == PackageManager.PERMISSION_GRANTED) {
      return LocationAccuracyStatus.precise;
    } else if (ContextCompat.checkSelfPermission(
            context, Manifest.permission.ACCESS_COARSE_LOCATION)
        == PackageManager.PERMISSION_GRANTED) {
      return LocationAccuracyStatus.reduced;
    } else {
      errorCallback.onError(ErrorCodes.permissionDenied);
      return null;
    }
  }
}
