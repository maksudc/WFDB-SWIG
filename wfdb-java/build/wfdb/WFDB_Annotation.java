/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wfdb;

public class WFDB_Annotation {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected WFDB_Annotation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WFDB_Annotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wfdbJNI.delete_WFDB_Annotation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTime(int value) {
    wfdbJNI.WFDB_Annotation_time_set(swigCPtr, this, value);
  }

  public int getTime() {
    return wfdbJNI.WFDB_Annotation_time_get(swigCPtr, this);
  }

  public void setAnntyp(int value) {
    wfdbJNI.WFDB_Annotation_anntyp_set(swigCPtr, this, value);
  }

  public int getAnntyp() {
    return wfdbJNI.WFDB_Annotation_anntyp_get(swigCPtr, this);
  }

  public void setSubtyp(int value) {
    wfdbJNI.WFDB_Annotation_subtyp_set(swigCPtr, this, value);
  }

  public int getSubtyp() {
    return wfdbJNI.WFDB_Annotation_subtyp_get(swigCPtr, this);
  }

  public void setChan(int value) {
    wfdbJNI.WFDB_Annotation_chan_set(swigCPtr, this, value);
  }

  public int getChan() {
    return wfdbJNI.WFDB_Annotation_chan_get(swigCPtr, this);
  }

  public void setNum(int value) {
    wfdbJNI.WFDB_Annotation_num_set(swigCPtr, this, value);
  }

  public int getNum() {
    return wfdbJNI.WFDB_Annotation_num_get(swigCPtr, this);
  }

  public void setAux(String value) {
    wfdbJNI.WFDB_Annotation_aux_set(swigCPtr, this, value);
  }

  public String getAux() {
    return wfdbJNI.WFDB_Annotation_aux_get(swigCPtr, this);
  }

  public WFDB_Annotation() {
    this(wfdbJNI.new_WFDB_Annotation(), true);
  }

}
