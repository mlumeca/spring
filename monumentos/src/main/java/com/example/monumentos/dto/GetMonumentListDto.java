package com.example.monumentos.dto;

public record GetMonumentListDto(
        Long count,
        List<Product> items
) {
    public static GetProductListDto of (List<Product> items){
            return new GetProductListDto(
                (long) intems.size(),
                items
            );
    }


}



