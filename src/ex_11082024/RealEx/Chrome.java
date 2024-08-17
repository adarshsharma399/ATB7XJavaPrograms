package ex_11082024.RealEx;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open Chrome");    //Code related to chrome only
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close Chrome");   //Code related to chrome only
        return "";
    }
}
