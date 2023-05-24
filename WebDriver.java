package HWProjectTask2;
/* Provide Implementation for the diagram below.
Then create a test class in which you need to create Objects of ChromeDriver,
FirefoxDrive and SafariDriver classes and see which methods available to them.
 */
public interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Chrome Browser");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Firefox Browser");
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Safari Browser");
    }
}