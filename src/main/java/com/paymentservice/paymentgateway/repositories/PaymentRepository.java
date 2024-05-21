package com.paymentservice.paymentgateway.repositories;

import com.paymentservice.paymentgateway.models.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<PaymentDetails,Long> {
    Optional<PaymentDetails> findByOrderId(String orderId);
}
