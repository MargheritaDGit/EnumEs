public class Rettangolo implements Forma {

        private double base;
        private double altezza;

        private final TipoForma Rettangolo;
        public Rettangolo(double base, double altezza, TipoForma Rettangolo ) {

            this.base = base;
            this.altezza = altezza;
            this.Rettangolo = Rettangolo;
        }

        @Override
        public String toString() {
            return "base=" + base +
                    ", altezza=" + altezza +
                    ", area= " + calcolaArea() +
                    ", Forma =" + Rettangolo;

        }

        @Override
        public double calcolaArea() {
                return base*altezza;
        }
    }



