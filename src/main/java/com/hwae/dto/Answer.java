package com.hwae.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;
    private Long userId;
    private String answerContent;
    private String answerName;	//디폴트 : 사용자 지정, 체크 박스 체크: 닉네임으로 설정됨.
}
