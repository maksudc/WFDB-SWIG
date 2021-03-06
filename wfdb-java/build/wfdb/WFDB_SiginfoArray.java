/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wfdb;

public class WFDB_SiginfoArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected WFDB_SiginfoArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WFDB_SiginfoArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wfdbJNI.delete_WFDB_SiginfoArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public WFDB_SiginfoArray(int nelements) {
    this(wfdbJNI.new_WFDB_SiginfoArray(nelements), true);
  }

  public WFDB_Siginfo getitem(int index) {
    return new WFDB_Siginfo(wfdbJNI.WFDB_SiginfoArray_getitem(swigCPtr, this, index), true);
  }

  public void setitem(int index, WFDB_Siginfo value) {
    wfdbJNI.WFDB_SiginfoArray_setitem(swigCPtr, this, index, WFDB_Siginfo.getCPtr(value), value);
  }

  public WFDB_Siginfo cast() {
    long cPtr = wfdbJNI.WFDB_SiginfoArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new WFDB_Siginfo(cPtr, false);
  }

  public static WFDB_SiginfoArray frompointer(WFDB_Siginfo t) {
    long cPtr = wfdbJNI.WFDB_SiginfoArray_frompointer(WFDB_Siginfo.getCPtr(t), t);
    return (cPtr == 0) ? null : new WFDB_SiginfoArray(cPtr, false);
  }

}
