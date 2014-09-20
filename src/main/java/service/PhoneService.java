/*
 * (c) КАЦИТ, 2013. Все права защищены.
 */
package service;

import model.Phone;

import java.util.Collection;

/**
 * @author Константин Тагинцев
 * @created 09.07.13 17:58
 */

public interface PhoneService {

    Boolean add(Phone phone);

    Collection<Phone> getPhones(String search);

    void delete(Phone phone);

}
