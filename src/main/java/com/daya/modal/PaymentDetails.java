package com.daya.modal;

import com.daya.domain.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails {

    private String paymentId;
    private String razerpayPaymentLinkId;
    private String razerpayPaymentLinkRefId;
    private String razerpayPaymentLinkStatus;
    private String razerpayPaymentIdZWSP;
    private PaymentStatus status;
}
