package com.jpa.queryprojectionjpa.repository;

//import com.jpa.queryprojectionjpa.dto.AuthorSummaryDTO;
import com.jpa.queryprojectionjpa.dto.AuthorView;
import com.jpa.queryprojectionjpa.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    //@Query("SELECT new com.jpa.queryprojectionjpa.dto.AuthorSummaryDTO(a.firstName, a.lastName) FROM Author a WHERE a.firstName = :firstName")
    //List<AuthorSummaryDTO> findViewByFirstName(String firstName);
    AuthorView findViewByFirstName(String firstName);
}
