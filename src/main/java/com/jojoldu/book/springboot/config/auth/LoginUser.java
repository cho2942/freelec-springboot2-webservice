package com.jojoldu.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //이 어노테이션이 생성될 수 있는 위치(PARAMETER : 메소드의 파라미터로 선언된 객체에만 사용 가능)
@Retention(RetentionPolicy.RUNTIME) //런타임 시에도 메모리에 남아있음(SOURCE, CLASS 있음)
public @interface LoginUser {
}
