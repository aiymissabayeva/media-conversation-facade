public class AudioMixer {

    public String processAudio(String convertedData, int originalVolume) {
        if (convertedData == null || convertedData.isBlank()) {
            throw new IllegalArgumentException("Converted data cannot be empty");
        }

        if (originalVolume < 0 || originalVolume > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }

        int adjustedVolume = Math.min(originalVolume + 10, 100);

        String result = convertedData
                + " | Audio Volume: " + adjustedVolume + "%";

        System.out.println("Audio processed.");
        return result;
    }
}
