package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.beans.Cart;
import pl.coderslab.beans.CartItem;
import pl.coderslab.beans.Product;
import pl.coderslab.beans.ProductDAO;

import java.util.List;

@Controller
public class CartController {
    @Autowired//po stronie tego atrybutu który coś potrzebuje
    private Cart cart;
    @Autowired
    private ProductDAO productDAO;

    //    @RequestMapping("/addtocart")
//    @ResponseBody
//    public String addtocart() {
//        Random rand = new Random();
//        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
//        return "addtocart";
//    }
    @GetMapping("/addtocart/{id}/{quantity}")
    @ResponseBody
    public String addtocart(Model model, @PathVariable Long id, @PathVariable int quantity) {
        model.addAttribute("id", id);
        model.addAttribute("quantity", quantity);
        List<Product> productList = productDAO.getList();

        if (id > 0 && quantity > 0) {
            for (Product product : productList) {
                boolean found = false;
                if (product.getId()==id) {
                    List<CartItem> items = cart.getCartItems();
                    for (CartItem item : items) {
                        if (item.getProduct().getId() == id) {
                            item.setQuantity(item.getQuantity() + quantity);
                            found = true;
                            return "Updated";
                        }

                    }if (!found) {
                        CartItem cartItem = new CartItem(quantity, product);
                        cart.addToCart(cartItem);
                        return "Added";
                    }

                }
            }
        }
        return "unavailable";
    }

//    @PostMapping("/addtocart")
//    @ResponseBody
//    public String addtocart() {
//        List<Product> productList = productDAO.getList();
//
//        return "addtocart";
//    }
//    Zmodyfikuj metodę `/addtocart` tak by przyjmowała przyjmowała z `GET` parametry `id` oraz `quantity`,
// metoda ma pobrać z listy odpowiedni produkt i dodać określoną jego ilość do koszyka.

    @RequestMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }


//    W koszyku jest <ilość pozycji> pozycji.
//W koszyku jest <ilość produktów> produktów.
//Wartość koszyka to: <wartość produktów>.

}
//#### Zadanie 2 - rozwiązywane z wykładowcą
//        1. Utwórz klasę o nazwie `Product` - klasa ma zawierać właściwości:
//        - typu String o nazwie `name`.
//        - typu double o nazwie `price`.
//        2. Utwórz klasę o nazwie `CartItem` - klasa ma zawierać właściwości:
//        - typu Integer o nazwie `quantity`.
//        - typu Product o nazwie `product`.
//        3. Utwórz klasę o nazwie `Cart` - klasa ma zawierać właściwość:
//        `private List<CartItem> cartItems;`
//        4. Ustal dla klasy `Cart` zasięg typu sesyjnego:
//        ```java
//@Component
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//```
//        5. Utwórz kontroler `CartController`, wstrzyknij komponent typu `Cart`.
//        6. Utwórz akcję dostępną pod adresem `/addtocart` :
//        ````java
//@RequestMapping("/addtocart")
//@ResponseBody
//public String addtocart() {
//        Random rand = new Random();
//        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
//        return "addtocart";
//}
//````
//        Utwórz w klasach odpowiednie konstruktory - tak by kod działał poprawnie.
//
//        7. Utwórz akcję dostępną pod adresem `/cart` w której wyświetlisz wszystkie produkty z koszyka.
