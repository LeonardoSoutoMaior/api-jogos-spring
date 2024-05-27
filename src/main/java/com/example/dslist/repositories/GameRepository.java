package com.example.dslist.repositories;

import com.example.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> { // dentro do <> tem que passar a entidade e o tipo do id da entidade
}
