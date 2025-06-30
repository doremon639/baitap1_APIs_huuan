package com.example.apis;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);

        // URL ảnh từ Internet
        String imageUrl = "https://picsum.photos/400";

        // Dùng Glide để load ảnh
        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.loading)      // Ảnh hiển thị khi đang tải
                .error(R.drawable.error_image)        // Ảnh hiển thị khi lỗi tải
                .into(imageView);
    }
}
