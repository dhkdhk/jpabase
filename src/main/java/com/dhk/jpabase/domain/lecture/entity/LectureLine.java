package com.dhk.jpabase.domain.lecture.entity;

import lombok.*;

import javax.persistence.Embeddable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class LectureLine {

    private String lectureTitle;
    private String lectureContents;

}
