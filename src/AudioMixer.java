public class AudioMixer {

    public String processAudio(String convertedData) {
        if (convertedData == null || convertedData.isBlank()) {
            throw new IllegalArgumentException("Converted data can't be empty");
        }

        int originalVolume = 80;
        int adjustedVolume = Math.min(originalVolume + 10, 100);

        String result = convertedData
                + " | Audio Volume: " + adjustedVolume + "%";

        System.out.println("Audio processed.");
        return result;
    }
}
