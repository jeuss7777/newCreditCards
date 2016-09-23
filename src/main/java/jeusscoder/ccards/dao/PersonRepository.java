package jeusscoder.ccards.dao;

import java.math.BigDecimal;
import java.util.Collection;

import jeusscoder.ccards.entity.Person;
import jeusscoder.ccards.entity.Operation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jeusscoder.ccards.dao.PersonRepositoryCustom;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>, PersonRepositoryCustom{

	Page<Person> findAll(Pageable pageable);

    //Collection<Person> findByCreditCardNumber(String number);

    //Collection<Person> findByCreditCardOperationsAmountGreaterThanEqualOrderByNameAsc(BigDecimal amount);

    @Query("select p from Person p where p.name like %?1%")
    Collection<Person> findByNameContains(String name);
}