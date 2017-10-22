package model.dao.impl;

import model.Phone;
import model.dao.PhoneDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: d.marynch
 * Date: 15.10.17
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
public class PhoneDaoImpl implements PhoneDao {

    @PersistenceContext
    private EntityManager emf;

    @Override
    public void add(Phone phone) {
        emf.persist(phone);
    }

    @Override
    public void delete(Phone phone) {
        emf.remove(emf.getReference(Phone.class, phone.getId()));
    }

    @Override
    public Collection<Phone> getPhones(String search) {
        if (null == search || search.trim().isEmpty()) {
            return emf.createQuery(
                    "select c from Phone c")
                    .getResultList();
        }
        return emf.createQuery(
                "select c from Phone c where c.name like :search")
                .setParameter("search", search.trim() + "%")
                .getResultList();
    }

    public List<Phone> findByPhone(String name, String phone) {
        return emf.createQuery(
                "select c from Phone c where c.name = :name and c.phone = :phone")
                .setParameter("name", name)
                .setParameter("phone", phone)
                .getResultList();
    }
}
