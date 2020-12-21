package computer;

public class Monitor {
   private int inches;
   private String resolution;

   public Monitor(int inches, String resolution) {
      this.inches = inches;
      this.resolution = resolution;
   }

   public int getInches() {
      return inches;
   }

   public void setInches(int inches) {
      this.inches = inches;
   }

   public String getResolution() {
      return resolution;
   }

   public void setResolution(String resolution) {
      this.resolution = resolution;
   }

   @java.lang.Override
   public java.lang.String toString() {
      return "Monitor{" +
              "inches=" + inches +
              ", resolution='" + resolution + '\'' +
              '}';
   }
}

