package model.dao;

import model.Phone;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: d.marynych
 * Date: 12.10.17
 * Time: 12:52
 * To change this template use File | Settings | File Templates.
 */
public interface PhoneDao {

    void add(Phone entity);

    void delete(Phone entity);

    Collection<Phone> getPhones(String search);

    public List findByPhone(String name, String phone);

}
