package L12ÜB;

public class Personenknoten {

    private int alter;
    private String name;
    Personenknoten next;
    Personenknoten prev;

    public Personenknoten(int alter, String name) {
        this.alter = alter;
        this.name = name;
        this.next = null;
        this.prev = null;
    }
    public int getAlter() {
        return alter;
    }
    public String getName() {
        return name;
    }
}
