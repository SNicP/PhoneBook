package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @BeforeEach
    public void fill() {
        //given
        phoneBook.add("Николай" , "111222333");
        phoneBook.add("Иван" , "222333444");
        phoneBook.add("Наталья" , "333444555");
    }

    @Test
    public void addTest(){
        //given
        int numberOfContactsExpected = 4;

        //when
        int numberOfContactsActual = phoneBook.add("Анастасия" , "555666777");

        //then
        Assertions.assertEquals(numberOfContactsExpected, numberOfContactsActual);
    }

    @Test
    public void findByNumberTest(){
        //given
        String stringExpected = "Иван";

        //when
        String stringActual = phoneBook.findByNumber("222333444");

        //then
        Assertions.assertEquals(stringExpected, stringActual);
    }


}