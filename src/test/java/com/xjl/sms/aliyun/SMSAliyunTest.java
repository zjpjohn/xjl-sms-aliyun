package com.xjl.sms.aliyun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-*.xml"})
public class SMSAliyunTest {
	@Autowired
	private SMSAliyun smsAliyun;
	@Test
	public void sendVercode(){
		this.smsAliyun.sendVercode("13815892591");
	}
}
