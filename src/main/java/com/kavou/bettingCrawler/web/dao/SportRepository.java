package com.kavou.bettingCrawler.web.dao;

import com.kavou.bettingCrawler.web.entity.Bettor;
import com.kavou.bettingCrawler.web.entity.Event;
import com.kavou.bettingCrawler.web.entity.Game;
import com.kavou.bettingCrawler.web.entity.Sport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, Integer> {

    boolean existsByNameAndBettor(String name, Bettor bettor);

    Sport getOneByNameAndBettor(String name, Bettor bettor);
    Sport getOneById(int sportId);

    Page<Sport> findAllByBettor(Pageable page, Bettor bettor);
}
