package slimcomp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import slimcomp.entity.CommonResult;
import slimcomp.entity.Payment;
import slimcomp.service.PaymentService;

@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@GetMapping(value = "/")
	public String getByIdTest() {
		return "good";
	}

	@PostMapping(value = "/create")
	public CommonResult create(Payment payment) {
		int res = paymentService.create(payment);
		log.info("insert: " + res);

		if (res > 0) {
			return new CommonResult(200, "insert done", res);
		}
		else {
			return new CommonResult(500, "insert failed", res);
		}
	}

	@GetMapping(value = "/get/{id}")
	public CommonResult getById(@PathVariable("id") Long id) {
		Payment res = paymentService.getById(id);
		log.info("get: " + res);

		if (res != null) {
			return new CommonResult(200, "get done", res);
		}
		else {
			return new CommonResult(500, "get failed", res);
		}
	}
}
