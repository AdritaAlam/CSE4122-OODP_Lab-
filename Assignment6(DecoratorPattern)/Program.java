public class Program {
    public static void main(String[] args){
        WebPage mypage = new BasicWebPage();
        mypage = new AuthorizedWebPage(mypage);
        mypage = new AuthenticatedWebPage(mypage);
        mypage.display();
    }
}
