/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.melissadata;

public class mdIpLocator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public mdIpLocator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(mdIpLocator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mdIpLocatorJavaWrapperJNI.delete_mdIpLocator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public mdIpLocator() {
    this(mdIpLocatorJavaWrapperJNI.new_mdIpLocator(), true);
  }

  public mdIpLocator.ProgramStatus InitializeDataFiles() {
    return mdIpLocator.ProgramStatus.swigToEnum(mdIpLocatorJavaWrapperJNI.mdIpLocator_InitializeDataFiles(swigCPtr, this));
  }

  public void SetPathToIpLocatorFiles(String arg0) {
    mdIpLocatorJavaWrapperJNI.mdIpLocator_SetPathToIpLocatorFiles(swigCPtr, this, arg0);
  }

  public String GetInitializeErrorString() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetInitializeErrorString(swigCPtr, this);
  }

  public boolean SetLicenseString(String arg0) {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_SetLicenseString(swigCPtr, this, arg0);
  }

  public String GetBuildNumber() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetBuildNumber(swigCPtr, this);
  }

  public String GetDatabaseDate() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetDatabaseDate(swigCPtr, this);
  }

  public String GetDatabaseExpirationDate() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetDatabaseExpirationDate(swigCPtr, this);
  }

  public String GetLicenseStringExpirationDate() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetLicenseStringExpirationDate(swigCPtr, this);
  }

  public boolean LocateIpAddress(String arg0) {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_LocateIpAddress(swigCPtr, this, arg0);
  }

  public String GetCity() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetCity(swigCPtr, this);
  }

  public String GetCountry() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetCountry(swigCPtr, this);
  }

  public String GetCountryAbbreviation() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetCountryAbbreviation(swigCPtr, this);
  }

  public String GetDomainName() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetDomainName(swigCPtr, this);
  }

  public String GetISP() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetISP(swigCPtr, this);
  }

  public String GetLongitude() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetLongitude(swigCPtr, this);
  }

  public String GetLatitude() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetLatitude(swigCPtr, this);
  }

  public String GetRegion() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetRegion(swigCPtr, this);
  }

  public String GetZip() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetZip(swigCPtr, this);
  }

  public String GetResults() {
    return mdIpLocatorJavaWrapperJNI.mdIpLocator_GetResults(swigCPtr, this);
  }

  public final static class ProgramStatus {
    public final static ProgramStatus ErrorNone = new ProgramStatus("ErrorNone", mdIpLocatorJavaWrapperJNI.mdIpLocator_ErrorNone_get());
    public final static ProgramStatus ErrorOther = new ProgramStatus("ErrorOther");
    public final static ProgramStatus ErrorOutOfMemory = new ProgramStatus("ErrorOutOfMemory");
    public final static ProgramStatus ErrorRequiredFileNotFound = new ProgramStatus("ErrorRequiredFileNotFound");
    public final static ProgramStatus ErrorFoundOldFile = new ProgramStatus("ErrorFoundOldFile");
    public final static ProgramStatus ErrorDatabaseExpired = new ProgramStatus("ErrorDatabaseExpired");
    public final static ProgramStatus ErrorLicenseExpired = new ProgramStatus("ErrorLicenseExpired");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ProgramStatus swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ProgramStatus.class + " with value " + swigValue);
    }

    private ProgramStatus(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ProgramStatus(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ProgramStatus(String swigName, ProgramStatus swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ProgramStatus[] swigValues = { ErrorNone, ErrorOther, ErrorOutOfMemory, ErrorRequiredFileNotFound, ErrorFoundOldFile, ErrorDatabaseExpired, ErrorLicenseExpired };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class AccessType {
    public final static AccessType Local = new AccessType("Local", mdIpLocatorJavaWrapperJNI.mdIpLocator_Local_get());
    public final static AccessType Remote = new AccessType("Remote");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AccessType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AccessType.class + " with value " + swigValue);
    }

    private AccessType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AccessType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AccessType(String swigName, AccessType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AccessType[] swigValues = { Local, Remote };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class DiacriticsMode {
    public final static DiacriticsMode Auto = new DiacriticsMode("Auto", mdIpLocatorJavaWrapperJNI.mdIpLocator_Auto_get());
    public final static DiacriticsMode On = new DiacriticsMode("On");
    public final static DiacriticsMode Off = new DiacriticsMode("Off");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static DiacriticsMode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + DiacriticsMode.class + " with value " + swigValue);
    }

    private DiacriticsMode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private DiacriticsMode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private DiacriticsMode(String swigName, DiacriticsMode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static DiacriticsMode[] swigValues = { Auto, On, Off };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class SortationCode {
    public final static SortationCode FCM_LTR_AUTO_NONAUTO = new SortationCode("FCM_LTR_AUTO_NONAUTO", mdIpLocatorJavaWrapperJNI.mdIpLocator_FCM_LTR_AUTO_NONAUTO_get());
    public final static SortationCode FCM_LTR_AUTO = new SortationCode("FCM_LTR_AUTO");
    public final static SortationCode FCM_LTR_NONAUTO = new SortationCode("FCM_LTR_NONAUTO");
    public final static SortationCode FCM_LTR_NONMACH = new SortationCode("FCM_LTR_NONMACH");
    public final static SortationCode FCM_POSTCARD_AUTO_NONAUTO = new SortationCode("FCM_POSTCARD_AUTO_NONAUTO", mdIpLocatorJavaWrapperJNI.mdIpLocator_FCM_POSTCARD_AUTO_NONAUTO_get());
    public final static SortationCode FCM_POSTCARD_AUTO = new SortationCode("FCM_POSTCARD_AUTO");
    public final static SortationCode FCM_POSTCARD_NONAUTO = new SortationCode("FCM_POSTCARD_NONAUTO");
    public final static SortationCode FCM_FLAT_COTRAY = new SortationCode("FCM_FLAT_COTRAY", mdIpLocatorJavaWrapperJNI.mdIpLocator_FCM_FLAT_COTRAY_get());
    public final static SortationCode FCM_FLAT_AUTO = new SortationCode("FCM_FLAT_AUTO");
    public final static SortationCode FCM_FLAT_NONAUTO = new SortationCode("FCM_FLAT_NONAUTO");
    public final static SortationCode FCM_FLAT_DISABLE_COTRAY = new SortationCode("FCM_FLAT_DISABLE_COTRAY");
    public final static SortationCode FCM_FLAT_COTRAY_FSM1000 = new SortationCode("FCM_FLAT_COTRAY_FSM1000");
    public final static SortationCode FCM_FLAT_DISABLE_COTRAY_FSM1000 = new SortationCode("FCM_FLAT_DISABLE_COTRAY_FSM1000");
    public final static SortationCode FCM_FLAT_AUTO_FSM1000 = new SortationCode("FCM_FLAT_AUTO_FSM1000");
    public final static SortationCode FCM_FLAT_NONAUTO_FSM1000 = new SortationCode("FCM_FLAT_NONAUTO_FSM1000");
    public final static SortationCode STD_LTR_ECRRT_AUTO_NONAUTO = new SortationCode("STD_LTR_ECRRT_AUTO_NONAUTO", mdIpLocatorJavaWrapperJNI.mdIpLocator_STD_LTR_ECRRT_AUTO_NONAUTO_get());
    public final static SortationCode STD_LTR_ECRRT_NONAUTO = new SortationCode("STD_LTR_ECRRT_NONAUTO");
    public final static SortationCode STD_LTR_AUTO_NONAUTO = new SortationCode("STD_LTR_AUTO_NONAUTO");
    public final static SortationCode STD_LTR_AUTO = new SortationCode("STD_LTR_AUTO");
    public final static SortationCode STD_LTR_NONAUTO = new SortationCode("STD_LTR_NONAUTO");
    public final static SortationCode STD_LTR_NONMACH = new SortationCode("STD_LTR_NONMACH");
    public final static SortationCode STD_LTR_ECRRT_NONMACH = new SortationCode("STD_LTR_ECRRT_NONMACH");
    public final static SortationCode STD_FLAT_ECRRT_COSACK = new SortationCode("STD_FLAT_ECRRT_COSACK", mdIpLocatorJavaWrapperJNI.mdIpLocator_STD_FLAT_ECRRT_COSACK_get());
    public final static SortationCode STD_FLAT_ECRRT_DISABLE_COSACK = new SortationCode("STD_FLAT_ECRRT_DISABLE_COSACK");
    public final static SortationCode STD_FLAT_COSACK = new SortationCode("STD_FLAT_COSACK");
    public final static SortationCode STD_FLAT_DISABLE_COSACK = new SortationCode("STD_FLAT_DISABLE_COSACK");
    public final static SortationCode STD_FLAT_AUTO = new SortationCode("STD_FLAT_AUTO");
    public final static SortationCode STD_FLAT_NONAUTO = new SortationCode("STD_FLAT_NONAUTO");
    public final static SortationCode STD_FLAT_ECRRT_AUTO = new SortationCode("STD_FLAT_ECRRT_AUTO");
    public final static SortationCode STD_FLAT_ECRRT_NONAUTO = new SortationCode("STD_FLAT_ECRRT_NONAUTO");
    public final static SortationCode RESIDUALS_LEFT = new SortationCode("RESIDUALS_LEFT", mdIpLocatorJavaWrapperJNI.mdIpLocator_RESIDUALS_LEFT_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static SortationCode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + SortationCode.class + " with value " + swigValue);
    }

    private SortationCode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private SortationCode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private SortationCode(String swigName, SortationCode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static SortationCode[] swigValues = { FCM_LTR_AUTO_NONAUTO, FCM_LTR_AUTO, FCM_LTR_NONAUTO, FCM_LTR_NONMACH, FCM_POSTCARD_AUTO_NONAUTO, FCM_POSTCARD_AUTO, FCM_POSTCARD_NONAUTO, FCM_FLAT_COTRAY, FCM_FLAT_AUTO, FCM_FLAT_NONAUTO, FCM_FLAT_DISABLE_COTRAY, FCM_FLAT_COTRAY_FSM1000, FCM_FLAT_DISABLE_COTRAY_FSM1000, FCM_FLAT_AUTO_FSM1000, FCM_FLAT_NONAUTO_FSM1000, STD_LTR_ECRRT_AUTO_NONAUTO, STD_LTR_ECRRT_NONAUTO, STD_LTR_AUTO_NONAUTO, STD_LTR_AUTO, STD_LTR_NONAUTO, STD_LTR_NONMACH, STD_LTR_ECRRT_NONMACH, STD_FLAT_ECRRT_COSACK, STD_FLAT_ECRRT_DISABLE_COSACK, STD_FLAT_COSACK, STD_FLAT_DISABLE_COSACK, STD_FLAT_AUTO, STD_FLAT_NONAUTO, STD_FLAT_ECRRT_AUTO, STD_FLAT_ECRRT_NONAUTO, RESIDUALS_LEFT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
