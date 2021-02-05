package slimcomp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import slimcomp.entity.Payment;

@Mapper
public interface PaymentDao {
	public int create(Payment payment);

	public Payment getById(@Param("id") Long id);
}
