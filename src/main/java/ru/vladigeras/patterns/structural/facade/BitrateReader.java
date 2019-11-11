package ru.vladigeras.patterns.structural.facade;

/**
 * @author vladi_geras on 11.11.2019
 */
public class BitrateReader {
	public static VideoFile read(VideoFile file, VideoFormat format) {
		System.out.println("BitrateReader :: reading file");
		return file;
	}

	public static VideoFile convert(VideoFile buffer, VideoFormat format) {
		System.out.println("BitrateReader :: writing file");
		return buffer;
	}
}
