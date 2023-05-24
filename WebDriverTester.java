package HWProjectTask2;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        SafariDriver safariDriver = new SafariDriver();

        chromeDriver.open();
        chromeDriver.close();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.navigate();

        firefoxDriver.open();
        firefoxDriver.close();
        System.out.println(firefoxDriver.getTitle());
        firefoxDriver.navigate();

        safariDriver.open();
        safariDriver.close();
        System.out.println(safariDriver.getTitle());
        safariDriver.navigate();
    }
}
