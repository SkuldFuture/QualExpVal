package com.example.demo.controller;

import com.example.demo.Message.MessageOtvet;
import com.example.demo.Message.MessageZapros;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("message")
public class MessageController {

    @PostMapping
    public MessageOtvet sozdat(@RequestBody MessageZapros messageZapros) {
        MessageOtvet messageOtvet = new MessageOtvet();
        messageOtvet.setId(messageZapros.getId());
        messageOtvet.setName(messageZapros.getName());
        messageOtvet.setSurname(messageZapros.getSurname());
        messageOtvet.setCredit(messageZapros.getCredit());
        return messageOtvet;
    }

    @PutMapping
    public MessageOtvet zamenit(@RequestBody MessageZapros messageZapros) {
        MessageOtvet messageOtvet = new MessageOtvet();
        messageOtvet.setId(messageZapros.getId());
        messageOtvet.setName("Server");
        messageOtvet.setSurname("Shizofreniya");
        messageOtvet.setCredit(messageZapros.getCredit());
        return messageOtvet;
    }
}