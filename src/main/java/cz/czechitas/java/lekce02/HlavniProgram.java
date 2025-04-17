package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();

    }


    public void start() {
        zofka = new Turtle();
        nakresliPrasatko();
        //sestiuhelnik();
        //nakresliKolecko();
        nakresliSlunicko();
        nakresliDomecky();
        odlehleDomecky();
        jmeno();


        //TODO tady bude kód
    }



    public void nakresliPrasatko() {
        //posuneme tužku více dolů
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();

        //hlava_střecha
        hlavaStrecha();

        //obdélníček
        obdelnik(50, 100);

        //první přední nožička
        zofka.turnLeft(150);
        zofka.move(20);

        //otočení zpět
        kreslimNozickyPrasatka();

        //druhá přední nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(20);

        //otočení zpět
        kreslimNozickyPrasatka();


        zofka.turnRight(120);

        //přesun k zadní části
        zofka.move(100);

        //první zadní nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(20);

        kreslimNozickyPrasatka();

        //druha zadni nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(20);

        //zvedniTuzkuAPosunSe();


    }




    //definovana metoda pro kreslení nožiček a otočení tužky
    public void kreslimNozickyPrasatka() {
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
    }


    //definovana metoda pro hlavu prasátka
    public void hlavaStrecha() {
        for (int i = 0; i < 3; i++) {
            zofka.move(50);
            zofka.turnLeft(120);

        }

    }

    /*
    public void zvedniTuzkuAPosunSe() {
        zofka.penUp();
        zofka.move(80);
        zofka.turnLeft(60);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }

     */

    //metoda pro kreslení obdelniku u prasatka a domecku
    public void obdelnik(double sirka, double vyska) {
        for (int i = 0; i < 2; i++) {
            zofka.move(sirka);
            zofka.turnRight(90);
            zofka.move(vyska);
            zofka.turnRight(90);
        }
    }


    /*
    public void sestiuhelnik() {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(50);

        for (int i = 0; i < 6; i++) {
            zofka.turnRight(60);
            zofka.move(50);
        }

        zofka.penUp();
        zvedniTuzkuAPosunSe();
    }

     */

    //metoda pro nakresleni kolecka
    /*
    public void nakresliKolecko(){
        for (int i = 0; i < 18; i++) {
            zofka.move(10);
            zofka.turnRight(25);

        }


    }
     */

    public void nakresliSlunicko() {

        //přesun na oblohu
        presunNaOblohu();

        //nakreslení kolečka
        for (int i = 0; i < 18; i++) {
            zofka.move(10);
            zofka.turnRight(25);
        }
        zofka.penUp();

        //paprsky sluníčka
        nakresliPaprsky();

        //nachystame tuzku pro novou kresbu
        zofka.penUp();
        zofka.turnRight(100);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();


    }

    public void presunNaOblohu() {
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(600);
        zofka.turnRight(90);
        zofka.move(500);
        zofka.penDown();
    }

    public void nakresliPaprsky() {
        for (int i = 0; i < 14; i++) {

            zofka.turnLeft(90);
            zofka.penDown();
            zofka.move(40);

            //vrat se zpátky
            zofka.penUp();
            zofka.move(-40);

            zofka.turnRight(90);
            zofka.move(10);
            zofka.turnRight(25);
        }
    }

    //vodorovný domečky
    public void nakresliDomecky() {

        for (int i = 0; i < 5; i++) {
            hlavaStrecha();
            obdelnik(50, 80);
            zofka.penUp();
            zofka.move(120);
            zofka.penDown();
        }
        //nachystame tužku pro další kreslení
        zofka.penUp();
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

    }
    public void odlehleDomecky() {
        hlavaStrecha();
        obdelnik(50, 80);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(700);
        zofka.turnLeft(180);
        zofka.penDown();

        hlavaStrecha();
        obdelnik(50, 80);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

    }

    public void jmeno() {

        //písmeno M
        zofka.move(80);
        zofka.turnRight(150);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnRight(150);
        zofka.move(80);

        //nekresli
        zofka.penUp();


        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(70);

        //kresli
        zofka.penDown();

        //písmeno A
        zofka.move(80);
        zofka.turnRight(140);
        zofka.move(80);
        zofka.penUp();
        zofka.turnRight(190);
        zofka.move(30);
        zofka.turnLeft(80);
        zofka.penDown();
        zofka.move(30);

        //nekresli
        zofka.penUp();

        //písmeno J
        zofka.turnRight(180);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(100);
        zofka.move(10);

        //mezera
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(85);
        zofka.penDown();

        //pismeno A
        zofka.move(80);
        zofka.turnRight(140);
        zofka.move(80);
        zofka.penUp();
        zofka.turnRight(190);
        zofka.move(30);
        zofka.turnLeft(80);
        zofka.penDown();
        zofka.move(30);


        zofka.penUp();
        zofka.turnRight(90);

    }

}








