package ru.itvitality.sbrf.cu.j2003.l03.generics.bounds;

import ru.itvitality.sbrf.cu.j2003.l03.generics.bounds.entries.Animal;
import ru.itvitality.sbrf.cu.j2003.l03.generics.bounds.entries.Cat;

import java.util.ArrayList;
import java.util.List;


/**
 * @author sergey
 * created on 23.11.18.
 */
public class GenericsInheritance {

    public static void main(String[] args) {

        Animal cat = new Cat();

        List<Cat> catList = new ArrayList<>();
        //List<Animal> animalList = catList; //ошибка
    }
}
