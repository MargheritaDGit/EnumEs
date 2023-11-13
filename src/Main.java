// Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
// che stampi l'area della forma specifica.
// Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne
// identifichi la Forma in maniera univoca usando una enum.

public class Main {
    public static void main(String[] args) {


       Rettangolo rettangolo = new Rettangolo(6, 10, TipoForma.Rettangolo);
       Triangolo triangolo = new Triangolo(8, 20, TipoForma.Triangolo) ;

       System.out.println(rettangolo);
        System.out.println(triangolo);
        }
    }
