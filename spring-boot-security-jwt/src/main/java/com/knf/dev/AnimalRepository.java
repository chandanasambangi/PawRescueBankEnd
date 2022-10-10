package com.knf.dev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.knf.dev.Animal;
//import net.javaguides.springboot.model.Employee;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

}
