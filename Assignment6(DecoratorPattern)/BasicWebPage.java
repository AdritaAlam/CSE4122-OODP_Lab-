// concrete component class
// base building block for all web pages objects during run time
public class BasicWebPage implements WebPage{
    public String html = " Basic HTML";
    public String styleSheet = "Basic CSS";
    public String script = "Basic javaScript";

    public void display(){
        System.out.println("Displaying the Basic webpage");

    }
}
