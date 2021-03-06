package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    // 컬럼명을 todoOrder 로 잡는 것. order 가 h2 DB의 예약어기 때문
    @Column(name = "todoOrder")
    private Long order;

    @Column(nullable = false)
    private Boolean completed;

}
