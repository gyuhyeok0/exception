package com.oghgiraffers.section03.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends  SuperClass{

    //예외 없이 오버라이딩 할 수 있다.
//    @Override
//    public void method(){} // 가능

    //같은 예외를 던저주는 구문으로 오버라이딩 해야한다.
//    @Override
//    public void method() throws IOException{}            //가능

//    @Override
//    public void method() throws Exception {}   //    불가능

    //하지만 부모의 예외처리 클래스 보다 더 하위에 있는 예외(즉 구체적인 예외상황) 인 경우 가능하다
    @Override
    public void method() throws FileNotFoundException{} //가능
}
