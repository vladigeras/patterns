package ru.vladigeras.patterns.behavioral.observer;

/**
 * @author vladi_geras on 19.11.2019
 */
public class ObserverDemo {
	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.getEvents().subscribe(Event.OPEN, new LogNotificationListener("/path/to/log/file.txt"));
		editor.getEvents().subscribe(Event.SAVE, new LogNotificationListener("/path/to/log/file.txt"));
		editor.getEvents().subscribe(Event.SAVE, new EmailNotificationListener("gerasimov.v88@gmail.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
