public class BitrateReader {

    public String convertData(String fileName, String sourceFormat,
                              String targetCodec, int originalBitrate) {

        if (fileName == null || fileName.isBlank()
                || sourceFormat == null || sourceFormat.isBlank()
                || targetCodec == null || targetCodec.isBlank()) {
            throw new IllegalArgumentException("Invalid conversion data");
        }

        if (originalBitrate <= 0) {
            throw new IllegalArgumentException("Invalid bitrate");
        }

        double compressionRatio;

        if (targetCodec.equals("H.264")) {
            compressionRatio = 0.6;
        } else if (targetCodec.equals("MPEG-4")) {
            compressionRatio = 0.8;
        } else {
            throw new IllegalArgumentException("Unsupported codec");
        }

        int convertedBitrate = (int) (originalBitrate * compressionRatio);

        String result = fileName
                + " | Source: " + sourceFormat
                + " | Codec: " + targetCodec
                + " | Bitrate: " + convertedBitrate + " kbps"
                + " | Ratio: " + compressionRatio;

        System.out.println("Media data converted.");
        return result;
    }
}
