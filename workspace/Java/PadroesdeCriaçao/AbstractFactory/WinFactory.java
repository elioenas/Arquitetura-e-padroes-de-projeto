package AbstractFactory;

import AbstractFactory.AbstractFactoryExample.GUIFactory;

public class WinFactory implements GUIFactory {
	public Button createButton() {
		return new WinButton();
	}

}
