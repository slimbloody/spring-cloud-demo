package slimcomp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import slimcomp.entity.CommonResult;
import slimcomp.entity.Payment;

@Slf4j
@RestController
@RequestMapping(value = "/consumer")
public class OrderController {
	public static final String PAYMENT_URL = "http://CLOUD-PROVIDER";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/payment/create")
	public CommonResult<Payment> create(Payment payment) {
		String reqUrl = PAYMENT_URL + "/payment/create";
		log.info("reqUrl: " + reqUrl);
		return restTemplate.postForObject(
			reqUrl,
			payment,
			CommonResult.class
		);
	}

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getById(@PathVariable("id") Long id) {
		String reqUrl = PAYMENT_URL + "/payment/get/" + id;
		log.info("reqUrl: " + reqUrl);
		return restTemplate.getForObject(
			reqUrl,
			CommonResult.class
		);
	}
}
