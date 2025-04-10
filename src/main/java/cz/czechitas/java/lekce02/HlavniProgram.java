package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód

/*

Jednoduchý zápis kódu "krok po kroku"

System.out.println("začátek");
zofka.move(50);
zofka.penUp();
zofka.move(100);

System.out.println("za mezerou");
zofka.penDown();
zofka.move(100);

zofka.turnRight(90);
System.out.println("po otočce");

zofka.move(100);

System.out.println("Želvááá");
*/

        //cyklus for - pro opakování věcí, které známe
        //for (int i = 0; i < 10; i++) {}


//opět jednoduše napsaný kód, který se opakuje
/*
  zofka.move(100);
  zofka.turnRight(90);
  zofka.move(100);
  zofka.turnRight(90);
  zofka.move(100);
  zofka.turnRight(90);
  zofka.move(100);
  zofka.turnRight(90);
*/

        //lepší kod pro stejnou věc, kterou chceme udělat
        //a ted tento kod zakomentuju a misto toho zavolam metodu
        /*
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        */

        //zavolali jsme metodu
        nakresliCtverec();

        zofka.penUp();

        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

        //toto jsme vyjmuli a udělali radši metodu

        /*
        for (int i = 0; i < 4; i++) {
        zofka.move(100);
        zofka.turnRight(90);
        }
        */

        // a nyní zavoláme metodu
        nakresliCtverec();
    }


    //metody - abychom neměli více opakujících se bloků kódu - vlastni metoda - a ted, na to místo, kde jsem měla napsaný kód, zavolám metodu nakresliCtverec

    public void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
    }



}
