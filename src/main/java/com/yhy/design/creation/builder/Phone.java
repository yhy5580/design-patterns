package com.yhy.design.creation.builder;

import lombok.*;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Phone {
    protected String cpu;
    protected String memory;
    protected String disk;
    protected String camera;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
