package hello.aop.internalcall;

import hello.aop.internalcall.aop.CallLogAspect;
import org.aspectj.lang.annotation.Aspect;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@Import(CallLogAspect.class)
@SpringBootTest(properties = "spring.main.allow-circular-references=true")
class CallServiceV1Test {

	@Autowired
	CallServiceV1 callServiceV1;

	@Test
	void external() {
		callServiceV1.external();
	}
}