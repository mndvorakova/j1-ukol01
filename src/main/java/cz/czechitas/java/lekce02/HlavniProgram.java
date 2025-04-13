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
        sestiuhelnik();
        pokusOKruh();
        nakresliSlunicko();




        //TODO tady bude kód
    }

    private void nakresliPrasatko() {
        //hlava
        for (int i = 0; i < 3; i++) {
            zofka.move(50);
            zofka.turnLeft(120);
            zofka.move(50);
        }

        //tělo
        zofka.penUp();
        zofka.move(50);
        zofka.turnRight(90);

        zofka.penDown();

        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(130);


        //první nožička
        zofka.turnLeft(60);
        zofka.move(30);

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
        zofka.move(30);

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
        zofka.move(130);

        //třetí nožička
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(30);

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
        zofka.move(30);

        prejdiNaCistePlatnoVpravo();

    }

    //re-usable metoda pro otočení tužky - nožičky prasátko
    public void otocimeNahoru() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(30);

    }

    //re-usable metoda pro přesun tužky na volné místo na plátně
    public void prejdiNaCistePlatnoVpravo() {
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(100);
    }


    //šestiúhelník


    public void sestiuhelnik(){
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(50);

        for (int i = 0; i < 6; i++) {
            zofka.turnRight(60);
            zofka.move(50);
        }
        zofka.penUp();
        zofka.move(100);
    }


    public void pokusOKruh(){
        zofka.penDown();

        nakresliKolecko();

        zofka.penUp();
        zofka.move(100);

    }

    //metoda pro kreslení kruhu/kolečka:D re-usable
    public void nakresliKolecko(){
        for (int i = 0; i < 18; i++) {
            zofka.move(15);
            zofka.turnRight(20);

        }
    }



    public void nakresliSlunicko() {

        //přesun na oblohu
        zofka.turnLeft(90);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        nakresliKolecko();




    }


    }








