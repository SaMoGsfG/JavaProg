package KlausurenVorbereitung.SozialesNetzwerk;

public class Timeline {

    public Post start;
    
    public void fuegePostEin(Post k){
        if (start == null){
            start = k;
            k.next = null;
        }else if (start != null){
            k.next = start;
            start = k;
        }
    }
   
    public void gibAus(){ 
        Post k = start;
        while (k != null){
            System.out.println("Absender: " + k.Absender + ", Empfänger: " + k.Empfänger + ", Text: " + k.Text);
            k = k.next;
        }
    } 
}
