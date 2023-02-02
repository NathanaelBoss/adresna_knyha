package com.example.demo1.collection;

import com.example.demo1.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionAddressBook implements AddressBook{


    @Override
    public void save(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    ObservableList<Person> personList = FXCollections.observableArrayList();

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ObservableList<Person> personList) {
        this.personList = personList;
    }

    public void print(){
        int number = 0;

        for (Person p: personList){
            number++;
            System.out.println(number + "pip" + p.getPip() + " phone " + p.getPhone());
        }
    }

    public void fillTestData(){
        personList.add(new Person("Anna","097111111111"));
        personList.add(new Person("Borys","097222222222"));
        personList.add(new Person("Katya","097333333333"));
        personList.add(new Person("Taras","097444444444"));
        personList.add(new Person("Taras","097555555555"));
        personList.add(new Person("Artur","097666666666"));
    }
}
