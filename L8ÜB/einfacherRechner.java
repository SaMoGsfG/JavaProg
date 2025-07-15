package L8ÜB;

public class einfacherRechner {
    public static void main (String[] args){
        int ergebnis = 0;
        if(args[args.length - 1 ].equals("+")){
            for (int i = 0; i < args.length - 1; i++){
                ergebnis += Integer.valueOf(args[i]);
            }
            System.out.println(ergebnis);
        }else if(args[args.length - 1].equals("_")){
            ergebnis = Integer.valueOf(args[0]);
            for (int i = 1; i < args.length - 1; i++){
                ergebnis -= Integer.valueOf(args[i]);
            }
            System.out.println(ergebnis);
        }else{
            System.out.println("Ungültige Argumente konnten ich nicht verarbeiten.");
        }
    }
    
}
