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

    }//Aufgabe 4 Ende
}
