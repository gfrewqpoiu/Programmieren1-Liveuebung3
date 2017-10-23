public class Main {

    public static void main(String[] args) {
        short fuellmenge_in_milliliter;
        fuellmenge_in_milliliter = 0;

        if (fuellmenge_in_milliliter == 250){
            System.out.println("Das Glas ist voll!");
        }
        else if (fuellmenge_in_milliliter > 250){
            System.out.println("Das Glas ist am Überlaufen!");
        } //Aufgabe 1 Ende
        if (fuellmenge_in_milliliter >0){
            System.out.println("Her damit");
        }
        else{
            System.out.println("Kellner!");
        }//Aufgabe 2 Ende
        if (fuellmenge_in_milliliter < 250) {
            if (fuellmenge_in_milliliter == 125) {
                System.out.println("Das Glas ist genau halbvoll");
            } else {
                System.out.println("Das Glas ist nicht mehr voll");
            }
        }//Aufgabe 3 Ende
        int note = 6;
        String Schulnote;
        switch (note) {
            case 1:
                Schulnote = "Sehr Gut!";
                break;
            case 2:
                Schulnote = "Gut";
                break;
            case 3:
                Schulnote = "Befriedigend";
                break;
            case 4:
                Schulnote = "Ausreichend";
                break;
            case 5:
                Schulnote = "Mangelhaft";
                break;
            case 6:
                Schulnote = "Ungenügend";
                break;
            default:
                Schulnote = "Kein erlaubter Wert!";
                break;
        }
        System.out.println("Die Schulnote von einer " + note + " ist: " + Schulnote);
        //Aufgabe 4 Ende
        int i =0;
        while (i < 50){
            i++;
            System.out.println(i);
        }//Aufgabe 5 a Ende
        System.out.println("Davon sind durch 3 teilbar:");
        int j=1;
        while (j < 50){
            if (j % 3 == 0){
                System.out.println(j);
            }
            j++;
        }//Aufgabe 5 b Ende
        int runde = 1;
        int liegestütze;
        while (runde < 4){
            System.out.println(runde + ". Runde. Auf gehts!");
            liegestütze = 1;
            while (liegestütze < 11){
                System.out.println(liegestütze + ". Liegestütze ");
                liegestütze++;
            }
            runde++;
        }//Aufgabe 6 Ende
    }
}
