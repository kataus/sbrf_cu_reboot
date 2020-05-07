package ru.itvitality.sbrf.cu.j2003.l11.observer;

public class Demo {
    public static void main(String[] args) {
        EventProducer producer = new EventProducer();
        ConsumerA consumerA = new ConsumerA();
        ConsumerB consumerB = new ConsumerB();

        producer.addListener(consumerA);
        producer.addListener(consumerB.getListener());

        producer.event("eventA");
        producer.event("eventB");

        //Критически важно удалять, когда не нужны
        producer.removeListener(consumerA);

        producer.event("eventC");
        producer.removeListener(consumerB.getListener());


        producer.event("eventD");
    }
}
