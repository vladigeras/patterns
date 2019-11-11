package ru.vladigeras.patterns.structural.facade;

/**
 * @author vladi_geras on 11.11.2019
 */
public class VideoConverter {
	public VideoFile convert(String fileName, String fileFormat) {
		System.out.println("VideoConverter :: conversion started");
		VideoFile file = new VideoFile(fileName);
		VideoFormat format = VideoFormatFactory.extract(file);
		VideoFile buffer = BitrateReader.read(file, format);
		VideoFile result = BitrateReader.convert(buffer, format);
		System.out.println("VideoConverter :: conversion completed");
		return result;
	}
}
