package com.rocket.quizapp.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    public Integer id;
    private String response;

}
