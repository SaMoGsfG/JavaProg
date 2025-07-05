package L12ÜB;

public class Liste {
    public Personenknoten start;
    
    public void sorteinfuegen(Personenknoten k) {
        // Wenn die Liste leer ist, wird der neue Knoten zum Startknoten
        if (start == null) {
            start = k;
        }
        // Wenn das Alter des neuen Knotens kleiner als das des Startknotens ist,
        // wird der neue Knoten am Anfang eingefügt
        else if (k.getAlter() < start.getAlter()) {
            k.next = start;      // Der neue Knoten zeigt auf den bisherigen Startknoten
            start.prev = k;      // Der bisherige Startknoten zeigt zurück auf den neuen Knoten
            start = k;           // Der neue Knoten wird zum Startknoten
        } else {
            // Wir suchen die richtige Stelle für den neuen Knoten
            Personenknoten temp = start;
            Personenknoten prevTemp = null;
            while (temp != null) {
                // Falls es schon einen Knoten mit gleichem Alter gibt, wird nicht eingefügt
                if (temp.getAlter() == k.getAlter()) {
                    System.out.println("Es gibt schon eine Person mit dem Alter " + k.getAlter());
                    return;
                }
                // Wenn das Alter des neuen Knotens kleiner als das aktuelle ist,
                // wird der neue Knoten vor temp eingefügt
                else if (k.getAlter() < temp.getAlter()) {
                    prevTemp.next = k; // Der vorherige Knoten zeigt auf den neuen Knoten
                    k.next = temp;     // Der neue Knoten zeigt auf temp
                    k.prev = prevTemp; // Der neue Knoten zeigt zurück auf prevTemp
                    temp.prev = k;     // temp zeigt zurück auf den neuen Knoten
                    break;
                }
                // Wenn wir am Ende der Liste sind, wird der neue Knoten hinten angehängt
                else if (temp.next == null) {
                    temp.next = k;     // temp zeigt auf den neuen Knoten
                    k.prev = temp;     // Der neue Knoten zeigt zurück auf temp
                    break;
                } else {
                    // Wir gehen einen Schritt weiter in der Liste
                    prevTemp = temp;
                    temp = temp.next;
                }
            }
        }
    }

    public Personenknoten sucheName (String nameGesucht) {
        Personenknoten temp = start;
        while (temp != null) {
            if (temp.getName().equals(nameGesucht)) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Name nicht gefunden
    }
        
    
    public static void main(String[] args) {
        Liste liste = new Liste();
        liste.sorteinfuegen(new Personenknoten(25, "Müller"));
        liste.sorteinfuegen(new Personenknoten(30, "Schmidt"));
        liste.sorteinfuegen(new Personenknoten(22, "Meier"));
        liste.sorteinfuegen(new Personenknoten(28, "Schulz"));
        liste.sorteinfuegen(new Personenknoten(27, "Fischer"));
    
        // Vorwärts ausgeben
        System.out.println("Vorwärts:");
        Personenknoten temp = liste.start;
        Personenknoten letzte = null;
        while (temp != null) {
            System.out.println(temp.getAlter() + " " + temp.getName());
            letzte = temp;
            temp = temp.next;
        }
    
        // Rückwärts ausgeben
        System.out.println("Rückwärts:");
        while (letzte != null) {
            System.out.println(letzte.getAlter() + " " + letzte.getName());
            letzte = letzte.prev;
        }
    }

}


