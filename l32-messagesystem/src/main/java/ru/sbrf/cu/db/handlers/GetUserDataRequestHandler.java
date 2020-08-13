package ru.sbrf.cu.db.handlers;

import ru.sbrf.cu.app.common.Serializers;
import ru.sbrf.cu.db.DBService;
import ru.sbrf.cu.messagesystem.Message;
import ru.sbrf.cu.messagesystem.MessageType;
import ru.sbrf.cu.messagesystem.RequestHandler;

import java.util.Optional;


public class GetUserDataRequestHandler implements RequestHandler {
    private final DBService dbService;

    public GetUserDataRequestHandler(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public Optional<Message> handle(Message msg) {
        long id = Serializers.deserialize(msg.getPayload(), Long.class);
        String data = dbService.getUserData(id);
        return Optional.of(new Message(msg.getTo(), msg.getFrom(), msg.getId(), MessageType.USER_DATA.getValue(), Serializers.serialize(data)));
    }
}
