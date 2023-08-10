package com.example.springboot.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloResponseDtoTest {
    @Test
    void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertEquals(dto.getName(), name);
        assertEquals(dto.getAmount(), amount);
    }
}