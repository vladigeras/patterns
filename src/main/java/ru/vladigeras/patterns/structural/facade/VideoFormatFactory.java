package ru.vladigeras.patterns.structural.facade;

/**
 * @author vladi_geras on 11.11.2019
 */
public class VideoFormatFactory {
	public static VideoFormat extract(VideoFile file) {
		VideoFormatType format = file.getFormat();
		System.out.println("Extracting " + format + " video");
		switch (format) {
			case AVI:
				return new AVIVideoFormat();
			case MP4:
				return new MP4VideoFormat();
			default:
				throw new RuntimeException("Unknown format " + format);
		}
	}
}
