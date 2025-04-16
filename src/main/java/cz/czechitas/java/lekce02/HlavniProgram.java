package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();

    }


    public void start() {
        zofka = new Turtle();
        //nakresliTvarDomecku(50, 100);
        nakresliPrasatko(50, 100);
        zvedniTuzkuAPosunSe();


        //TODO tady bude kód
    }



    public void nakresliPrasatko(double sirkaPig, double vyskaPig) {
        //hlava_střecha
        hlavaStrecha();

        //obdélníček
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }

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

        zvedniTuzkuAPosunSe();


    }

    public void nakresliTvarDomecku(double sirka, double vyska ) {

        //hlava_střecha
        hlavaStrecha();

        //obdélníček
        for (int i = 0; i < 2; i++) {
            zofka.move(sirka);
            zofka.turnRight(90);
            zofka.move(vyska);
            zofka.turnRight(90);
        }

    }


    public void kreslimNozickyPrasatka() {
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
    }


    public void hlavaStrecha() {
        for (int i = 0; i < 3; i++) {
            zofka.move(50);
            zofka.turnLeft(120);

        }

    }


    public void zvedniTuzkuAPosunSe() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(150);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

}








