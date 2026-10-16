public class MetaDataReader {
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
}
