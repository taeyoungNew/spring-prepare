package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// 테스트클래스는 main메서드가 없다 이유는 Junit이 따로 가지고 있기 때문
class CalculatorTest {
	// 아래의 메서드를 실행시키기위해서는 @Test데코를 붙여줘야한다.
//	@Test
//	@DisplayName("테스트임")
//	void test() {
//		String test = "테스트";
//		System.out.println("result = " + test);
//	}
	
	
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        // 동작을 자세하게 검사하는 메서드
        // 첫번째 인자는 예상값을 넣어주고 두번째 인자는 위의 테스트코드의 결과값을 넣어준다.
        Assertions.assertEquals(10, result);
    }
//
//    @Test
//    @DisplayName("나누기 테스트")
//    void test2() {
//        Calculator calculator = new Calculator();
//        Double result = calculator.operate(8, "/", 2);
//        System.out.println("result = " + result);
//
//        Assertions.assertEquals(4, result);
//    }
}