package sakura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakura.dao.SalesOrderDao;
import sakura.entity.SalesOrder;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderDao salesOrderDao;

    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderDao.addSalesOrder(salesOrder);
    }
}
