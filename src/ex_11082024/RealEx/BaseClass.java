package ex_11082024.RealEx;

abstract class BaseClass extends GrandBaseClass{
    //Web Automation
    //Single Inheritance
    //Hide the functionalities of the open and close Browser

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);
    BaseClass(){}

    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }
}