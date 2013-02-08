import cpp0x_thread_local.*;

public class cpp0x_thread_local_runme {

  static {
    try {
        System.loadLibrary("cpp0x_thread_local");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. See the chapter on Dynamic Linking Problems in the SWIG Java documentation for help.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
    if (ThreadLocals.getStval() != 11)
      throw new RuntimeException();
    if (ThreadLocals.getTsval() != 22)
      throw new RuntimeException();
    if (ThreadLocals.tscval99 != 99)
      throw new RuntimeException();

    cpp0x_thread_local.setEtval(-11);
    if (cpp0x_thread_local.getEtval() != -11)
      throw new RuntimeException();

    cpp0x_thread_local.setStval(-22);
    if (cpp0x_thread_local.getStval() != -22)
      throw new RuntimeException();

    cpp0x_thread_local.setTsval(-33);
    if (cpp0x_thread_local.getTsval() != -33)
      throw new RuntimeException();

    cpp0x_thread_local.setEtval(-44);
    if (cpp0x_thread_local.getEtval() != -44)
      throw new RuntimeException();

    cpp0x_thread_local.setTeval(-55);
    if (cpp0x_thread_local.getTeval() != -55)
      throw new RuntimeException();

    cpp0x_thread_local.setEctval(-55);
    if (cpp0x_thread_local.getEctval() != -55)
      throw new RuntimeException();
  }
}
