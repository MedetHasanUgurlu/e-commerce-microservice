package org.medron.commonservice.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResult<T> {
    private T data;
    private String message;
    private LocalDateTime localDateTime;

    public ExceptionResult(T data,String message){
        this.data = data;
        this.message = message;
    }

}
