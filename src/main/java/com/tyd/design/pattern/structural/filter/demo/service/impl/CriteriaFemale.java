package com.tyd.design.pattern.structural.filter.demo.service.impl;

import com.tyd.design.pattern.structural.filter.demo.service.Person;
import com.tyd.design.pattern.structural.filter.demo.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
