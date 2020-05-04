package ru.itvitality.sbrf.cu.j2003.l10.cohesion;

public class CohesionDemo2s {

        class B {
            private String message;
            // Инициализация message опущена

            public void process()
            {
                //...
                send(message);
            }

            private void send(String message)
            {
                System.out.println(
                        "Send: " + message);
            }
        }

}
