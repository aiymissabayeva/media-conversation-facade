public class MetadataReader {
    public String readFormat(String fileName){
        if (fileName == null || fileName.isBlank()){
            throw new IllegalArgumentException("File name can't be empty");
        }

        int dotIndex = fileName.lastIndexOf(".");

        if (dotIndex == -1 || dotIndex == fileName.length() - 1){
            throw new IllegalArgumentException("Invalid file format");
        }

        String format = fileName.substring(dotIndex + 1).toLowerCase();

        System.out.println("Source format: " + format);
        return format;
    }

    public int readBitrate(String fileName) {
        String format = readFormat(fileName);

        if (format.equals("avi")) {
            return 5000;
        }

        if (format.equals("mp4")) {
            return 3000;
        }

        throw new IllegalArgumentException("Unsupported source format: " + format);
    }
}
