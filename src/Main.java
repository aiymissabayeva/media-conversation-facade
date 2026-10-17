public class Main {
    public static void main(String[] args) {
        MediaConversionFacade facade = new MediaConversionFacade();

        String result = facade.convert("video.avi", "mp4");

        System.out.println("\nFinal Result:");
        System.out.println(result);
    }
}
