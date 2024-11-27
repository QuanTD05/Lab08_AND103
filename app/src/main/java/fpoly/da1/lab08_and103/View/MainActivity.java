package fpoly.da1.lab08_and103.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;



import java.util.ArrayList;

import fpoly.da1.lab08_and103.Adapter.product_Adapter;
import fpoly.da1.lab08_and103.Models.Product;
import fpoly.da1.lab08_and103.R;
import fpoly.da1.lab08_and103.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<Product> list = new ArrayList<>();
    private product_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list.add(new Product("1", "Nội thất", "Sofa", "Fresh and juicy apple", 4.5, 2.99, R.drawable.g2));
        list.add(new Product("2", "Nội thất", "Ghế", "Ripe banana", 4.2, 1.99, R.drawable.g3));
        list.add(new Product("3", "Nội thất", "Bàn", "Sweet and tangy orange", 4.0, 3.49, R.drawable.g4));
        list.add(new Product("4", "Nội thất", "Sofa", "Delicious grapes", 4.3, 4.99, R.drawable.g6));
        list.add(new Product("5", "Nội thất", "Sofa", "Fresh and juicy apple", 4.5, 2.99, R.drawable.h23));
        list.add(new Product("6", "Nội thất", "Ghế", "Ripe banana", 4.2, 1.99, R.drawable.h24));
        list.add(new Product("7", "Nội thất", "Bàn", "Sweet and tangy orange", 4.0, 3.49, R.drawable.g4));
        list.add(new Product("8", "Nội thất", "Sofa", "Delicious grapes", 4.3, 4.99, R.drawable.g6));
        adapter = new product_Adapter(list, this);
        binding.rcvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rcvProduct.setAdapter(adapter);

    }
}