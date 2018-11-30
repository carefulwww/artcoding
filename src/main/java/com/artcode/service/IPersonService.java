package com.artcode.service;

import java.util.List;

import com.artcode.model.Person;

public interface IPersonService {

    /**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}