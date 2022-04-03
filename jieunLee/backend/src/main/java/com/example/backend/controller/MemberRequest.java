package com.example.backend.controller;

import lombok.Data;

@Data
public class MemberRequest {
    private Long memberNo;
    private String memberName;
    private String memberId;
    private String password;

    public MemberRequest (Long memberNo, String memberName, String memberId, String password) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.memberId = memberId;
        this.password = password;
    }


}
