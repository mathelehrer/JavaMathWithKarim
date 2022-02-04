/**
 * The class ProjektEuler
 *
 * Schauen Sie sich mal folgenden Link an:
 * https://projecteuler.net/
 *
 *
 * Dort finden Sie ganz viele kleine Fragestellungen, die mit Computerprogrammen geloest werden koennen.
 * Vielleicht versuchen Sie sich auch mal an einem. Wie das aussehen koennte zeigt mein Beispiel.
 *
 * Wenn Sie nicht weiter kommen, laden Sie Ihr Projekt einfach bis zum Stand des Erreichten hoch und schreiben Sie mir eine kurze
 * Nachricht auf WebUntis.
 *
 *
 * @author p6majo
 * @version 2022-02-04
 */
public class ProjektEuler {

    /**
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     *
     * a^2 + b^2 = c^2
     * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
     *
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     */
    public int problem9(){
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 1; c <= 1000; c++) {
                    if (a*a+b*b==c*c && a+b+c==1000) {
                        return a * b * c;
                    }
                }
            }
        }
        return -1;
    }

}
