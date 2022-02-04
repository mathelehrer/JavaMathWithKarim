import static org.junit.jupiter.api.Assertions.*;

class ZahlenAddierenTest {

    @org.junit.jupiter.api.Test
    void zahlen() {
        ZahlenAddieren addierenTest = new ZahlenAddieren();
        System.out.println(addierenTest.Zahlen());
    }

    @org.junit.jupiter.api.Test
    void summen2(){
        ZahlenAddieren addierenTest = new ZahlenAddieren();
        int grenze = 10;
        for (int i=0;i<5;i++){
            System.out.println("Summe der Zahlen bis "+grenze+": "+addierenTest.zahlen2(grenze) );
            grenze = grenze*10;
        }
    }
}