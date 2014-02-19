/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wfdb;

public class WFDB_Calinfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected WFDB_Calinfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WFDB_Calinfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wfdbJNI.delete_WFDB_Calinfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLow(double value) {
    wfdbJNI.WFDB_Calinfo_low_set(swigCPtr, this, value);
  }

  public double getLow() {
    return wfdbJNI.WFDB_Calinfo_low_get(swigCPtr, this);
  }

  public void setHigh(double value) {
    wfdbJNI.WFDB_Calinfo_high_set(swigCPtr, this, value);
  }

  public double getHigh() {
    return wfdbJNI.WFDB_Calinfo_high_get(swigCPtr, this);
  }

  public void setScale(double value) {
    wfdbJNI.WFDB_Calinfo_scale_set(swigCPtr, this, value);
  }

  public double getScale() {
    return wfdbJNI.WFDB_Calinfo_scale_get(swigCPtr, this);
  }

  public void setSigtype(String value) {
    wfdbJNI.WFDB_Calinfo_sigtype_set(swigCPtr, this, value);
  }

  public String getSigtype() {
    return wfdbJNI.WFDB_Calinfo_sigtype_get(swigCPtr, this);
  }

  public void setUnits(String value) {
    wfdbJNI.WFDB_Calinfo_units_set(swigCPtr, this, value);
  }

  public String getUnits() {
    return wfdbJNI.WFDB_Calinfo_units_get(swigCPtr, this);
  }

  public void setCaltype(int value) {
    wfdbJNI.WFDB_Calinfo_caltype_set(swigCPtr, this, value);
  }

  public int getCaltype() {
    return wfdbJNI.WFDB_Calinfo_caltype_get(swigCPtr, this);
  }

  public WFDB_Calinfo() {
    this(wfdbJNI.new_WFDB_Calinfo(), true);
  }

}
