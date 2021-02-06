package slimcomp.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import slimcomp.entity.Payment;

public interface PaymentService {
	public int create(Payment payment);

	public Payment getById(@Param("id") Long id);
}
