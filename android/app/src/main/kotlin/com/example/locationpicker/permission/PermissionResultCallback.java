package com.example.locationpicker.permission;

@FunctionalInterface
public interface PermissionResultCallback {
  void onResult(LocationPermission permission);
}
