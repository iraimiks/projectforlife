package lv.raimonds.projectforlife;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class SalesOrderController {
    private List<SalesOrder> salesOrdersList = new ArrayList<>();

    public SalesOrderController() {
        salesOrdersList.addAll(List.of(
                new SalesOrder("Orange", "1dd", 0.3f),
                new SalesOrder("Tomato", "2da", 0.15f),
                new SalesOrder("Dill", "2da", 0.15f)
        ));
    }

    @GetMapping("/salesOrders")
    Iterable<SalesOrder> getSalesOrders() {
        return salesOrdersList;
    }
}
