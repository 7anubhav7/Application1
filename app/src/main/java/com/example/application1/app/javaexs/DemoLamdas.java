package com.example.application1.app.javaexs;

public class DemoLamdas {
    public static void main(String[] args){

        //before
        MessageImpl message=new MessageImpl();
        message.sendMessage();

        //after
        IMessage iMessage=() -> {
            System.out.println("sending message from lamda");
        };
        iMessage.sendMessage();

        //before
        OnClickimpl impl= new OnClickimpl();
        impl.onClick(12);

        //after
        OnClickListener onClickListener= (v) -> {
            System.out.println("handling click");
        };
        onClickListener.onClick(122);

        }
    }