package com.example.locationpicker.location;

import android.location.Location;

@FunctionalInterface
public interface PositionChangedCallback {
  void onPositionChanged(Location location);
}
