package com.kavou.bettingCrawler.web.dao;

import com.kavou.bettingCrawler.web.entity.Bettor;
import com.kavou.bettingCrawler.web.entity.Event;
import com.kavou.bettingCrawler.web.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Integer> {

    boolean existsByOpponentsAndEvent(String opponents, Event event);
    Game getOneByOpponentsAndEvent(String opponents, Event event);
}