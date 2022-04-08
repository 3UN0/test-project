package com.sey.testproject.jacocosample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaJacocoTest {
    
    private JavaJacoco javaJacoco = new JavaJacoco();
    
    @Test
    public void jacocoTestMethod(){
        String str = javaJacoco.hello("하");
        assertEquals(str, "이");
    }

}