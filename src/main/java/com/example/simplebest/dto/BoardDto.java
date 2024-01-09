package com.example.simplebest.dto;

import com.example.simplebest.domain.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardDto {
    private Long boardId;
    private Long memberId;
    private String title;
    private String content;
    private String writer;
    private int views;
    private int report;
    private int status;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    public BoardEntity toEntity(){
        return BoardEntity.builder()
                .memberId(memberId)
                .title(title)
                .content(content)
                .writer(writer)
                .views(views)
                .report(report)
                .status(status)
                .build();
    }

    @Builder
    public BoardDto(Long memberId, String title, String content, String writer, int views, int report, int status, LocalDateTime createDate, LocalDateTime modifiedDate) {
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.views = views;
        this.report = report;
        this.status = status;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }
}