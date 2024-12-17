package com.example.monumentos.service;

import com.example.monumentos.error.MonumentNotFoundException;
import com.example.monumentos.model.Monument;
import com.example.monumentos.model.MonumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonumentService {
    private final MonumentRepository monumentRepository;

    public List<Monument> getAll() {
        List<Monument> result = monumentRepository.getAll();
        if (result.isEmpty())
            throw new MonumentNotFoundException();
        return result;
    }

    public List<Monument> query(double maxPrice, String sortDirection) {
        List<Monument> result = monumentRepository.query(maxPrice, sortDirection);
        if (result.isEmpty())
            throw new MonumentNotFoundException();
        return result;
    }

    public Monument get(Long id) {
        return monumentRepository.get(id)
                .orElseThrow(() -> new MonumentNotFoundException(id));
    }

    public Monument add(Monument monument) {
        return monumentRepository.add(monument);
    }

    public Monument edit(Long id, Monument newValue) {
        return monumentRepository.edit(id, newValue)
                .orElseThrow(() -> new MonumentNotFoundException(id));
    }

    public void delete(Long id) {
        monumentRepository.delete(id);
    }

}
//    public Optional<Product> edit(Long id, Product newValue) {
//        return Optional.ofNullable(products.computeIfPresent(id, (k, v) -> {
//            v.setName(newValue.getName());
//            v.setPrice(newValue.getPrice());
//            return v;
//        }));
//    }

//    public List<Product> query(double maxPrice, String sortDirection) {
//        List<Product> data = new ArrayList<>(products.values());
//        List<Product> result;
//
//        if (maxPrice < 0) {
//            result = data;
//        } else {
//            result = data
//                    .stream()
//                    .filter(p -> p.getPrice() <= maxPrice)
//                    .collect(Collectors.toCollection(ArrayList::new));
//        }
//
//        if (sortDirection.equalsIgnoreCase("asc"))
//            result.sort(Comparator.comparing(Product::getName));
//        else if (sortDirection.equalsIgnoreCase("desc"))
//            result.sort(Comparator.comparing(Product::getName).reversed());
//
//        return Collections.unmodifiableList(result);
//    }