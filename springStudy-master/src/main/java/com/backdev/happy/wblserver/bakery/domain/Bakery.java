package com.backdev.happy.wblserver.bakery.domain;

import com.backdev.happy.wblserver.global.config.security.UserRole;
import com.backdev.happy.wblserver.member.domain.Member;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Getter
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA에서는 프록시 객체가 필요함 -> 기본 생성자 하나가 반드시 있어야 함
@Table(name = "bakeries")
@Entity
public class Bakery {

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //member_id 외래키
    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private Member member;

    //name
    @Column(nullable = false, length = 100)
    private String name;

    //img
    @Column(nullable = false, length = 500)
    private String img;

    //address
    @Column(nullable = false, length = 200)
    private String address;

    //introduction
    @Column(nullable = false, length = 200)
    private String introduction;

    //create_time
    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    //update_time
    @UpdateTimestamp
    @Column(name = "update_time")
    private Date  updateTime;

    @Builder
    public Bakery(Long memberId, String name , String img, String address, String introduction){
        this.member = new Member(memberId);
        this.name = name;
        this.img = img;
        this.address = address;
        this.introduction = introduction;
    }
}
