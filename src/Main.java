public class Main {
    public static void main(String[] args) {
        MediaConversionFacade facade = new MediaConversionFacade();

        try {
            String result = facade.convert("video.avi", "mp4");

            System.out.println("\nFinal Result:");
            System.out.println(result);

        } catch (IllegalArgumentException e) {
            System.out.println("Conversion failed: " + e.getMessage());
        }
    }
}
