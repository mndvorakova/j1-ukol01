package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    private void nakresliPrasatko() {

    }

    public void start() {
        zofka = new Turtle();
        nakresliPrasatko();

        //TODO tady bude kód

        //hlava
        for (int i = 0; i < 3; i++) {
            zofka.move(150);
            zofka.turnLeft(120);
            zofka.move(150);
        }
        //tělo
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);

        zofka.penDown();

        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(400);

        //první nožička
        zofka.turnLeft(60);
        zofka.move(80);

        //otočíme nahoru
        /*
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(80);
         */

        otocimeNahoru();

        //druhá nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(80);

        //otočíme nahoru
        /*
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(80);
        */

        otocimeNahoru();

        //přejdeme na konec těla
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(400);

        //třetí nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(80);

        //otočíme nahoru
        /*
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(80);
         */

        otocimeNahoru();

        //čtvrtá nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(80);


    }


    public void otocimeNahoru() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(80);
    }
}
