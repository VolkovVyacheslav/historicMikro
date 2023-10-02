package com.volkov.historicmikro.repo;

import com.volkov.historicmikro.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {
}
