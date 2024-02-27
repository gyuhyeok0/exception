package com.oghgiraffers.section02.userexception;

import com.oghgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.oghgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.oghgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application03 {

    public static void main(String[] args) {

        // 수업목표. multi-catch

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, 10000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println(e.getClass() + " 발생!!");
            System.out.println( e.getMessage());

        } catch (NotEnoughMoneyException e) {

            /*필기.
                예외 클래스명, 예외 발생 취리, 예외 메세지 등을 빨간 글씨로 로그 형태로 출려해주는 기능
             */

            e.printStackTrace();


        }
    }
}
