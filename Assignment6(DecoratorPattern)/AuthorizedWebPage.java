// inherit from abstract decorator and implements the component interface with the concrete decorator classes
public class AuthorizedWebPage extends WebPageDecorator{

    public AuthorizedWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }

    public void authorizedUser(){
        System.out.println("Authorizing user");
    }

    public void display(){
        super.display();
        this.authorizedUser();
    }
}
