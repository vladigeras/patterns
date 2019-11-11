package ru.vladigeras.patterns.structural.facade;

/**
 * @author vladi_geras on 11.11.2019
 */
public class VideoFile {
	private String name;
	private VideoFormatType format;

	public VideoFile(String name) {
		this.name = name;
		format = VideoFormatType.valueOf(name.substring(name.indexOf(".") + 1).toUpperCase());
	}

	public VideoFormatType getFormat() {
		return format;
	}

	public String getName() {
		return name;
	}
}
