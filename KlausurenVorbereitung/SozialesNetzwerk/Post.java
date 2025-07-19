package KlausurenVorbereitung.SozialesNetzwerk;

public class Post {
    String Text;
    String Absender;
    String Empfänger;
    Post next;
    
    public Post(String text, String absender, String empfänger) {
        this.Text = text;
        this.Absender = absender;
        this.Empfänger = empfänger;
    }
    

}
