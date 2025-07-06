package com.example.bluetooth_print_plus;

public enum BPPState {
  BlueOn(0),
  BlueOff(1),
  DeviceConnected(2),
  DeviceDisconnected(3);

  private final int value;
  BPPState(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
