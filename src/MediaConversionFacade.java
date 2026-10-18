
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

        String targetCodec = codecFactory.selectCodec(targetFormat);

        String convertedData = bitrateReader.convertData(
                fileName, sourceFormat, targetCodec
        );

        String finalResult = audioMixer.processAudio(convertedData);

        System.out.println("Media conversion completed.");
        return finalResult;
    }
}
