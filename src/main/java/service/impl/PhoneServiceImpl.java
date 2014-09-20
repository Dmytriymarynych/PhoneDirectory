package service.impl;

import model.Phone;
import model.dao.PhoneDao;
import org.springframework.transaction.annotation.Transactional;
import service.PhoneService;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: k.tagintsev
 * Date: 05.10.13
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public class PhoneServiceImpl implements PhoneService {

    private PhoneDao phoneDao;

    public PhoneDao getPhoneDao() {
        return phoneDao;
    }

    public void setPhoneDao(PhoneDao phonePhoneDao) {
        this.phoneDao = phonePhoneDao;
    }

    @Transactional
    @Override
    public Boolean add(Phone entity) {
        List<Phone> duplicate = phoneDao.findByPhone(entity.getName(), entity.getPhone());
        if (duplicate.isEmpty()) {
            phoneDao.add(entity);
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public Collection<Phone> getPhones(String search) {
        return phoneDao.getPhones(search);
    }

    @Transactional
    @Override
    public void delete(Phone entity) {
        phoneDao.delete(entity);
    }

}
