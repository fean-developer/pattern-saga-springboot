package br.com.microservices.orchestrated.productvalidationservice.core.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProducts {

    private Product products;
    private int quantity;

}
