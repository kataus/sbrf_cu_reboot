package ru.itvitality.sbrf.cu.atm.exceptions;

public class ATMException extends RuntimeException {
    public String getSbrfError() {
        return "СБ Ошибка";
    }
}
