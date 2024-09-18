package com.ms.hoopi.repository;

import com.ms.hoopi.model.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, String> {

    @Query("SELECT b FROM Board b WHERE b.boardId = :boardId")
    Board findBoardByBoardId(String boardId);
}
