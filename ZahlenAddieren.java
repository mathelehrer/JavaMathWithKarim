public class ZahlenAddieren
{
    public int Zahlen(){
        int summe =0;
        for (int i=1;i<=100;i++){
            summe=summe+i;
            System.out.println("summe: "+ summe);
        }
        return summe;
    }

    /**
     * hier ist mein Verbesserungsvorschlag
     * Methoden klein schreiben
     * Parameter fuer mehr Flexibilitaet und ohne Ausgabe in der for-Schleife, die macht die Berechnung nur langsam
     *
     * Fuehren Sie auch die beiden Testmethoden in der Klasse ZahlenAddierenTest aus
     */

    public int zahlen2(int pGrenze){
        int summe =0;
        for (int i=1;i<=pGrenze;i++){
            summe=summe+i;
        }
        return summe;
    }

}
