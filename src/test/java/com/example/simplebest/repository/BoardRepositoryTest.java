package com.example.simplebest.repository;

import com.example.simplebest.SimplebestApplication;
import com.example.simplebest.domain.BoardEntity;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(classes = SimplebestApplication.class)
@Transactional
@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void 게시글_저장(){
        String title = "테스트 제목";
        String content = "테스트 내용";
        String writer = "테스트 작성자";
        boardRepository.save(BoardEntity.builder()
                .memberId(1L)
                .title(title)
                .content(content)
                .writer(writer)
                .views(0)
                .report(0)
                .status(1)
                .build()
        );
    }
}