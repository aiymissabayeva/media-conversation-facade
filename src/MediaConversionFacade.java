public class MediaConversionFacade {
    private MetadataReader metadataReader;
    private CodecFactory codecFactory;
    private BitrateReader bitrateReader;
    private AudioMixer audioMixer;

    public MediaConversionFacade() {
        metadataReader = new MetadataReader();
        codecFactory = new CodecFactory();
        bitrateReader = new BitrateReader();
        audioMixer = new AudioMixer();
    }

    public String convert(String fileName, String targetFormat) {
        System.out.println("Starting media conversion...");

        String sourceFormat = metadataReader.readFormat(fileName);

        int originalBitrate = metadataReader.readBitrate(fileName);

        String targetCodec = codecFactory.selectCodec(targetFormat);

        String convertedData = bitrateReader.convertData(
                fileName, sourceFormat, targetCodec, originalBitrate
        );

        int originalVolume = 80;

        String finalResult = audioMixer.processAudio(
                convertedData, originalVolume
        );

        System.out.println("Media conversion completed.");
        return finalResult;
    }
}
