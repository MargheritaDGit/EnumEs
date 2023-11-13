public class Triangolo implements Forma {
        private double base;
        private double altezza;

        private final TipoForma Triangolo;
        public Triangolo(double base, double altezza, TipoForma Triangolo) {

            this.base = base;
            this.altezza = altezza;
            this.Triangolo = Triangolo;
        }

        @Override
        public String toString() {
            return "base=" + base +
                    ", altezza=" + altezza +
                    ", area=" + calcolaArea() +
                    ", Forma =" + Triangolo;
        }
        @Override
        public double calcolaArea() {
                return (base*altezza)/2;
        }
}
