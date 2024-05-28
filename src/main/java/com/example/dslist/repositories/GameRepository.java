package com.example.dslist.repositories;

import com.example.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// dentro do <> tem que passar a entidade e o tipo do id da entidade
public interface GameRepository extends JpaRepository<Game, Long> {

}
