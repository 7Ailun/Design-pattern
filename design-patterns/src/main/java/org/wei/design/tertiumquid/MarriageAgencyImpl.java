package org.wei.design.tertiumquid;

import java.util.ArrayList;
import java.util.List;

public class MarriageAgencyImpl implements MarriageAgency{
    List<Person> personList = new ArrayList<>();
    @Override
    public void register(Person person) {
        personList.add(person);
    }

    @Override
    public void pair(Person person) {
        for (Person p : personList) {
            if(p.getAge() == person.getRequestAge() && !p.getSex().equals(person.getSex())) {
                System.out.println("将" + person.getName() + "与" + p.getName() + " 送人洞房！");
            }
        }
    }
}
