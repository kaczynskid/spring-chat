package org.jug.im;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private InstantMessageRepository messageRepository;

    @Autowired
    public ChatController(InstantMessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public InstantMessage sendInstantMessage(InstantMessage message) {
        return messageRepository.save(message);
    }

}
