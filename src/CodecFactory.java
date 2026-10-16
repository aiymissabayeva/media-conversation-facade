public class CodecFactory {
    public String selectCodec(String targetFormat){
        if (targetFormat == null || targetFormat.isBlank()){
            throw new IllegalArgumentException("Target format can't be empty");
        }
        String format = targetFormat.toLowerCase();

        if (format.equals("mp4")){
            System.out.println("Selected codec: H.264");
            return "H.264";
        }
        if (format.equals("avi")){
            System.out.println("Selected codec: MPEG-4");
            return "MPEG-4";
        }

        throw new IllegalArgumentException("Unsupported format: " + targetFormat);
    }
}
