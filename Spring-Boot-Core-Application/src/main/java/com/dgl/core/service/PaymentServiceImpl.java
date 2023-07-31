package com.dgl.core.service;

import com.dgl.core.dao.PaymentDao;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentDao dao;

    public PaymentDao getPaymentDao()
    {
        return dao;
    }

    public void setPaymentDao(PaymentDao dao){
        this.dao = dao;
    }


}
