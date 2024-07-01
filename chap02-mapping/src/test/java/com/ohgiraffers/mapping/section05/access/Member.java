package com.ohgiraffers.mapping.section05.access;

import com.ohgiraffers.mapping.section04.enumtype.Roletype;
import jakarta.persistence.*;

import java.util.Date;


@Entity(name = "member_section05")
@Table(name = "tbl_member_section05")
public class Member {

    @Id
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;


    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nick_name")
    private String nickName;

    public Member() {
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
