package com.qyjy.ourwebsite.dao;

import com.qyjy.ourwebsite.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoDAO extends JpaRepository<Info, Integer> {

    Info findByTitle(String title);

}
