package ru.sbrf.cu.messagesystem;


import java.util.Optional;

public interface RequestHandler {
    Optional<Message> handle(Message msg);
}
