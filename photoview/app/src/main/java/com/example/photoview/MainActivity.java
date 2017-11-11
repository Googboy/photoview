package com.example.photoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_photo;
    private PhotoViewAttacher attacher;
    private ImageLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_photo = (ImageView) findViewById(R.id.iv_photo);
        attacher = new PhotoViewAttacher(iv_photo);
        //加载本地图片 缩放处理
//        try {
//            InputStream is = getAssets().open("1.jpg");
//            Bitmap bm = BitmapFactory.decodeStream(is);
//            iv_photo.setImageBitmap(bm);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //加载网络图片
        loader = ImageLoader.getInstance();
        loader.displayImage("http://image.tianjimedia.com/uploadImages/2012/067/N80N0GUA36N0.jpg",iv_photo);
    }
}
