package com.backdev.happy.wblserver.bakery.dto;

import com.backdev.happy.wblserver.bakery.domain.Bakery;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class BakeryDto {
    @Getter
    @NoArgsConstructor
    public static class addBakeryRequest{
        private Long id;
        private Long member_id;
        private String name;
        private String img;
        private String address;
        private String introduction;


        @Builder
        public addBakeryRequest( Long member_id, String name, String img, String address, String introduction){
            this.member_id = member_id;
            this.name = name;
            this.img = img;
            this.address = address;
            this.introduction = introduction;
        }

        public Bakery toEntity(){
            return Bakery.builder()
                    .member_id(member_id)
                    .name(name)
                    .img(img)
                    .address(address)
                    .introduction(introduction);
        }
    }

    @Getter
    @NoArgsConstructor
    public static class deleteBakeryRequest{
        private Long id;

        @Builder
        public deleteBakeryRequest(Long id){
            this.id = id;
        }
    }

    @Getter
    @NoArgsConstructor
    public static class soldoutBakeryRequest{
        private Long id;

        @Builder
        public soldoutBakeryRequest(Long id){
            this.id = id;
        }
    }

}
