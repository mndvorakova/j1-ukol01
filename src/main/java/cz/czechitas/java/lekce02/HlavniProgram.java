package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();

    }


    public void start() {
        zofka = new Turtle();
        nakresliTvarDomecku(50, 100);
        nakresliPrasatko(50, 100);


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





    public void hlavaStrecha() {
        for (int i = 0; i < 3; i++) {
            zofka.move(50);
            zofka.turnLeft(120);

        }

    }

    public void zvedniTuzkuAPosunSe() {
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penDown();
    }

}








