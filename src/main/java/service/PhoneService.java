/*
 * (c) КАЦИТ, 2013. Все права защищены.
 */
package service;

import model.Phone;

import java.util.Collection;

/**
 * @author Дмитрий Маринич
 * @created 09.07.17 10:27
 */

public interface PhoneService {

    Boolean add(Phone phone);

    Collection<Phone> getPhones(String search);

    void delete(Phone phone);

}
