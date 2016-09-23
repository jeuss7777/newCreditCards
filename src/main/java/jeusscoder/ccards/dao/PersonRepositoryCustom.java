package jeusscoder.ccards.dao;

import jeusscoder.ccards.entity.Person;

public interface PersonRepositoryCustom {

    Person createWithCard(String name, String number);

}
