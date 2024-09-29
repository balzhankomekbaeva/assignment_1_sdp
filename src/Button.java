interface Button {
    void render();
}

class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering a button in Dark Theme");
    }
}

class LightThemeButton implements Button {
    public void render() {
        System.out.println("Rendering a button in Light Theme");
    }
}

interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}

class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }
}
