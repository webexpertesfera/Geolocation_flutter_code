package com.example.locationpicker.location;


import com.example.locationpicker.errors.ErrorCodes;

import io.flutter.plugin.common.MethodChannel;

public interface LocationServiceListener {
  void onLocationServiceResult(boolean isEnabled);

  void onLocationServiceError(ErrorCodes errorCode);
}
