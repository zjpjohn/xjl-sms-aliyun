package com.xjl.sms.aliyun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xjl.notification.sms.SMS;
import com.xjl.notification.verifyCode.VerifyCode;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-*.xml"})
public class SMSAliyunTest {
	@Autowired
	private SMS sms;
	@Autowired
	private VerifyCode verifyCode;
	@Test
	public void sendVercode(){
		String content = this.verifyCode.generate("13815892591", 1) ;
		this.sms.sendVerifyCode("13815892591", content);
	}
}
