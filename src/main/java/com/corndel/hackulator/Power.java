package com.corndel.hackulator;

public class Power {

  /**
   * Raises x to the power n
   *
   * <p>power(2, 3) => 8
   */
  static double power(long x, long n) {
    // don't use ^, that is XOR
    return Math.pow(x, n);
  }
}
