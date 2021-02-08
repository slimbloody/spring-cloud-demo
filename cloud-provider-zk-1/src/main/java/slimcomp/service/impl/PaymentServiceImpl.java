package slimcomp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slimcomp.dao.PaymentDao;
import slimcomp.entity.Payment;
import slimcomp.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getById(Long id) {
		return paymentDao.getById(id);
	}
}
