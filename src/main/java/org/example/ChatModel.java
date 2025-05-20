package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ChatModel {
    @Id
    @GeneratedValue
    private Long Id;
    private MemberModel receiver;
    private MemberModel sender;

    public ChatModel() {
        receiver = new MemberModel();
        sender = new MemberModel();
    }

    public MemberModel getReceiver() {
        return receiver;
    }

    public void setReceiver(MemberModel receiver) {
        this.receiver = receiver;
    }

    public MemberModel getSender() {
        return receiver;
    }

    public void setSender(MemberModel sender) {
        this.sender = sender;
    }

    public String receiverName() {
        return receiver.getUsername();
    }

    public String senderName() {
        return sender.getUsername();
    }
}
