package dev.study.exam;

import java.util.List;

public record Order(
        int orderId,
        String customerName,
        List<Product> products,
        double totalAmount
) {
}
