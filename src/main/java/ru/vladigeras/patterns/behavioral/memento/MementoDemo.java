package ru.vladigeras.patterns.behavioral.memento;

import java.util.Scanner;

/**
 * @author vladi_geras on 19.11.2019
 */
public class MementoDemo {
	public static void main(String[] args) {
		Game game = new Game();
		FileSaver fileSaver = new FileSaver();

		Scanner scanner = new Scanner(System.in);
		int choose = 0;
		while (true) {
			System.out.println();
			System.out.println("1 - Play game");
			System.out.println("2 - Save game");
			System.out.println("3 - Load save");
			System.out.println("4 - Delete save");
			System.out.println("0 - Exit");

			choose = scanner.nextInt();
			switch (choose) {
				case 1: {
					System.out.print("Set level: ");
					int level = scanner.nextInt();
					System.out.print("Set progress: ");
					int progress = scanner.nextInt();
					game.set(level, progress);
					System.out.println(game);
					break;
				}
				case 2: {
					System.out.println("Set name: ");
					String saveName = scanner.next();
					System.out.println("Save progress...");
					fileSaver.add(new FileSave()
							.setSave(game.save(saveName))
					);
					break;
				}
				case 3: {
					showSaves(fileSaver);
					System.out.println("Which save you want to load ?");
					String id = scanner.next();
					FileSave fileSave = fileSaver.get(id);
					if (fileSave != null) {
						game.load(fileSave.getSave());
						System.out.println(game);

					} else {
						System.out.println("This save doesn't exist...");
					}
					break;
				}
				case 4: {
					showSaves(fileSaver);
					System.out.println("Which save you want to delete ?");
					String id = scanner.next();
					fileSaver.delete(id);
					break;
				}
				case 0: {
					System.exit(0);
				}
				default: {
					System.out.println("Wrong command...");
					break;
				}
			}
		}
	}

	private static void showSaves(FileSaver fileSaver) {
		fileSaver
				.getSaves()
				.forEach(fileSave -> System.out.println(fileSave.getSave()));
	}
}
