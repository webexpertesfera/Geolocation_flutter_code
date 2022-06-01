package com.example.locationpicker.errors;

@FunctionalInterface
public interface ErrorCallback {
  void onError(ErrorCodes errorCode);
}
