package com.pm.patientservice.grpc;

import billing.BillingServiceGrpc.BillingServiceBlockingStub;
import billing.BillingServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceGrpcClient {

    private final BillingServiceGrpc.BillingServiceBlockingstub blockingstub;
}
