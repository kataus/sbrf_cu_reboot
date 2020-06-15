package ru.sbrf.example.beanslifecycledemo.domain;

public class FriendPhoneNumber extends PhoneNumber {
    @Override
    public String getOwnerName() {
        return "Друг";
    }
}
