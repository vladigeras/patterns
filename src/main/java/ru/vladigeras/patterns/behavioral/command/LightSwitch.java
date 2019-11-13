package ru.vladigeras.patterns.behavioral.command;

/**
 * @author vladi_geras on 13.11.2019
 */
public class LightSwitch {
	private int state = 0;
	private Command switchUp;
	private Command switchDown;

	public LightSwitch(Command switchUp, Command switchDown) {
		this.switchUp = switchUp;
		this.switchDown = switchDown;
	}

	public void toggle() {
		if (isOff()) {
			switchUp.execute();
			state = 1;
		} else {
			switchDown.execute();
			state = 0;
		}
	}

	private boolean isOff() {
		return state == 0;
	}
}
