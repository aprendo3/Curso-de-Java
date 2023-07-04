package anonimas;

public class Anonymous {
    interface Hola {
        public void saludar();
    }
    public void decirHola() {
        Hola hola = new Hola() {
            @Override
            public void saludar() {
                System.out.println("Hola Aprendo");
            }
        };
        hola.saludar();
    }
}
