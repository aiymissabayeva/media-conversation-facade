# Assignment 4 - Facade Design Pattern

## Media Conversion System

This project demonstrates the **Facade Design Pattern** using a simple Media Conversion System written in Java.

The program simulates media conversion by reading file information, selecting a codec, calculating a new bitrate, and adjusting the audio volume.

The main purpose is to simplify the conversion process using one Facade class.

## Facade Pattern

Facade is a structural design pattern that provides a simple interface to a complex subsystem.

In this project, the client uses only one method:

`facade.convert("video.avi", "mp4");`

The `MediaConversionFacade` coordinates four subsystem classes and hides the internal conversion steps from the client.

## Project Structure

The project contains six Java classes:

- **Main** - The client. It starts the program and uses the Facade.
- **MediaConversionFacade** - Coordinates all conversion steps.
- **MetadataReader** - Reads the source file format and provides a simulated original bitrate.
- **CodecFactory** - Selects a codec based on the target format.
- **BitrateReader** - Calculates a new bitrate using the original bitrate and selected codec.
- **AudioMixer** - Simulates audio processing by adjusting the volume.

## How It Works

1. The client calls `convert(fileName, targetFormat)`.
2. MetadataReader identifies the source format and original bitrate.
3. CodecFactory selects the target codec.
4. BitrateReader calculates the converted bitrate.
5. AudioMixer adjusts the audio volume.
6. The Facade returns the final conversion information.

## Example Output

```text
Starting media conversion...
Source format: avi
Source format: avi
Selected codec: H.264
Media data converted.
Audio processed.
Media conversion completed.

Final Result:
video.avi | Source: avi | Codec: H.264 | Bitrate: 3000 kbps | Ratio: 0.6 | Audio Volume: 90%
```

## Error Handling

The program uses `IllegalArgumentException` to detect invalid input, such as an empty filename, missing file extension, or unsupported target format.

The Main class uses `try-catch` to display a clear error message without an unhandled exception.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Use Java JDK 17.
3. Open `Main.java`.
4. Run the `main()` method.
5. View the conversion result in the console.

## Clean Code

The project follows Clean Code principles, including meaningful names, single responsibility, encapsulation, a simple Facade interface, and proper error handling.

## Note

This is an educational simulation. It calculates and returns media conversion information, but it does not convert real video or audio files.
