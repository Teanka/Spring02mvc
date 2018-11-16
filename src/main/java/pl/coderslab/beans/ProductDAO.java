package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAO {

    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("butter", 7.50, 1L));
        productList.add(new Product("bread", 5, 2L));
        productList.add(new Product("cheese", 4.50, 3L));
        productList.add(new Product("milk", 2.80, 4L));
        return productList;
    }

}
//2. Utwórz komponent `ProduktDao`, a w niej metodę `getList()` , która będzie zwracała listę produktów, które można dodać do koszyka.
//3. Utwórz produkty wpisując własne dane, wstrzyknij komponent do kontrolera.
//3. Zmodyfikuj metodę `/addtocart` tak by przyjmowała przyjmowała z `GET` parametry `id` oraz `quantity`, metoda ma pobrać z listy odpowiedni produkt i dodać określoną jego ilość do koszyka.
//4. Jeżeli produkt już występuje w koszyku jego ilość ma się zwiększyć.
//5. Dopisz w akcji dostępnej pod adresem `/cart` podsumowanie koszyka w postaci:
//            ````
//W koszyku jest <ilość pozycji> pozycji.
//W koszyku jest <ilość produktów> produktów.
//Wartość koszyka to: <wartość produktów>.