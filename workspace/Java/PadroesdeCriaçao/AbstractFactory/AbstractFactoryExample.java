package AbstractFactory;

public class AbstractFactoryExample {
	// abstract the way to create a button
	@FunctionalInterface
	interface GUIFactory {
		public Button createButton();

	}
}