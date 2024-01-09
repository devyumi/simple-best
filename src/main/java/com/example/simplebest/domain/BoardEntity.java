package com.example.simplebest.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "board")
@Entity
public class BoardEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "writer", nullable = false)
    private String writer;

    @Column(name = "views", nullable = false)
    private int views;

    @Column(name = "report", nullable = false)
    private int report;

    @Column(name = "status", nullable = false)
    private int status;

    @Builder
    public BoardEntity(Long memberId, String title, String content, String writer, int views, int report, int status) {
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.views = views;
        this.report = report;
        this.status = status;
    }
}