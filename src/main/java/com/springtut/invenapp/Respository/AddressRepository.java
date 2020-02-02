package com.springtut.invenapp.Respository;

import com.springtut.invenapp.dao.ImplClasses.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
