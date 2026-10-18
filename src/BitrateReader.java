public class BitrateReader {
    public String convertData(String fileName, String sourceFormat, String targetCodec){
        if (fileName == null || fileName.isBlank() || sourceFormat == null || sourceFormat.isBlank() || targetCodec == null || targetCodec.isBlank()){
            throw new IllegalArgumentException("Invalid conversion data");
        }
        int originalBitrate = 5000;
        int convertBitrate;

        if (targetCodec.equals("H.264")) {
            convertBitrate = 3000;
        } else if (targetCodec.equals("MPEG-4")){
            convertBitrate = 4000;
        } else {
            throw new IllegalArgumentException("Unsupported codec");
        }
        double compressionRatio = (double) convertBitrate / originalBitrate;

        String result = fileName + " | Source: " + sourceFormat + " | Codec: " + targetCodec + " | Bitrate: " + convertBitrate + " kbps" + " | Ratio: " + compressionRatio;
        System.out.println("Media data converted");
        return result;
    }
}
