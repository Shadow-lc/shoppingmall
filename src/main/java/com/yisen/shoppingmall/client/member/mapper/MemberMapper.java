package com.yisen.shoppingmall.client.member.mapper;

import com.yisen.shoppingmall.client.member.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {
    int addMember(Member member);
    Member queryNameandPass(@Param("nick") String nick, @Param("password") String password);
    int updateMember(Member member);
    List<Member> queryUserInfo();
    Member queryMemberById(@Param("id") String id);
    //当用户的积分达到一个额度时，自动提升等级
    int addcredit(Member member);
    int  upgrade(Member member);
}
