package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {

    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    // 이후 코드 작성을 편리하게 하기 위해 Todo Entity 를 파라미터로 받는 생성자를 추가
    public TodoResponse (TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();

        // todo Entity 에는 없는 내용은 따로 작성
        this.url = "http://localhost:8080/" + this.id;
    }
}
