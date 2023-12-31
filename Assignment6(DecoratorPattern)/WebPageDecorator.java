// abstract decorator class
public abstract class WebPageDecorator implements WebPage{
    protected WebPage page;

    public WebPageDecorator(WebPage webpage){
        this.page = webpage;
    }

    public void display(){
        this.page.display();
    }


}
